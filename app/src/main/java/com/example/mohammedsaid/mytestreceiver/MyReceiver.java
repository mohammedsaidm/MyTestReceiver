package com.example.mohammedsaid.mytestreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by Mohammed Said on 04-Feb-18.
 */

public class MyReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        Toast.makeText(context,"Hello from Test Receiver",Toast.LENGTH_LONG).show();
    }
}
