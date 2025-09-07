package mapper;

import dto.transaction.TransactionDTO;
import money.transactions.Transaction;

public class TransactionMapper {
    public static TransactionDTO toDto(Transaction transaction) {
        return new TransactionDTO(
                transaction.type.toString(),
                transaction.currency.code(),
                transaction.value
        );
    }
}
