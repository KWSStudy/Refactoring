package com.kws.seven.test.moveMethod;

import com.kws.seven.before.moveMethod.Account;
import org.junit.Assert;
import org.junit.Test;

public class AccountTest {
    @Test
    public void bankChargeUnitTest() throws Exception {
        // Arrange
        Account honggildong = new Account("홍길동");
        Account doolry = new Account("둘리");
        Account gogildong = new Account("고길동");

        double premiumCharge = 17.05;
        double normalCharge = 22.0;

        // Act
        honggildong.setDayOverdrawn(10);
        doolry.setDayOverdrawn(10);
        gogildong.setDayOverdrawn(10);

        double hongCharge = honggildong.bankCharge();
        double doolCharge = doolry.bankCharge();
        double goCharge = gogildong.bankCharge();

        // Assert
        Assert.assertEquals(premiumCharge, hongCharge, 0.01);
        Assert.assertEquals(normalCharge, doolCharge, 0.01);
        Assert.assertEquals(normalCharge, goCharge, 0.01);
    }

}