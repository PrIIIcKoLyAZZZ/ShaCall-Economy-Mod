package interfaces.infrastructure.entity.transaction;

import dto.transaction.TransactionDTO;

public interface TransactionRepository {
    boolean save(TransactionDTO transactionDTO);
}
