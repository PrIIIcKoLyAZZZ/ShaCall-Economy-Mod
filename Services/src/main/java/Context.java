import interfaces.infrastructure.EntityRepository;
import interfaces.infrastructure.TransactionRepository;

public class Context {
    public EntityRepository entityRepository;
    public TransactionRepository transactionRepository;

    public Context(EntityRepository entityRepository, TransactionRepository transactionRepository) {
        this.entityRepository = entityRepository;
        this.transactionRepository = transactionRepository;
    }
}
