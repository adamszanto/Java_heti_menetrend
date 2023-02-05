public class Main {
    public static void main(String[] args) {

        Doctor doctor1 = new Doctor("Fekete Peter", 230, true, MEDICALFIELDS.Cardiology);
        Doctor doctor2 = new Doctor("Kit Kat", 250, false, MEDICALFIELDS.Surgery);

        Nurse nurse1 = new Nurse("Maria Maria",140);
        Nurse nurse2 = new Nurse("Mamma Mia",145);

        Patient patient1 = new Patient("John Doe 1");
        Patient patient2 = new Patient("John Doe 2");

        nurse1.assignToNurse(patient1);
        nurse1.assignToNurse(patient2);

        System.out.println(doctor1.toString());
        System.out.println(doctor2.toString());
    }
}