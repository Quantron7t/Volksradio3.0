package com.amplitude.tron.volksradio30.datagenre;

import android.content.Context;

import com.amplitude.tron.volksradio30.NowStreamingRadio;

import java.util.ArrayList;

/**
 * Created by Tron on 1/30/2017.
 */

public class RadioDataGenreSports {

    private ArrayList<String> ar;

    //CLEAR ARRAY DATA MEM MANGER
    private void clearArrayData()
    {
        ar.clear();
    }

    public void pushStreamOne(Context context)
    {
        ar = new ArrayList<>();
        ar.add("Sport1.fm");
        ar.add("http://19523.live.streamtheworld.com/SPORT1FM_24_7.mp3");
        ar.add("Ismaning, Germany");
        ar.add("stream_sport1fm");
        ar.add("http://i.imgur.com/lYpCDK2.png");
        new NowStreamingRadio().setRadioSharedPreference(context,ar);
        clearArrayData();
    }

  /*  public void pushStreamTwo(Context context)
    {
        ar = new ArrayList<>();
        ar.add("RT1 Sport");
        ar.add("http://19523.live.streamtheworld.com/SPORT1FM_24_7.mp3");
        ar.add("Augsburg, Germany");
        ar.add("stream_sport1fm");
        ar.add("http://i.imgur.com/jJbyKdQ.png");
        new NowStreamingRadio().setRadioSharedPreference(context,ar);
        clearArrayData();
    }*/

}
