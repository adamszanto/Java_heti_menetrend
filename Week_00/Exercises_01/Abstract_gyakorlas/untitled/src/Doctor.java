enum MEDICALFIELDS {Cardiology, Dentistry, Dermatology, Surgery}
public class Doctor extends HospitalEmployee {
    private boolean isProfessor;
    private MEDICALFIELDS medField;

    public Doctor(String name, Integer hourlyWage, boolean isProfessor, MEDICALFIELDS medfield) {
        super(name, hourlyWage);
        this.isProfessor = isProfessor;
        this.medField = medfield;
    }



    @Override
    public String toString() {
        return "Dr. " + getName() +
                ", Salary: $" + getHourlyWage() + " per hour" +
                ", isProfessor=" + isProfessor +
                ", medField=" + medField;
    }
}
