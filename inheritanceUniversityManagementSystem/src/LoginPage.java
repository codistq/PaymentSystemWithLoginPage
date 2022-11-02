import java.util.Scanner;

public class LoginPage {
    boolean check = true;


    LoginPage() {
        login();
    }

    public void login() {
        System.out.print("Enter a User id : ");
        Scanner scan = new Scanner(System.in);
        int id = scan.nextInt();
        System.out.print("Enter a password please : ");
        int password = scan.nextInt();
        DataCenter user = new DataCenter(id);
        if ((user.info(id) == id) && user.checkPass(id) == password) {
            System.out.println("Welcome to "+user.getName(id));
            System.out.println("Press '1' for information" );
            System.out.println("Press '2' for deposit money");
            System.out.print("Enter a 1 or 2 : ");
            int button = scan.nextInt();
            if(button==1 || button==2){
                check=false;
            }
            while (check){
                System.out.print("Enter a 1 or 2 :");
                button = scan.nextInt();
                if(button==1 || button==2){
                    check=false;
                }
            }
            if(button==1){
                System.out.println("Your Personal Information : ");
                System.out.println("Full name : "+user.getName(id));
                System.out.println("ID number  :"+user.info(id));
                System.out.println("Password : "+user.checkPass(id));
                System.out.println("Total debt : "+user.debt(id));
            }else{
                System.out.println("Total debt : "+user.debt(id));
                System.out.print("How many will you pay ? ");
                int money = scan.nextInt();
                Payment pay = new Payment(id,money);
                pay.payment(id,money);
            }

        }else{
            System.out.println("ID or Password is incorrect ! ");
        }

    }
}
