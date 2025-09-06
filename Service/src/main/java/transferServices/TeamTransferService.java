package transferServices;

import entities.accounts.TeamAccount;
import entities.clients.Team;
import interfaces.contracts.service.transferServices.TransferService;
import money.transactions.Transaction;

import java.util.List;
import java.util.UUID;

public class TeamTransferService implements TransferService<Team, TeamAccount> {

    @Override
    public boolean deposit(TeamAccount account, Transaction transaction) {
        return false;
    }

    @Override
    public boolean withdraw(TeamAccount account, Transaction transaction) {
        return false;
    }

    @Override
    public Team findUserById(Integer id) {
        return null;
    }

    @Override
    public Team findUserByUUID(UUID uuid) {
        return null;
    }

    @Override
    public TeamAccount findAccountById(Integer id) {
        return null;
    }

    @Override
    public List<TeamAccount> findAccountByOwnerID(Integer id) {
        return List.of();
    }
}
