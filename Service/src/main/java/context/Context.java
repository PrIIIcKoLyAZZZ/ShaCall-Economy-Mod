package context;

import entities.accounts.TeamAccount;
import entities.accounts.UserAccount;
import entities.clients.Team;
import entities.clients.User;
import interfaces.contracts.infrastructure.entity.TeamRepository;
import interfaces.contracts.infrastructure.entity.UserAccountRepository;
import interfaces.contracts.infrastructure.entity.UserRepository;
import interfaces.contracts.infrastructure.entity.transaction.TransactionRepository;

public class Context {
    public TeamAccount teamAccountRepository;
    public TeamRepository teamRepository;
    public UserAccountRepository userAccountRepository;
    public UserRepository userRepository;

    public TransactionRepository transactionRepository;

    public User currentUser;
    public Team currentTeam;
    public UserAccount currentUserAccount;
    public TeamAccount currentTeamAccount;

    public Context(TeamAccount teamAccountRepository,
                   TeamRepository teamRepository,
                   UserAccountRepository userAccountRepository,
                   UserRepository userRepository,
                   TransactionRepository transactionRepository) {
        this.teamAccountRepository = teamAccountRepository;
        this.teamRepository = teamRepository;
        this.userAccountRepository = userAccountRepository;
        this.userRepository = userRepository;
        this.transactionRepository = transactionRepository;
    }

    public Context() {
    }
}
