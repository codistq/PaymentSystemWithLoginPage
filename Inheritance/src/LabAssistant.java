public class LabAssistant extends Assistant {
    LabAssistant(String fullname,String mbno,String email,String degree,String title,String officeTime ){
        super(fullname, mbno, email, degree, title, officeTime);
    }
    public void joinLab(){
        System.out.println(this.getFullname()+ " Joined the Lab ! ");
    }
    public void joinStudy(){
        System.out.println(this.getFullname() + " Joined the Class ! ");
    }

}
