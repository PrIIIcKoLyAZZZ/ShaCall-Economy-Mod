package interfaces.builder;

import money.transactions.Transaction;

public interface TransactionBuilder<T extends Transaction, B extends TransactionBuilder<T,B>> {
    public T build();
    public B self();
}
