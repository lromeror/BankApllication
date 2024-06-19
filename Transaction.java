public class BankApplication implements BankingOperation {
    
     private double balance;
 
     @Override
     public void deposit(double amount) {
         balance += amount;
     }
 
     @Override
     public void withdraw(double amount) {
         if (amount <= balance) {
             balance -= amount;
         } else {
             System.out.println("Insufficient funds");
         }
     }
 
     @Override
     public void transfer(double amount, String toAccount) {
         if (amount <= balance) {
             balance -= amount;
             // Logic for transferring to the specified account
         } else {
             System.out.println("Insufficient funds");
         }
     }
 
     @Override
     public void checkBalance() {
         System.out.println("Current balance: " + balance);
     }
 
     @Override
     public void printStatement() {
         System.out.println("Printing statement...");
     }
 }