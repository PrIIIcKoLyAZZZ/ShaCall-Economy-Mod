package accounts;

import value_objects.Currency;
import interfaces.Account;
import transactions.Transaction;
import transactions.TransactionType;

public class TeamAccount implements Account {
    private final Integer _id;
    private final Integer _teamId;
    private final Currency _currency;
    private double _balance;

    public TeamAccount(Integer _id, Integer _teamId, Currency _currency, double _balance) {
        this._id = _id;
        this._teamId = _teamId;
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

    public Integer getTeamId() {
        return this._teamId;
    }
}
