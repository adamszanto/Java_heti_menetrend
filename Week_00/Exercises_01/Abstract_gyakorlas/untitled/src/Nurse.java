import java.lang.reflect.Array;
import java.util.ArrayList;

public class Nurse extends HospitalEmployee implements PatientAssignToNurse{
    private ArrayList<Patient> patientList = new ArrayList<>();

    public Nurse(String name, Integer hourlyWage) {
        super(name, hourlyWage);
        this.patientList = patientList;
    }

    @Override
    public void assignToNurse(Patient patient) {
        patientList.add(patient);
        System.out.println("Patient " + patient.getName() + " has been assigned to Nurse " + this.getName());
    }

    public Patient get(int num) {
        return patientList.get(num);
    }
}
