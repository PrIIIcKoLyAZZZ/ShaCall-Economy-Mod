package interfaces.entities;

import interfaces.Entity;
import money.transactions.Transaction;
import money.valueObjects.Currency;

public interface Account extends Entity {
    public boolean deposit(Transaction transaction);
    public boolean withdraw(Transaction transaction);
    public double getBalance();
    public Currency getCurrency();
}