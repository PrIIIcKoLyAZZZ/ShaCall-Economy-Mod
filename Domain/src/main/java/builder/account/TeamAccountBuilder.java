package builder.account;

import entities.accounts.TeamAccount;
import dto.account.TeamAccountDTO;
import interfaces.builder.EntityBuilder;
import valueObjects.Currency;

public class TeamAccountBuilder implements EntityBuilder<TeamAccount, TeamAccountBuilder> {
    private Integer accountId;
    private Integer accountTeamId;
    private Currency accountCurrency;
    private double accountBalance;

    public TeamAccountBuilder(Integer accountId, Integer accountTeamId, Currency accountCurrency, double accountBalance) {
        this.accountId = accountId;
        this.accountTeamId = accountTeamId;
        this.accountCurrency = accountCurrency;
        this.accountBalance = accountBalance;
    }

    public TeamAccountBuilder() {
        this.accountBalance = 0;
    }

    public static TeamAccountBuilder fromDto(TeamAccountDTO dto) {
        return new TeamAccountBuilder(
                dto.getId(),
                dto.getTeamId(),
                new Currency(dto.getCurrency()),
                dto.getBalance()
        );
    }

    @Override
    public TeamAccount build() {
        if (accountId == null || accountTeamId == null || accountCurrency == null)
            return null;

        return new TeamAccount(accountId,
                accountTeamId,
                accountCurrency,
                accountBalance);
    }

    @Override
    public TeamAccountBuilder self() {
        return this;
    }

    public TeamAccountBuilder setAccountId(Integer id) {
        this.accountId = id;
        return self();
    }

    public TeamAccountBuilder setAccountTeamId(Integer id) {
        this.accountTeamId = id;
        return self();
    }

    public TeamAccountBuilder setAccountCurrency(Currency currency) {
        this.accountCurrency = currency;
        return self();
    }

    public TeamAccountBuilder setAccountBalance(double balance) {
        this.accountBalance = balance;
        return self();
    }
}
