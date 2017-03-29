package com.amplitude.tron.volksradio30;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by Tron on 1/28/2017.
 */

public class NButtonListener extends BroadcastReceiver{
    @Override
    public void onReceive(Context context, Intent intent) {
        Intent intentService=new Intent(context,VolksPlayerService.class);

        if (VolksMediaConstant.getIsStreamPlaying())
        {
            intentService.setAction("com.amplitude.tron.volksradio30.STOP");
            context.startService(intentService);
        }
        else
        {
            intentService.setAction("com.amplitude.tron.volksradio30.PLAY");
            context.startService(intentService);
        }
    }
}
