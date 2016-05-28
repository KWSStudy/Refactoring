package com.kws.seven.test.introduceForeignMethod;

import com.kws.seven.before.introduceForeignMethod.StartDate;
import org.junit.Assert;
import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

public class StartDateTest {
    @Test
    public void getNextStartDateByCalendarUnitTest() {
        // Arrange
        StartDate startDate = new StartDate();

        Calendar end1 = Calendar.getInstance();
        end1.set(Calendar.YEAR, 2015);
        end1.set(Calendar.MONTH, Calendar.FEBRUARY);
        end1.set(Calendar.DAY_OF_MONTH, 28);

        Calendar end2 = Calendar.getInstance();
        end2.set(Calendar.YEAR, 2016);
        end2.set(Calendar.MONTH, Calendar.FEBRUARY);
        end2.set(Calendar.DAY_OF_MONTH, 28);

        // Act
        Calendar start1 = startDate.getNextStartDateByCalendar(end1);
        Calendar start2 = startDate.getNextStartDateByCalendar(end2);

        // Assert
        Assert.assertEquals(1, start1.get(Calendar.DAY_OF_MONTH));
        Assert.assertEquals(29, start2.get(Calendar.DAY_OF_MONTH));
    }

    @Test
    public void getNextStartDateByDate() {
        // Arrange
        StartDate startDate = new StartDate();

        Date end1 = new Date(2015, Calendar.FEBRUARY, 28);
        Date end2 = new Date(2016, Calendar.FEBRUARY, 28);

        // Act
        Date start1 = startDate.getNextStartDateByDate(end1);
        Date start2 = startDate.getNextStartDateByDate(end2);

        // Assert
        Assert.assertEquals(1, start1.getDate());
        Assert.assertEquals(29, start2.getDate());
    }
}
