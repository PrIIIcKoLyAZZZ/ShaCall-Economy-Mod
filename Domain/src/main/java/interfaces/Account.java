package interfaces;

import transactions.Transaction;

public interface Account {
    public boolean deposit(Transaction transaction);
    public boolean withdraw(Transaction transaction);
    public double getBalance();
    public Integer getId();
}