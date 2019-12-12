/**
   A class to test the BankAccount class.
*/
public class BankAccountTest
{
   /**
      Tests the methods of the BankAccount class.
      @param args not used
   */
   public static void main(String[] args)
   {
      //This line creates a new BankAccount object called harrysChecking with 0 balance
	  BankingAccount harrysChecking = new BankingAccount(1000);
	  BankingAccount sallysChecking = new BankingAccount(500);
	  //This line calls the deposit method for harrysChecking
	  //Note the deposit is for $2000
      harrysChecking.deposit(2000);
      sallysChecking.deposit(700);
      
      harrysChecking.withdraw(500);
      sallysChecking.withdraw(1300);

      //This line calls the getBalance method and prints it     
      System.out.println(harrysChecking.getBalance());
      System.out.println(sallysChecking.getBalance());
      System.out.println("Harry's Expected: 2500");
      System.out.println("Sally's Expected: -100");
   }
}
