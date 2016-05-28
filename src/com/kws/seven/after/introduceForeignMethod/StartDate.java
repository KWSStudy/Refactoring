package com.kws.seven.after.introduceForeignMethod;

import java.util.Calendar;
import java.util.Date;

public class StartDate {
    public Calendar getNextStartDateByCalendar(Calendar previousEnd) {
        return getNextDay(previousEnd);
    }

    public Date getNextStartDateByDate(Date previousEnd) {
        return getNextDay(previousEnd);
    }

    private static Calendar getNextDay(Calendar arg) {
        Calendar newStart = (Calendar)arg.clone();
        newStart.add(Calendar.DAY_OF_MONTH, 1);
        return newStart;
    }

    private static Date getNextDay(Date arg) {
        Date newStart = new Date(arg.getYear(), arg.getMonth(), arg.getDate() + 1);
        return newStart;
    }
}
