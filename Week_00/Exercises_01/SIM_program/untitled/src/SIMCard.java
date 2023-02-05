public class SIMCard implements PINCode {
    static private Integer allSerialNumber = 10000;
    private Integer serialNumber;
    private String pinCode;
    private int activatedTimes;
    private boolean isActive;
    private Integer attemptCounter;
    private Integer attemptLimit;
    private Integer balance;


    public SIMCard() {
        this.serialNumber = allSerialNumber;
        allSerialNumber++;
        this.pinCode = PINCode.nextPIN();
        this.activatedTimes = 0;
        this.isActive = false;
        this.attemptCounter = 0;
        this.attemptLimit = 3;
        this.balance = 10000;
    }

    public String getPinCode() {
        return pinCode;
    }

    public Integer getBalance() {
        return balance;
    }

    public Integer getSerialNumber() {
        return serialNumber;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive() {
        isActive = true;
    }

    public void setAttemptLimit(Integer attemptLimit) {
        this.attemptLimit = attemptLimit;
    }

    public void setNotActive() {
        isActive = false;
    }

    public void activation() {
        if (this.activatedTimes < 1) {
            this.activatedTimes++;
            this.isActive = true;
            System.out.println("This SIM has been activated.");
        } else {
            System.out.println("This SIM Card cannot be activated more times.");
        }
    }


    public boolean checkValid() {
        if (isActive()) {
            if (attemptCounter < attemptLimit) {
                System.out.println("Checked: This SIM is valid.");
                return true;
            } else {
                setNotActive();
                return false;
            }
        } else {
            System.out.println("Checked: This SIM is not valid.");
            return false;
        }
    }

    public void checkPINCode(String prompt) {

        if(isActive()) {
            if(prompt.equals(this.pinCode)) {
                System.out.println("Successful check. PIN code valid.");
            } else {
                attemptCounter++;
                System.out.println("Unsuccessful check. You can attempt " + (attemptLimit-attemptCounter) + " more times." );
            }

            if(!checkValid()) {
                System.out.println("SIM Card is no longer active & blocked permanently.");
            }

        } else {
            System.out.println("SIM Card is no longer active & blocked permanently.");

        }
    }
}
