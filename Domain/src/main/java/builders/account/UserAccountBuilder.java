package builders.account;

import entities.accounts.UserAccount;
import dto.account.UserAccountDTO;
import interfaces.builder.EntityBuilder;
import money.valueObjects.Currency;

public class UserAccountBuilder implements EntityBuilder<UserAccount, UserAccountBuilder> {
    private Integer _accountId;
    private Integer _accountOwnerId;
    private Currency _accountCurrency;
    private double _accountBalance;

    public UserAccountBuilder(Integer _accountId, Integer _accountOwnerId, Currency _accountCurrency, double _accountBalance) {
        this._accountId = _accountId;
        this._accountOwnerId = _accountOwnerId;
        this._accountCurrency = _accountCurrency;
        this._accountBalance = _accountBalance;
    }

    public UserAccountBuilder() {
        this._accountBalance = 0;
    }

    public static UserAccountBuilder fromDto(UserAccountDTO dto) {
        return new UserAccountBuilder(
                dto.getId(),
                dto.getOwnerId(),
                new Currency(dto.getCurrency()),
                dto.getBalance()
        );
    }

    @Override
    public UserAccount build() {
        if (_accountId == null || _accountOwnerId == null || _accountCurrency == null)
            return null;

        return new UserAccount(_accountId,
                _accountOwnerId,
                _accountCurrency,
                _accountBalance
        );
    }

    @Override
    public UserAccountBuilder self() {
        return this;
    }

    public UserAccountBuilder setAccountId(Integer _accountId) {
        this._accountId = _accountId;
        return self();
    }

    public UserAccountBuilder setAccountOwnerId(Integer _accountOwnerId) {
        this._accountOwnerId = _accountOwnerId;
        return self();
    }

    public UserAccountBuilder setAccountCurrency(Currency _accountCurrency) {
        this._accountCurrency = _accountCurrency;
        return self();
    }

    public UserAccountBuilder setAccountBalance(double _accountBalance) {
        this._accountBalance = _accountBalance;
        return self();
    }
}
