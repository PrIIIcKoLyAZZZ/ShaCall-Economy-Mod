package interfaces.infrastructure;

import dto.transaction.TransactionDTO;

public interface TransactionRepository {
    public boolean save(TransactionDTO transactionDTO);
}
