public class SecurityOfficer extends Ofiicer {
    private String document;
    SecurityOfficer(String fullname,String mbno,String email,String department,String swift,String document){
        super(fullname, mbno, email,department,swift);
        this.document = document;
    }
    public String getDocument(){
        return this.document;
    }
    public void setDocument(String document){
        this.document = document;
    }
    public void watch(){
        System.out.println(this.getFullname()+" keep watch ! ");
    }

}
