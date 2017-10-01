package com.disastertalk;

import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

import java.util.Map;

/**
 * Created by dpk on 10/1/17.
 */

public class MyFcmListenerService extends FirebaseMessagingService{
    @Override
    public void onMessageReceived(RemoteMessage message){
        String from = message.getFrom();
        Map data = message.getData();
        Log.d("RECEIVER", from);
    }

}
