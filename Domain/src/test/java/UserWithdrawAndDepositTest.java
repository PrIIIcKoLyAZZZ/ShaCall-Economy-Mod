import value_objects.Currency;
import accounts.UserAccount;
import interfaces.Account;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import transactions.Transaction;
import transactions.TransactionType;

import static org.junit.jupiter.api.Assertions.*;

public class UserWithdrawAndDepositTest {
    Account account1;
    Account account2;

    @BeforeEach
    void setUp() {
        account1 = new UserAccount(1, 1, new Currency("dollar"), 0);
        account2 = new UserAccount(2, 2, new Currency("dollar"), 100);
    }

    @Test
    void deposit_money_assert_ok() {
        boolean ok = account1.deposit(new Transaction(TransactionType.INCOME, new Currency("dollar"), 100));
        assertTrue(ok);
        assertEquals(100, account1.getBalance());
    }

    @Test
    void deposit_money_with_another_currency_assert_false() {
        boolean ok = account1.deposit(new Transaction(TransactionType.INCOME, new Currency("euro"), 100));
        assertFalse(ok);
        assertEquals(0, account1.getBalance());
    }

    @Test
    void deposit_money_with_zero_value_assert_false() {
        boolean ok = account1.deposit(new Transaction(TransactionType.INCOME, new Currency("dollar"), 0));
        assertFalse(ok);
        assertEquals(0, account1.getBalance());
    }

    @Test
    void deposit_money_with_wrong_transaction_type_assert_false() {
        boolean ok = account1.deposit(new Transaction(TransactionType.EXPENSE, new Currency("dollar"), 100));
        assertFalse(ok);
        assertEquals(0, account1.getBalance());
    }

    @Test
    void withdraw_money_assert_ok() {
        boolean ok = account2.withdraw(new Transaction(TransactionType.EXPENSE, new Currency("dollar"), 80));
        assertTrue(ok);
        assertEquals(20.0, account2.getBalance());
    }

    @Test
    void withdraw_money_with_another_currency_assert_false() {
        boolean ok = account2.withdraw(new Transaction(TransactionType.EXPENSE, new Currency("euro"), 80));
        assertFalse(ok);
        assertEquals(100.0, account2.getBalance());
    }

    @Test
    void withdraw_money_with_negative_balance_assert_false() {
        boolean ok = account2.withdraw(new Transaction(TransactionType.EXPENSE, new Currency("dollar"), 101));
        assertFalse(ok);
        assertEquals(100.0, account2.getBalance());
    }

    @Test
    void withdraw_money_with_wrong_transaction_type_assert_false() {
        boolean ok = account2.withdraw(new Transaction(TransactionType.INCOME, new Currency("dollar"), 80));
        assertFalse(ok);
        assertEquals(100.0, account2.getBalance());
    }
}