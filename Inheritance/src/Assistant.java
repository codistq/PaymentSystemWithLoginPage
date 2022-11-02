public class Assistant extends Academician  {
    private String officeTime;
    Assistant(String fullname,String mbno, String email, String degree, String title, String officeTime ){
        super(fullname, mbno, email, degree, title);
        this.officeTime = officeTime;
    }
    public String getOfficeTime(){
        return this.officeTime;
    }
    public  void  setOfficeTime(String officeTime){
        this.officeTime = officeTime;
    }
    public void doQuiz(){
        System.out.println(this.getFullname()+ " did quiz ! ");
    }

}
