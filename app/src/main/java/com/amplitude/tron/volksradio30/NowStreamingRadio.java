package com.amplitude.tron.volksradio30;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Tron on 1/29/2017.
 */

public class NowStreamingRadio {

    private static ArrayList<String> data;

    private static SharedPreferences radioInformation;
    private static String radioData="streamRadioData";

    public void setRadioSharedPreference(Context context, ArrayList<String> data){
        //CHECK IF URL RECEIVED IS SAME AND CHECK IS STREAMING THE LINK
        if (data.get(1).equals(getCurrentRadioUrl(context))&&VolksMediaConstant.getIsStreamPlaying())
        {
            Toast.makeText(context, "Playing the same station!", Toast.LENGTH_LONG).show();
        }
        else
        {
            //TELL THE SERVICE ITS A NEW PUSH
            VolksMediaConstant.setIsNewPush(true);
            radioInformation = context.getSharedPreferences(radioData, Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = radioInformation.edit();
            editor.putString("radioName", data.get(0));
            editor.putString("radioUrl", data.get(1));
            editor.putString("radioLocation",data.get(2));
            editor.putString("radioThumbnail",data.get(3));
            editor.putString("radioArt",data.get(4));
            editor.apply();
            Intent intent = new Intent(context,VolksPlayerService.class);
            intent.setAction("com.amplitude.tron.volksradio30.PLAY");
            context.startService(intent);
        }
    }

    static ArrayList<String> getRadioInformation(Context context){

        radioInformation = context.getSharedPreferences(radioData, Context.MODE_PRIVATE);
        data = new ArrayList<>();
        data.add(radioInformation.getString("radioName","unavailable"));
        data.add(radioInformation.getString("radioUrl","unavailable"));
        data.add(radioInformation.getString("radioLocation","unavailable"));
        data.add(radioInformation.getString("radioThumbnail","unavailable"));
        data.add(radioInformation.getString("radioArt","unavailable"));
        return data;
    }

    public static String getCurrentRadioUrl(Context context)
    {
        radioInformation = context.getSharedPreferences(radioData, Context.MODE_PRIVATE);
        return radioInformation.getString("radioUrl","unavailable");
    }

    public static void clearArrayList()
    {
        data.clear();
    }
}
