package interfaces;

import transactions.Transaction;
import value_objects.Currency;

public interface Account {
    public boolean deposit(Transaction transaction);
    public boolean withdraw(Transaction transaction);
    public double getBalance();
    public Integer getId();
    public Currency getCurrency();
}