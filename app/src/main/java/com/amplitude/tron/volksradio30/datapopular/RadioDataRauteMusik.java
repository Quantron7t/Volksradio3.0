package com.amplitude.tron.volksradio30.datapopular;

import android.content.Context;

import com.amplitude.tron.volksradio30.NowStreamingRadio;

import java.util.ArrayList;

/**
 * Created by Tron on 2/5/2017.
 */

public class RadioDataRauteMusik {

    private ArrayList<String> ar;

    //CLEAR ARRAY DATA MEM MANGER
    private void clearArrayData()
    {
        ar.clear();
    }

    public void pushStreamOne(Context context)
    {
        ar = new ArrayList<>();
        ar.add("RauteMusik.FM Chillout/Lounge");
        ar.add("http://lounge-high.rautemusik.fm/stream.mp3");
        ar.add("Aachen, Germany");
        ar.add("stream_raute_musik_chillout");
        ar.add("http://i.imgur.com/5Sw9ocZ.png");
        new NowStreamingRadio().setRadioSharedPreference(context,ar);
        clearArrayData();
    }

    public void pushStreamTwo(Context context)
    {
        ar = new ArrayList<>();
        ar.add("RauteMusik.FM PartyHits");
        ar.add("http://partyhits-high.rautemusik.fm/stream.mp3");
        ar.add("Aachen, Germany");
        ar.add("stream_raute_musik_hitmix");
        ar.add("http://i.imgur.com/H2Gz8rS.png");
        new NowStreamingRadio().setRadioSharedPreference(context,ar);
        clearArrayData();
    }

    public void pushStreamThree(Context context)
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
