import java.util.UUID;

public class HDFC_account implements  BankAccountInterface {
   private String name;

   private String accountNo;

  private   Double balance;

  private   String password;

  final double rateofinterest = 6.1;
//no args constructor
    public HDFC_account() {
    }
// all args constructor
    public HDFC_account(String name, Double balance, String password) {
        this.name = name;
        this.accountNo = String.valueOf(UUID.randomUUID());
        this.balance = balance;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public String fetchbalance(String password) {
        if(this.password.equals(password)){

            return "your current balance is :" +this.balance;

        }

        return "incorrect password";
    }

    @Override
    public double addmoney(double amount) {
        this.balance +=amount;
        return balance;
    }

    @Override
    public String Withdrawmoney(String password, double amount) {
        if(this.password.equals(password)){
            if(amount<=this.balance){
                this.balance -= amount;
                return "Money has been withdrawn. The remaining balance is: "+this.balance;
            }
            else{
                return "Insufficient balance";
            }
        }
        return "Incorrect Password";
    }

    @Override
    public String changepassword(String newPassword, String oldpassword) {
        if(this.password.equals(oldpassword)){
            this.password = newPassword;
            return "Congrats! Your password has been updated!!";
        }
        return "Incorrect password";
    }

    @Override
    public double calculateintetest(int years) {
        return (this.balance*rateofinterest*years)/100;
    }
}
