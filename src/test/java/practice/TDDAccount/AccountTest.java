package practice.TDDAccount;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    public void testAccount() throws Exception{
        Account account = new Account(10000);
    }
}