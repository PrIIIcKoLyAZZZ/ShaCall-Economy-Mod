package interfaces.contracts.service.transferServices;

import interfaces.entities.Account;
import interfaces.entities.Client;
import money.transactions.Transaction;

import java.util.List;
import java.util.UUID;

public interface TransferService<C extends Client, A extends Account> {
    boolean deposit(A account, Transaction transaction);
    boolean withdraw(A account, Transaction transaction);
    C findClientById(Integer id);
    C findClientByUUID(UUID uuid);
    A findAccountById(Integer id);
    List<A> findAccountByOwnerID(Integer id);
}