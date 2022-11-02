public class Workers {
    private String fullname;
    private String mbno;
    private String email;

    Workers(String fullname , String mbno , String email){
        this.fullname = fullname;
        this.mbno = mbno;
        this.email = email;
    }
    public String getFullname(){
        return  this.fullname;
    }
    public void setFullname(String fullname){
        this.fullname = fullname;
    }
    public String getMbno(){
        return this.mbno;
    }
    public void setMbno(String mbno){
        this.mbno = mbno;
    }
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public void Entered(){
        System.out.println(this.fullname+" Entered the University !");

    }
    public void Exited(){
        System.out.println(this.fullname+" Exited the University !");
    }
    public void Dininghall(){
        System.out.println(this.fullname+" Entered Dining hall !");
    }













}
