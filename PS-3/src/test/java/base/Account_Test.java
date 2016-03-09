package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Account_Test {
	
	Account testAccount_withdraw = new Account(1122, 20000);
	Account testAccount_withdraw_1 = new Account(1123, 20000);
	Account testAccount_deposit = new Account(1124, 20000);
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void test_getMonthlyInterestRate() {
		assertTrue(Account.getMonthlyInterestRate(4.5) == .375);
		assertTrue(Account.getMonthlyInterestRate(6.0) == .5);
	}
	
	@Test
	public void test_withdraw() {
		testAccount_withdraw.withdraw(2500);
		assertTrue(testAccount_withdraw.getBalance() == 17500);
		testAccount_withdraw_1.withdraw(21000);
		assertTrue(testAccount_withdraw_1.getBalance() == 20000);
	}
	
	@Test
	public void test_deposit() {
		testAccount_deposit.deposit(3000);
		assertTrue(testAccount_deposit.getBalance() == 23000);
	}

}