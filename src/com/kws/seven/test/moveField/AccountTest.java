package com.kws.seven.test.moveField;

import com.kws.seven.before.moveField.Account;
import org.junit.Assert;
import org.junit.Test;

public class AccountTest {
    @Test
    public void interestForAmount_daysUnitTest() throws Exception {
        // Arrange
        Account honggildong = new Account("홍길동");
        Account doolry = new Account("둘리");
        Account gogildong = new Account("고길동");

        double amount = 10000000.0;
        int days = 30;

        double premiumInterest =  0.3 * amount * days / 365;
        double normalInterest = 0.45 * amount * days / 365;

        // Act
        double hongInterest = honggildong.interestForAmount_days(amount, days);
        double doolInterest = doolry.interestForAmount_days(amount, days);
        double goInterest = gogildong.interestForAmount_days(amount, days);

        // Assert
        Assert.assertEquals(premiumInterest, hongInterest, 0.1);
        Assert.assertEquals(normalInterest, doolInterest, 0.1);
        Assert.assertEquals(normalInterest, goInterest, 0.1);

    }
}
