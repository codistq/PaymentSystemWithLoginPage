import java.util.Scanner;

public class Payment {
    int money;
    int id;
    boolean try1 =true;
    DataCenter payment = new DataCenter(id);
    Scanner scan = new Scanner(System.in);
    Payment(int id , int money){
        this.id=id;
        this.money=money;
    }
    public void payment(int id, int money){
        int result;
            result =payment.debt(id) - this.money;
        if(result<=0){
            if(result<0){
                System.out.println("Don't forget to take the change!");
            }
            System.out.println("You have no more debt thanks for payment ! Good Days. ");
            System.out.println("=====DONE=====");
        }else{
            System.out.println("Total remaining debt : "+result + " $");
            System.out.print("Do you want to pay off more debt ? (Y or N) : ");
            String morepay= scan.next();
            if(morepay.equals("Y") || morepay.equals("N")){
                 try1 = false;
            }
            while (try1){
                System.out.print("Enter Y or N : ");
                morepay= scan.next();
                if(morepay.equals("Y") || morepay.equals("N")){
                    try1=false;
                }
            }
            if(morepay.equals("Y")){
                System.out.print("Enter amount : ");
                int amount = scan.nextInt();
                if(amount<result){
                    int result2 = result-amount;
                    System.out.println("Total debt : "+result2 + " $");
                    System.out.println("Loging out of the system...");
                    System.out.println("=====DONE======");
                }else{
                    System.out.print("You have no more debt thanks for payment ");
                    System.out.println("Don't forget to take the change!");
                }

            } else if (morepay.equals("N")) {
                System.out.println("Have nice day ! "+payment.getName(id));
            }
        }

    }

}
