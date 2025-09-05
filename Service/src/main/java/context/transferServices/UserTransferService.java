package context.transferServices;

import context.Context;
import dto.account.UserAccountDTO;
import dto.entity.UserDTO;
import entities.accounts.UserAccount;
import entities.clients.User;
import factories.EntityFactory;
import interfaces.entities.Account;
import interfaces.service.transferServices.TransferService;
import money.transactions.Transaction;
import money.valueObjects.Currency;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class UserTransferService implements TransferService<User, UserAccount> {
    private Context context;

    public UserTransferService(Context context) {
        this.context = context;
    }

    @Override
    public boolean deposit(Account account, Transaction transaction) {
        boolean result = account.deposit(transaction);
        if (!result)
            return false;
        return true;
    }

    @Override
    public boolean withdraw(Account account, Transaction transaction) {
        return false;
    }

    @Override
    public User findUserById(Integer id) {
        UserDTO foundedUser = context.userRepository.findById(id);
        if (foundedUser == null)
            return null;

        return EntityFactory
                .createUserBuilder()
                .setUserId(foundedUser.getId())
                .setUserUuid(foundedUser.getUuid())
                .setUserName(foundedUser.getName())
                .setUserTeamId(foundedUser.getTeamId())
                .build();
    }

    @Override
    public User findUserByUUID(UUID uuid) {
        UserDTO foundedUser = context.userRepository.findByUUID(uuid);
        if (foundedUser == null)
            return null;

        return EntityFactory
                .createUserBuilder()
                .setUserId(foundedUser.getId())
                .setUserUuid(foundedUser.getUuid())
                .setUserName(foundedUser.getName())
                .setUserTeamId(foundedUser.getTeamId())
                .build();
    }

    @Override
    public UserAccount findAccountById(Integer id) {
        UserAccountDTO foundedAccount = context.userAccountRepository.findById(id);
        if (foundedAccount == null)
            return null;

        return EntityFactory.
                createUserAccountBuilder()
                .setAccountId(foundedAccount.getId())
                .setAccountOwnerId(foundedAccount.getOwnerId())
                .setAccountCurrency(new Currency(foundedAccount.getCurrency()))
                .setAccountBalance(foundedAccount.getBalance())
                .build();
    }

    @Override
    public List<UserAccount> findAccountByOwnerID(Integer id) {
        List<UserAccountDTO> foundedAccounts = context.userAccountRepository.findAllByOwnerId(id);
        if (foundedAccounts.isEmpty() || foundedAccounts == null)
            return null;

        return createAccountList(foundedAccounts);
    }

    private List<UserAccount> createAccountList(List<UserAccountDTO> accountDTOs) {
        List<UserAccount> accounts = new ArrayList<>();
        if (accountDTOs.isEmpty() || accountDTOs == null)
            return null;

        accountDTOs.forEach(account -> accounts.add(
                EntityFactory
                        .createUserAccountBuilder()
                        .setAccountId(account.getId())
                        .setAccountOwnerId(account.getOwnerId())
                        .setAccountCurrency(new Currency(account.getCurrency()))
                        .setAccountBalance(account.getBalance())
                        .build()
        ));

        return accounts;
    }
}