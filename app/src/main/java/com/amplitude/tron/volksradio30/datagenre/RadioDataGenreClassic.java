package com.amplitude.tron.volksradio30.datagenre;

import android.content.Context;

import com.amplitude.tron.volksradio30.NowStreamingRadio;

import java.util.ArrayList;

/**
 * Created by Tron on 1/30/2017.
 */

public class RadioDataGenreClassic {

    private ArrayList<String> ar;

    public void pushStreamOne(Context context)
    {
        ar = new ArrayList<>();
        ar.add("RPR1. Neue Deutsche Welle");
        ar.add("http://streams.rpr1.de/rpr-ndw-128-mp3");
        ar.add("Bonn, Germany");
        ar.add("stream_deutsche_welle_neue_rpr1");
        ar.add("http://i.imgur.com/DYGBVh7.png");
        new NowStreamingRadio().setRadioSharedPreference(context,ar);
        clearArrayData();
    }

    //CLEAR ARRAY DATA MEM MANGER
    private void clearArrayData()
    {
        ar.clear();
    }
}