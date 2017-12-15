package com.example.test.calendar;

import java.util.ArrayList;

/**
 * @author Chenhong
 * @date 2017/12/15
 * des
 */

public class WorkTypeBean {
    public int day;
    public String workType;
    public ArrayList<WorkType> workTypeList;
    public static class WorkType {
        public ArrayList<Time> timeList;
        public static class Time {
            public String type;
            public double startTime;
            public double endTime;
        }
    }

/*    public int day;
    public ArrayList<WorkType> workTypeList;
    public static class WorkType {
        public int workType;
        public ArrayList<Time> timeList;
        public static class Time {

            public double startTime;
            public double endTime;
        }
    }*/
    /*
       public int day;
       public int workType;
       public ArrayList<Time> timeList;
       public static class Time {
           public double startTime;
           public double endTime;
       }*/
}
