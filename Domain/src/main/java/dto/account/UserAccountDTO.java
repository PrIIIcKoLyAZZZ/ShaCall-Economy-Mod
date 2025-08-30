package dto.account;

import interfaces.infrastructure.DTO;

public class UserAccountDTO implements DTO {
    private Integer _id;
    private Integer _ownerId;
    private String _currency;
    private double _balance;

    public UserAccountDTO(Integer _id, Integer _ownerId, String _currency, double _balance) {
        this._id = _id;
        this._ownerId = _ownerId;
        this._currency = _currency;
        this._balance = _balance;
    }

    @Override
    public Integer getId() {
        return _id;
    }

    public Integer get_ownerId() {
        return _ownerId;
    }

    public String get_currency() {
        return _currency;
    }

    public double get_balance() {
        return _balance;
    }
}
