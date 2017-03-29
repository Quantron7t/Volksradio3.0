package com.amplitude.tron.volksradio30.datagenre;

import android.content.Context;

import com.amplitude.tron.volksradio30.NowStreamingRadio;

import java.util.ArrayList;

/**
 * Created by Tron on 1/30/2017.
 */

public class RadioDataGenreRock {

    private ArrayList<String> ar;

    //CLEAR ARRAY DATA MEM MANGER
    private void clearArrayData()
    {
        ar.clear();
    }

    public void pushStreamOne(Context context)
    {
        ar = new ArrayList<>();
        ar.add("RauteMusik.FM Rock");
        ar.add("http://rock-high.rautemusik.fm/stream.mp3");
        ar.add("Aachen, Germany");
        ar.add("stream_raute_musik_rock");
        ar.add("http://i.imgur.com/xhhdS13.png");
        new NowStreamingRadio().setRadioSharedPreference(context,ar);
        clearArrayData();
    }

    public void pushStreamTwo(Context context)
    {
        ar = new ArrayList<>();
        ar.add("Antenne Bayern - Rock");
        ar.add("http://mp3channels.webradio.antenne.de/rockantenne");
        ar.add("Munich, Germany");
        ar.add("stream_antenne_bayern_rock");
        ar.add("http://i.imgur.com/JTio2Rc.png");
        new NowStreamingRadio().setRadioSharedPreference(context,ar);
        clearArrayData();
    }

}
