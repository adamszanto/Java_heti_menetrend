public class Iktatás {

    private String év;
    private String Ügyirat_típusa;
    private String Tb_szám;
    private String email;

    public Iktatás() {
    }

    public void setÉv(String év) {
        this.év = év;
    }

    public void setÜgyirat_típusa(String ügyirat_típusa) {
        Ügyirat_típusa = ügyirat_típusa;
    }

    public void setTb_szám(String tb_szám) {
        Tb_szám = tb_szám;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getÉv() {
        return év;
    }

    public String getÜgyirat_típusa() {
        return Ügyirat_típusa;
    }

    public String getTb_szám() {
        return Tb_szám;
    }

    public String getEmail() {
        return email;
    }
}
