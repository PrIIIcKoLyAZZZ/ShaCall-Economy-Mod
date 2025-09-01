package repository;

import dto.transaction.TransactionDTO;
import interfaces.infrastructure.entity.transaction.TransactionRepository;

public class TXTTransactionRepository implements TransactionRepository {
    @Override
    public boolean save(TransactionDTO transactionDTO) {
        return false;
    }
}
