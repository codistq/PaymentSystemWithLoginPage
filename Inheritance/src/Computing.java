public class Computing extends Ofiicer {
    private String mission;
    Computing(String fullname,String mbno, String email,String department,String shift, String mission){
        super(fullname, mbno, email, department, shift);
        this.mission =mission;
    }
    public String getMission(){
        return this.mission;
    }
    public void setMission(String mission){
        this.mission = mission;
    }
    public void CreateNetwork(){
        System.out.println(this.getFullname()+ " created the Network system ! ");
    }

}
