package transferServices;

import context.Context;
import dto.account.TeamAccountDTO;
import dto.entity.TeamDTO;
import entities.accounts.TeamAccount;
import entities.clients.Team;
import factories.EntityFactory;
import interfaces.contracts.service.transferServices.TransferService;
import mapper.TransactionMapper;
import mapper.account.TeamAccountMapper;
import money.transactions.Transaction;
import money.valueObjects.Currency;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class TeamTransferService implements TransferService<Team, TeamAccount> {
    private Context context;

    public TeamTransferService(Context context) {
        this.context = context;
    }

    @Override
    public boolean deposit(TeamAccount account, Transaction transaction) {
        boolean result = account.deposit(transaction);
        if (!result)
            return false;

        context.transactionRepository.save(TransactionMapper.toDto(transaction));
        context.teamAccountRepository.save(TeamAccountMapper.toDto(account));
        return true;
    }

    @Override
    public boolean withdraw(TeamAccount account, Transaction transaction) {
        boolean result = account.withdraw(transaction);
        if (!result)
            return false;

        context.transactionRepository.save(TransactionMapper.toDto(transaction));
        context.teamAccountRepository.save(TeamAccountMapper.toDto(account));
        return false;
    }

    @Override
    public Team findClientById(Integer id) {
        TeamDTO foundedTeam = context.teamRepository.findById(id);
        if (foundedTeam == null)
            return null;

        return EntityFactory
                .createTeamBuilder()
                .setTeamId(foundedTeam.getId())
                .setTeamName(foundedTeam.getName())
                .setTeamOwnerId(foundedTeam.getOwnerId())
                .build();
    }

    @Override
    public Team findClientByUUID(UUID uuid) {
        return null;
    }

    @Override
    public TeamAccount findAccountById(Integer id) {
        TeamAccountDTO foundedAccount = context.teamAccountRepository.findById(id);
        if (foundedAccount == null)
            return null;

        return EntityFactory
                .createTeamAccountBuilder()
                .setAccountId(foundedAccount.getId())
                .setAccountTeamId(foundedAccount.getId())
                .setAccountCurrency(new Currency(foundedAccount.getCurrency()))
                .setAccountBalance(foundedAccount.getBalance())
                .build();
    }

    @Override
    public List<TeamAccount> findAccountByOwnerID(Integer id) {
        List<TeamAccountDTO> foundedAccounts = context.teamAccountRepository.findByOwnerId(id);
        if (foundedAccounts.isEmpty() || foundedAccounts == null)
            return null;

        return createTeamAccountList(foundedAccounts);
    }

    private List<TeamAccount> createTeamAccountList(List<TeamAccountDTO> accountDTOs) {
        List<TeamAccount> accounts = new ArrayList<>();
        if (accountDTOs.isEmpty() || accountDTOs == null)
            return null;

        accountDTOs.forEach(account -> accounts.add(
                EntityFactory
                        .createTeamAccountBuilder()
                        .setAccountId(account.getId())
                        .setAccountTeamId(account.getTeamId())
                        .setAccountCurrency(new Currency(account.getCurrency()))
                        .setAccountBalance(account.getBalance())
                        .build()
        ));

        return accounts;
    }
}
