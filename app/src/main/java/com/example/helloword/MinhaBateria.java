package com.example.helloword;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import android.widget.Toast;
import android.os.BatteryManager;

public class MinhaBateria extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
       Context contexto = context.getApplicationContext();

        IntentFilter ifilter = new IntentFilter(Intent.ACTION_BATTERY_CHANGED);
        Intent batteryStatus = context.registerReceiver(null, ifilter);




    int level = batteryStatus.getIntExtra(BatteryManager.EXTRA_LEVEL, -1);
    int scale = batteryStatus.getIntExtra(BatteryManager.EXTRA_SCALE, -1);
    float batteryPct = level * 100 / (float)scale;


  Toast.makeText(contexto," Minha Bateria "+batteryPct, Toast.LENGTH_SHORT).show();


    }
}