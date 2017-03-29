package com.amplitude.tron.volksradio30.datapopular;

import android.content.Context;

import com.amplitude.tron.volksradio30.NowStreamingRadio;

import java.util.ArrayList;

/**
 * Created by Tron on 2/5/2017.
 */

public class RadioDataHitradioRT1 {

    private ArrayList<String> ar;

    //CLEAR ARRAY DATA MEM MANGER
    private void clearArrayData()
    {
        ar.clear();
    }

    public void pushStreamOne(Context context)
    {
        ar = new ArrayList<>();
        ar.add("RT1 Chillhouse");
        ar.add("http://mp3ad.l.nmdn.net/rt1chillhouseag/livestream.mp3");
        ar.add("Augsburg, Germany");
        ar.add("stream_rt1_chillout");
        ar.add("http://i.imgur.com/ONcSi17.png");
        new NowStreamingRadio().setRadioSharedPreference(context,ar);
        clearArrayData();
    }

    public void pushStreamTwo (Context context)
    {
        ar = new ArrayList<>();
        ar.add("RT1 Lounge");
        ar.add("http://mp3ad.l.nmdn.net:80/rt1loungeag/livestream.mp3\n");
        ar.add("Augsburg, Germany");
        ar.add("stream_rt1_lounge");
        ar.add("http://i.imgur.com/ONcSi17.png");
        new NowStreamingRadio().setRadioSharedPreference(context,ar);
        clearArrayData();
    }

    public void pushStreamThree(Context context)
    {
        ar = new ArrayList<>();
        ar.add("RT1 ROCK");
        ar.add("http://mp3ad.l.nmdn.net/rt1rockwl/livestream.mp3");
        ar.add("Augsburg, Germany");
        ar.add("stream_rt1_rock");
        ar.add("http://i.imgur.com/ZX7j0Wf.png");
        new NowStreamingRadio().setRadioSharedPreference(context,ar);
        clearArrayData();
    }

    public void pushStreamFour(Context context)
    {
        ar = new ArrayList<>();
        ar.add("RauteMusik.FM Trance");
        ar.add("http://trance-high.rautemusik.fm/stream.mp3");
        ar.add("Aachen, Germany");
        ar.add("stream_raute_musik_trance");
        ar.add("http://i.imgur.com/4rKdIo1.png");
        new NowStreamingRadio().setRadioSharedPreference(context,ar);
        clearArrayData();
    }

    public void pushStreamFive(Context context)
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
