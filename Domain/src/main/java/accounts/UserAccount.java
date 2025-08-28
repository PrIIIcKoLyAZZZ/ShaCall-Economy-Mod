package accounts;

import value_objects.Currency;
import interfaces.Account;
import transactions.Transaction;
import transactions.TransactionType;

public class UserAccount implements Account {
    private final Integer _id;
    private final Integer _ownerId;
    private final Currency _currency;
    private double _balance;

    public UserAccount(Integer _id, Integer _ownerId, Currency _currency, double _balance) {
        this._id = _id;
        this._ownerId = _ownerId;
        this._currency = _currency;
        this._balance = _balance;
    }

    @Override
    public boolean deposit(Transaction transaction) {
        if (transaction.type != TransactionType.INCOME)
            return false;
        if (!transaction.currency.code().equals(this._currency.code()))
            return false;
        if (transaction.value <= 0)
            return false;

        this._balance += transaction.value;
        return true;
    }

    @Override
    public boolean withdraw(Transaction transaction) {
        if (transaction.type != TransactionType.EXPENSE)
            return false;
        if (!transaction.currency.code().equals(this._currency.code()))
            return false;
        if (transaction.value > this._balance)
            return false;

        this._balance -= transaction.value;
        return true;
    }

    @Override
    public double getBalance() {
        return this._balance;
    }

    @Override
    public Integer getId() {
        return this._id;
    }

    public Integer getOwnerId() {
        return this._ownerId;
    }
}
