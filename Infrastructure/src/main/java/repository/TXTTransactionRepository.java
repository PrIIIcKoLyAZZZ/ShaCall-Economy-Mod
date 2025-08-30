package repository;

import dto.transaction.TransactionDTO;
import interfaces.infrastructure.TransactionRepository;

public class TXTTransactionRepository implements TransactionRepository {
    @Override
    public boolean save(TransactionDTO transactionDTO) {
        return false;
    }
}
