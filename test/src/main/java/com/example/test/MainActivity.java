package com.example.test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.test.calendar.OnCalendarClickListener;
import com.example.test.calendar.WorkTypeBean;
import com.example.test.calendar.month.MonthCalendarView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements OnCalendarClickListener {
    private TextView mShowTimeTv;
    private MonthCalendarView mcvCalendar;
    private  ArrayList<WorkTypeBean> dataList1;
    private  ArrayList<WorkTypeBean> dataList2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mcvCalendar = (MonthCalendarView) findViewById(R.id.mcvCalendar);
        mShowTimeTv = (TextView) findViewById(R.id.showTimeTv);
        findViewById(R.id.showTextBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mcvCalendar.getCurrentMonthView().addTaskHints(dataList2);
            }
        });
        mcvCalendar.setOnCalendarClickListener(this);
        findViewById(R.id.preMonthBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mcvCalendar.setCurrentItem(mcvCalendar.getCurrentItem() - 1 > 0 ? mcvCalendar.getCurrentItem() - 1 : 0);
            }
        });
        findViewById(R.id.nextMonthBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mcvCalendar.setCurrentItem(mcvCalendar.getCurrentItem() + 1 > 47 ? 47 : mcvCalendar.getCurrentItem() + 1);
            }
        });
        initData();
    }

    private void initData() {
        dataList1 = new ArrayList<>();
        dataList2 = new ArrayList<>();
        /*for (int i = 1; i <= 20; i++){
            WorkTypeBean bean = new WorkTypeBean();
            bean.day = i;
            bean.workType = i % 5;
            bean.timeList = new ArrayList<>();
            for (int j = 0; j < 3; j++){
                WorkTypeBean.Time time = new WorkTypeBean.Time();
                time.startTime = i + j;
                time.endTime = (i + j)*2;
                bean.timeList.add(time);
            }
            dataList1.add(bean);
        }
        for (int i = 12; i < 20; i++){
            WorkTypeBean bean = new WorkTypeBean();
            bean.day = i;
            bean.workType = i % 5;
            bean.timeList = new ArrayList<>();
            for (int j = 0; j < 3; j++){
                WorkTypeBean.Time time = new WorkTypeBean.Time();
                time.startTime = i + j;
                time.endTime = (i + j)*2;
                bean.timeList.add(time);
            }
            dataList2.add(bean);
        }*/
         for (int i = 1; i <= 20; i ++){
            WorkTypeBean bean = new WorkTypeBean();
            bean.day = i;
             bean.workType = DataUtil.convertWorkTypeValue2Text(this,i % 5);
             bean.workTypeList = new ArrayList<>();
             WorkTypeBean.WorkType workType = new WorkTypeBean.WorkType();
            workType.timeList = new ArrayList<>();
            for (int j = 0; j < 3; j++){
                WorkTypeBean.WorkType.Time time = new WorkTypeBean.WorkType.Time();
                time.type = j+"";
                time.startTime = i + j;
                time.endTime = (i + j) * 2;
                workType.timeList.add(time);
            }
            bean.workTypeList.add(workType);
            dataList1.add(bean);
        }

        for (int i = 12; i <= 15; i ++){
            WorkTypeBean bean = new WorkTypeBean();
            bean.day = i;
            bean.workType = DataUtil.convertWorkTypeValue2Text(this,i % 5);
            bean.workTypeList = new ArrayList<>();
            WorkTypeBean.WorkType workType = new WorkTypeBean.WorkType();
            workType.timeList = new ArrayList<>();
            for (int j = 0; j < 5; j++) {
                WorkTypeBean.WorkType.Time time = new WorkTypeBean.WorkType.Time();
                time.type = j + "";
                time.startTime = i + j;
                time.endTime = (i + j) * 2;
                workType.timeList.add(time);
            }
            bean.workTypeList.add(workType);
            dataList2.add(bean);
        }
        Calendar calendar = Calendar.getInstance();
        mShowTimeTv.setText(calendar.get(Calendar.YEAR) + "年" + (calendar.get(Calendar.MONTH) + 1) + "月");
    }

    @Override
    public void onClickDate(int year, int month, int day) {
        ArrayList<WorkTypeBean> typeDataList = mcvCalendar.getCurrentMonthView().getTypeDataList();
        for (WorkTypeBean bean : typeDataList){
            if (day == bean.day){
                Toast.makeText(this,bean.workType + " time:" + bean.workTypeList.get(0).timeList.get(0).startTime,0).show();
            }
        }
    }

    @Override
    public void onPageChange(int year, int month, int day) {
        Log.i("gnt","year:" + year + " month:" + month + " day:" + day);
        if (month == 11){
            mcvCalendar.getCurrentMonthView().addTaskHints(dataList1);
        } else if (month == 10){
            mcvCalendar.getCurrentMonthView().addTaskHints(dataList2);
        }
        Log.i("gnt","current:"+mcvCalendar.getCurrentItem());
        mShowTimeTv.setText(year + "年" + (month + 1) + "月");
    }
}
