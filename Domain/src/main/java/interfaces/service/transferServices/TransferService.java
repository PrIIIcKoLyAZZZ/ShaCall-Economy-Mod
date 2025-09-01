package interfaces.service.transferServices;

import interfaces.entities.Account;
import interfaces.entities.Client;
import transactions.Transaction;

import java.util.List;
import java.util.UUID;

public interface TransferService<C extends Client, A extends Account> {
    boolean deposit(Account account, Transaction transaction);
    boolean withdraw(Account account, Transaction transaction);
    C findUserById(Integer id);
    C findUserByUUID(UUID uuid);
    A findAccountById(Integer id);
    List<A> findAccountByOwnerID(Integer id);
}