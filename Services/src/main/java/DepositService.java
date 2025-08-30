import interfaces.Account;
import transactions.Transaction;

public class DepositService {
    private Context context;

    public DepositService(Context context) {
        this.context = context;
    }

    public boolean deposit(Transaction transaction, Account account) {
        boolean result = account.deposit(transaction);
        if (!result)
            return false;
        return true;
    }
}
