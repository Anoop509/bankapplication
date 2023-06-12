import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        // Create first HDFC account
        HDFC_account HDFC_account1 = new HDFC_account("Sachin", 1000.0,"abc123");
        System.out.println("Congrats! "+HDFC_account1.getName()+
                " Your account has been created with account number: "+
                HDFC_account1.getAccountNo());

        // create second hdfc account
        HDFC_account HDFC_account2 = new HDFC_account("Mahesh", 2000.0,"123");
        System.out.println("Congrats! "+HDFC_account2.getName()+
                " Your account has been created with account number: "+
                HDFC_account2.getAccountNo());

        // add money to account 1
        System.out.println("Money has been added. New balance is: "+HDFC_account1.addmoney(100000));

        // withdraw - both cases
        System.out.println(HDFC_account1.Withdrawmoney("xyqa",500000));
        System.out.println(HDFC_account1.Withdrawmoney("abc123",50000));

        // fetch balance for account 1
        System.out.println(HDFC_account1.fetchbalance("abc123"));

        // change password for account 1
        System.out.println(HDFC_account1.changepassword("password","abc123"));

        // calculate interest
        System.out.println("Enter the number of years to calculate interest");
        int years = sc.nextInt();
        System.out.println("Interest for "+years+" years is: "+HDFC_account1.calculateintetest(years));


    }
}