import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class AccountTest {
    private Account account;

    @Before
    public void setUp() {
        account = new Account();
    }

    @Test
    public void testDeposit() {
        account.deposit(100.0);
        assertEquals(100.0, account.getBalance(), 0.001);
    }

    @Test
    public void testWithdrawSufficientFunds() {
        account.deposit(100.0);
        double withdrawnAmount = account.withdraw(50.0);
        assertEquals(50.0, account.getBalance(), 0.001);
        assertEquals(50.0, withdrawnAmount, 0.001);
    }

    @Test
    public void testWithdrawInsufficientFunds() {
        account.deposit(100.0);
        double withdrawnAmount = account.withdraw(150.0);
        assertEquals(100.0, account.getBalance(), 0.001);
        assertEquals(0.0, withdrawnAmount, 0.001);
    }

    @Test
    public void testWithdrawNegativeAmount() {
        account.deposit(100.0);
        double withdrawnAmount = account.withdraw(-50.0);
        assertEquals(100.0, account.getBalance(), 0.001);
        assertEquals(0.0, withdrawnAmount, 0.001);
    }

    @Test
    public void testWithdrawZeroAmount() {
        account.deposit(100.0);
        double withdrawnAmount = account.withdraw(0.0);
        assertEquals(100.0, account.getBalance(), 0.001);
        assertEquals(0.0, withdrawnAmount, 0.001);
    }
}
