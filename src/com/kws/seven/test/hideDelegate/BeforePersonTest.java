package com.kws.seven.test.hideDelegate;

import com.kws.seven.before.hideDelegate.Person;
import org.junit.Assert;
import org.junit.Test;

public class BeforePersonTest {

    @Test
    public void getManagerTest() {
        Person honggildong = new Person("Hong,Gildong");
        Person john = new Person("John", honggildong);

        Person manager = john.getDepartment().getManager();

        Assert.assertEquals(honggildong.getName(), manager.getName());
    }
}
