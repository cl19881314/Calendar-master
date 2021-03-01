package com.chen.yang.calendar.ui.notifications;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;

import com.chen.yang.calendar.MyApplication;
import com.chen.yang.calendar.R;
import com.chen.yang.calendar.greendao.DaoSession;
import com.chen.yang.calendar.greendao.PersonMessageDao;
import com.chen.yang.calendar.greendao.PersonMessageDaoDao;

import java.util.List;

public class NotificationsFragment extends Fragment {
    private NotificationsViewModel notificationsViewModel;
    private PersonMessageDaoDao personMessageDaoDao;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        notificationsViewModel =
                ViewModelProviders.of(this).get(NotificationsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_notifications, container, false);
        root.findViewById(R.id.txtAddMsg).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtAddMsg();
            }
        });
        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        DaoSession daoSession = MyApplication.getInstance().getDaoSession();
        personMessageDaoDao = daoSession.getPersonMessageDaoDao();
        PersonMessageDao entity = new PersonMessageDao();
        entity.setName("小凤");
        entity.setType1("生日");
        entity.setDay1("2月14");
        entity.setType2("纪恋日");
        entity.setDay2("4月22");
        personMessageDaoDao.insert(entity);
    }

    public void txtAddMsg(){
        Log.e("chen","---");
        List<PersonMessageDao> dataList = personMessageDaoDao.loadAll();
        for (PersonMessageDao dao : dataList){
            Log.e("chen","---" + dao.getName() + dao.getType1() + dao.getDay1());
        }
    }
}
