package com.amplitude.tron.volksradio30;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Tron on 1/28/2017.
 */

public class VolksSysSharedPrefs {

    private static SharedPreferences sharedVolksSysPrefs;
    private static final String systemVolksData="VRSystemData";

    public static void setNowStreamingStatus(Context context,Boolean isStreaming)
    {
        sharedVolksSysPrefs= context.getSharedPreferences(systemVolksData,Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedVolksSysPrefs.edit();
        editor.putBoolean("VolksSystemPara1", isStreaming);
        editor.apply();
    }

    public static Boolean getNowStreamingStatus(Context context)
    {
        sharedVolksSysPrefs=context.getSharedPreferences(systemVolksData,Context.MODE_PRIVATE);
        return sharedVolksSysPrefs.getBoolean("VolksSystemPara1",false);
    }

    public static void setIsBufferingStatus(Context context,Boolean isBuffering)
    {
        sharedVolksSysPrefs= context.getSharedPreferences(systemVolksData,Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedVolksSysPrefs.edit();
        editor.putBoolean("VolksSystemPara2", isBuffering);
        editor.apply();
    }

    public static Boolean getIsBufferingStatus(Context context)
    {
        sharedVolksSysPrefs=context.getSharedPreferences(systemVolksData,Context.MODE_PRIVATE);
        return sharedVolksSysPrefs.getBoolean("VolksSystemPara2",false);
    }

}
