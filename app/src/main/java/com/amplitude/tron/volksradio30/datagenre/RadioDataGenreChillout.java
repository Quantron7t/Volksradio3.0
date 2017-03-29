package com.amplitude.tron.volksradio30.datagenre;

import android.content.Context;

import com.amplitude.tron.volksradio30.NowStreamingRadio;

import java.util.ArrayList;

/**
 * Created by Tron on 2/4/2017.
 */

public class RadioDataGenreChillout {

    private ArrayList<String> ar;

    //CLEAR ARRAY DATA MEM MANGER
    private void clearArrayData()
    {
        ar.clear();
    }

    public void pushStreamOne(Context context)
    {
        ar = new ArrayList<>();
        ar.add("");
        ar.add("");
        ar.add("");
        ar.add("");
        ar.add("");
        new NowStreamingRadio().setRadioSharedPreference(context,ar);
        clearArrayData();
    }


}
