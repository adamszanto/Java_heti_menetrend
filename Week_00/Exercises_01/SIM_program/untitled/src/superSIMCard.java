public class superSIMCard extends SIMCard{
    private String pukCode;

    public superSIMCard() {
        this.pukCode = PUKCode.nextPUK();
    }


    public String getPukCode() {
        return pukCode;
    }

    public void setPukCode(String pukCode) {
        this.pukCode = pukCode;
    }

    public void restore(String prompt) {
        if(this.isActive()) {
            System.out.println("Unable to restore: Super SIM is active.");
        } else {
            if(this.getPukCode().equals(prompt)) {
                this.setActive();
                this.setAttemptLimit(0);
                System.out.println("Restore success: Super SIM is active.");
            } else {
                System.out.println("Invalid PUK code. Try again.");
            }
        }
    }
}
