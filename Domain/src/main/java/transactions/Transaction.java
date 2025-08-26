package transactions;

import ValueObjects.Currency;

public class Transaction {
    public TransactionType type;
    public Currency currency;
    public double value;

    public Transaction(TransactionType type, Currency currency, double value) {
        this.type = type;
        this.currency = currency;
        this.value = value;
    }
}
