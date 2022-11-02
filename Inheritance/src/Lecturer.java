public class Lecturer extends Academician {
    private String doorNumber;

 public   Lecturer(String fullname,String mbno,String email,String degree,String title, String doorNumber){
     super(fullname, mbno, email, degree, title);
     this.doorNumber = doorNumber;
 }
 public String getDoorNumber(){
     return this.doorNumber;
 }
 public void setDoorNumber(String doorNumber){
     this.doorNumber = doorNumber;
 }

 public void senateMeet(){
     System.out.println(this.getFullname()+" joined the Senate Meeting ! ");
 }
 public void doExam(){
     System.out.println(this.getFullname()+" did exam ! ");
 }







}
