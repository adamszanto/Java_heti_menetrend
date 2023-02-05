public class Main {
    public static void main(String[] args) {
        SIMCard sim1 = new SIMCard();
        System.out.println("SIM serial is: " + sim1.getSerialNumber());
        System.out.println("SIM pincode is: " + sim1.getPinCode());
        SIMCard sim2 = new SIMCard();
        System.out.println("SIM serial is: " + sim2.getSerialNumber());
        System.out.println("SIM pincode is: " + sim2.getPinCode());
        SIMCard sim3 = new SIMCard();
        System.out.println("SIM serial is: " + sim3.getSerialNumber());
        System.out.println("SIM pincode is: " + sim3.getPinCode());

        sim3.checkValid();
        sim3.activation();
        sim3.checkValid();
        sim3.activation();
        sim3.checkPINCode("1236");
        sim3.checkPINCode("1236");
        sim3.checkPINCode("1236");

        sim1.activation();
        sim1.checkValid();

        superSIMCard supersim1 = new superSIMCard();
        System.out.println("Super SIM serial is: " + supersim1.getSerialNumber());
        System.out.println("Super SIM pincode is: " + supersim1.getPinCode());
        System.out.println("Super SIM pukcode is: " + supersim1.getPukCode());

        supersim1.checkValid();
        supersim1.activation();
        supersim1.checkValid();
        supersim1.checkPINCode("1234");
        supersim1.checkPINCode("1234");
        supersim1.checkPINCode("1234");
        supersim1.setPukCode("1234");
        supersim1.restore("1234");


    }
}