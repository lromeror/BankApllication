/*
@Banking application - With the help of this application we can create new bank 
account and other banking operation's.
@Author      - Nitheesh G.
@Created at  - 02-11-2021
@Updated at  - 02-16-2021
@Reviewed by - Anto
*/
public class BankApplication implements DepositOperation, WithdrawOperation, TransferOperation, BalanceCheckOperation, StatementOperation {
    
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
