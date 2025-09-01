package builders;

import dto.transaction.TransactionDTO;
import interfaces.builder.TransactionBuilder;
import parsers.TransactionTypeParser;
import money.transactions.Transaction;
import money.transactions.TransactionType;
import money.valueObjects.Currency;

public class AccountTransactionBuilder implements TransactionBuilder<Transaction, AccountTransactionBuilder> {
    private TransactionType transactionType;
    private Currency transactionCurrency;
    private double transactionValue;

    public AccountTransactionBuilder(TransactionType transactionType, Currency transactionCurrency, double transactionValue) {
        this.transactionType = transactionType;
        this.transactionCurrency = transactionCurrency;
        this.transactionValue = transactionValue;
    }

    public AccountTransactionBuilder() {
        transactionValue = 0;
    }

    public static AccountTransactionBuilder fromDto(TransactionDTO dto) {
        return new AccountTransactionBuilder(
                TransactionTypeParser.parse(dto.getTransactionType()),
                new Currency(dto.getCurrency()),
                dto.getValue()
        );
    }

    @Override
    public Transaction build() {
        if (transactionType == null || transactionCurrency == null)
            return null;

        return new Transaction(
                transactionType,
                transactionCurrency,
                transactionValue
        );
    }

    @Override
    public AccountTransactionBuilder self() {
        return this;
    }

    public AccountTransactionBuilder setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
        return self();
    }

    public AccountTransactionBuilder setTransactionCurrency(Currency transactionCurrency) {
        this.transactionCurrency = transactionCurrency;
        return self();
    }

    public AccountTransactionBuilder setTransactionValue(double transactionValue) {
        this.transactionValue = transactionValue;
        return self();
    }
}
