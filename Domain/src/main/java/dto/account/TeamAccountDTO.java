package dto.account;

import interfaces.EntityDTO;

public class TeamAccountDTO implements EntityDTO {
    private Integer id;
    private Integer teamId;
    private String currency;
    private double balance;

    public TeamAccountDTO(Integer id, Integer teamId, String currency, double balance) {
        this.id = id;
        this.teamId = teamId;
        this.currency = currency;
        this.balance = balance;
    }

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
