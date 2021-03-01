package com.chen.yang.calendar;

/**
 * @author Chenhong
 * @date 2020/3/12.
 * @des
 */

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class BroadcastReceiverMgr extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        Log.e("chen", "[Broadcast]" + action);

        //呼出电话
        if (action.equals(Intent.ACTION_NEW_OUTGOING_CALL)) {
            String outPhoneNumber = intent.getStringExtra(Intent.EXTRA_PHONE_NUMBER);
            //this.setResultData(null);
//这里可以更改呼出电话号码。如果设置为null，电话就永远不会播出了.
            Intent intent1 = new Intent(context, MyNewActivity.class);
            intent1.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(intent1);
            Log.e("chen", "[Broadcast]ACTION_NEW_OUTGOING_CALL:" + outPhoneNumber);
        }


    }


}
