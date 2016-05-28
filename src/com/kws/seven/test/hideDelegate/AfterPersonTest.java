package com.kws.seven.test.hideDelegate;

import com.kws.seven.after.hideDelegate.Person;
import org.junit.Assert;
import org.junit.Test;

public class AfterPersonTest {
    @Test
    public void getManagerTest() {
        Person honggildong = new Person("Hong,Gildong");
        Person john = new Person("John", honggildong);

        Person manager = john.getManager();

        Assert.assertEquals(honggildong.getName(), manager.getName());
    }
}
