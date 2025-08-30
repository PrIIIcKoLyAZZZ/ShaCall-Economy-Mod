package dto.transaction;

public class TransactionDTO {
    private String transactionType;
    private String currency;
    private double value;

    public TransactionDTO(String transactionType, String currency, double value) {
        this.transactionType = transactionType;
        this.currency = currency;
        this.value = value;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
