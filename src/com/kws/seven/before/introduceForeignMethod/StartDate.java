package com.kws.seven.before.introduceForeignMethod;

import java.util.Calendar;
import java.util.Date;

public class StartDate {
    public Calendar getNextStartDateByCalendar(Calendar previousEnd) {
        Calendar newStart = (Calendar)previousEnd.clone();
        newStart.add(Calendar.DAY_OF_MONTH, 1);
        return newStart;
    }

    public Date getNextStartDateByDate(Date previousEnd) {
        Date newStart = new Date(previousEnd.getYear(), previousEnd.getMonth(), previousEnd.getDate() + 1);
        return newStart;
    }
}
