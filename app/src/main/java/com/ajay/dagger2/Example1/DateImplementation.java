package com.ajay.dagger2.Example1;

import java.util.Date;

public class DateImplementation implements DateInterface{

    private long mDate;  // storing date in a long value

    DateImplementation() {
        mDate = new Date().getTime();
    }

    public long getDate() {
        return mDate;
    }
}
