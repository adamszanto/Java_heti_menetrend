public abstract class HospitalEmployee {
    private final String name;
    private Integer hourlyWage;

    public HospitalEmployee(String name, Integer hourlyWage) {
        this.name = name;
        this.hourlyWage = hourlyWage;
    }

    public String getName() {
        return name;
    }


    public Integer getHourlyWage() {
        return hourlyWage;
    }
}


