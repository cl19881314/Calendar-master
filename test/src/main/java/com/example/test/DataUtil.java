package com.example.test;

import android.content.Context;

import com.example.test.calendar.WorkTypeBean;

import java.util.ArrayList;

/**
 * Created by wwd on 2016/11/9.
 */
public class DataUtil {

    public static String convertWorkTypeValue2Text(Context context, int workType) {
        String s = "";
        if(workType == DataUtil.WorkType.PATROL.getValue()){
            s = context.getString(R.string.base_pratol_name);
        }else if (workType ==  DataUtil.WorkType.PROCESS.getValue()){
            s = context.getString(R.string.base_prepare_chujin);
        }else if (workType ==  DataUtil.WorkType.TRAFFIC.getValue()){
            s = context.getString(R.string.base_traffic_duty);
        }else if (workType ==  DataUtil.WorkType.PREPARE.getValue()){
            s = context.getString(R.string.base_prepare_name);
        }else if (workType == DataUtil.WorkType.ONDUTY.getValue()){
            s = context.getString(R.string.base_police_duty);
        }else if(workType == WorkType.INTELLEGENT.getValue()){
            s = context.getString(R.string.base_intelligent);
        }
        return  s;
    }

   /* public static String convertWorkTypeValue2Texts(Context context,  ArrayList<WorkTypeBean.WorkType> workTypeList) {
        String s = "";
        for (int i = 0; i < workTypeList.size(); i ++) {
            WorkTypeBean.WorkType workTypes = workTypeList.get(i);
            int workType = workTypes.workType;
            if (workType == DataUtil.WorkType.PATROL.getValue()) {
                s += context.getString(R.string.base_pratol_name_one);
            } else if (workType == DataUtil.WorkType.PROCESS.getValue()) {
                s += context.getString(R.string.base_prepare_chujin_one);
            } else if (workType == DataUtil.WorkType.TRAFFIC.getValue()) {
                s += context.getString(R.string.base_traffic_duty_one);
            } else if (workType == DataUtil.WorkType.PREPARE.getValue()) {
                s += context.getString(R.string.base_prepare_name_one);
            } else if (workType == DataUtil.WorkType.ONDUTY.getValue()) {
                s += context.getString(R.string.base_police_duty_one);
            } else if (workType == WorkType.INTELLEGENT.getValue()) {
                s += context.getString(R.string.base_intelligent_one);
            }
        }
        return  s;
    }*/


    public enum WorkType {
        ALL(-1),PATROL(0), PREPARE(1), TRAFFIC(3),PROCESS(2),ONDUTY(4), INTELLEGENT(5),SignOut(-100); //PATROL代表巡逻 INTELLIGENT智能巡防 PREPARE代表备勤 TRAFFIC代表交警执勤 PROCESS代表处警 ONDUTY代表值班
        private final int value;
        WorkType(int value) {
            this.value = value;
        }
        public int getValue() {
            return value;
        }
    }
}
