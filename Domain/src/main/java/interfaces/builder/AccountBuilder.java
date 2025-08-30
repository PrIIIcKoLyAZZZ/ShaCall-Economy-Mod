package interfaces.builder;

import interfaces.Account;

public interface AccountBuilder<T extends Account, B extends AccountBuilder<T,B>> {
    public T build();
    public B self();
}
