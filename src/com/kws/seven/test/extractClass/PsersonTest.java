package com.kws.seven.test.extractClass;


import com.kws.seven.before.extractClass.Person;
import org.junit.Assert;
import org.junit.Test;

public class PsersonTest {

    @Test
    public void PersonCreationUnitTest() {
        // Arrange
        String officeTelephone = "(02)6233-0214";
        // Act
        Person person = new Person("홍길동", "02", "6233-0214");

        // Assert
        Assert.assertEquals(officeTelephone, person.getTelephoneNumber());
    }
}
