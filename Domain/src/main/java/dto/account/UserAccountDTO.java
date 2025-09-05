package dto.account;

import interfaces.EntityDTO;

public class UserAccountDTO implements EntityDTO {
    private Integer id;
    private Integer ownerId;
    private String currency;
    private double balance;

    public UserAccountDTO(Integer id, Integer ownerId, String currency, double balance) {
        this.id = id;
        this.ownerId = ownerId;
        this.currency = currency;
        this.balance = balance;
    }

    @Override
    public Integer getId() {
        return id;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public String getCurrency() {
        return currency;
    }

    public double getBalance() {
        return balance;
    }
}
