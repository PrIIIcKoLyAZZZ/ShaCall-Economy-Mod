package parsers;

import money.transactions.TransactionType;

import java.util.Objects;

public class TransactionTypeParser {
    public static TransactionType parse(String type) {
        if (Objects.equals(type, "INCOME"))
            return TransactionType.INCOME;
        if (Objects.equals(type, "EXPENSE"))
            return TransactionType.EXPENSE;

        return null;
    }
}
