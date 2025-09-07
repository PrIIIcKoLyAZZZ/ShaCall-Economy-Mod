package interfaces.contracts.infrastructure.entity.transaction;

import dto.transaction.TransactionDTO;

public interface TransactionRepository {
    void save(TransactionDTO transactionDTO);
}