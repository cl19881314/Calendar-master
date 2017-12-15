package com.jeek.calendar.widget.calendar;

import java.util.ArrayList;

/**
 * @author Chenhong
 * @date 2017/12/15
 * des
 */

public class WorkTypeBean {
    public int workType;
    public ArrayList<Time> timeList;
    public static class Time{
        public double startTime;
        public double endTime;
    }
}
