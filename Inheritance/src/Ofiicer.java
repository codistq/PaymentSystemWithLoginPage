public class Ofiicer extends Workers {
    private String department;
    private String shift;

    public Ofiicer(String fullname, String mbno, String email, String department, String shift) {
        super(fullname, mbno, email);
        this.department = department;
        this.shift = shift;
    }

    public String getDepartment(){
        return this.department;
    }
    public void setDepartment(String department){
        this.department = department;
    }
    public String getShift(){
        return this.shift;
    }
    public void setShift(String shift){
        this.shift = shift;
    }
    public  void worked(){
        System.out.println(this.getFullname() + " is worked today ! ");
    }
}
