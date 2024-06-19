public interface DepositOperation {
    void deposit(double amount);
}
public interface WithdrawOperation {
    void withdraw(double amount);
}
public interface TransferOperation {
    void transfer(double amount, String toAccount);
}
public interface BalanceCheckOperation {
    void checkBalance();
}
public interface StatementOperation {
    void printStatement();
}
