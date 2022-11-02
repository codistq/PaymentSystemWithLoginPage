public class Academician extends Workers {
   private String degree;
     private String title;

    Academician(String fullname ,String mbno , String email, String degree, String title){
        super(fullname , mbno , email);
        this.title = title;
        this.degree = degree;
    }
    public String getDegree(){
        return this.degree;
    }
    public void setDegree(String degree){
        this.degree = degree;
    }
    public String getTitle(){
        return this.title = title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void intoStudy(){
        System.out.println(this.getFullname()+" Entered the Study ! ");
    }







}
