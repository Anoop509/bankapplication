import java.security.PublicKey;

public interface BankAccountInterface {

      String fetchbalance(String password);

       double addmoney(double amount);

       String Withdrawmoney(String password , double amount);

    String changepassword(String newPassword, String oldpassword);

    double calculateintetest(int years );

}
