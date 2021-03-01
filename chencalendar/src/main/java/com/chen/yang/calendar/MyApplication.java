package com.chen.yang.calendar;

import android.app.Application;
import android.database.sqlite.SQLiteDatabase;

import com.chen.yang.calendar.greendao.DaoMaster;
import com.chen.yang.calendar.greendao.DaoSession;

/**
 * @author Chenhong
 * @date 2020/3/12.
 * @des
 */
public class MyApplication extends Application {
    private DaoSession daoSession;
    private static MyApplication instance;
    public static MyApplication getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        //GreenDao
        initGreenDao();
    }

    private void initGreenDao() {
        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(this, "special.db");
        SQLiteDatabase db = helper.getWritableDatabase();
        DaoMaster daoMaster = new DaoMaster(db);
        daoSession = daoMaster.newSession();
    }
    public DaoSession getDaoSession() {
        return daoSession;
    }
}