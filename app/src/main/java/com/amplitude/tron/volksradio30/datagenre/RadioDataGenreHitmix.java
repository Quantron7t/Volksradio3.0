package com.amplitude.tron.volksradio30.datagenre;

import android.content.Context;

import com.amplitude.tron.volksradio30.NowStreamingRadio;

import java.util.ArrayList;

/**
 * Created by Tron on 1/30/2017.
 */

public class RadioDataGenreHitmix {
    private ArrayList<String> ar;

    //CLEAR ARRAY DATA MEM MANGER
    private void clearArrayData()
    {
        ar.clear();
    }

    public void pushStreamOne(Context context)
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

    public void pushStreamTwo(Context context)
    {
        ar = new ArrayList<>();
        ar.add("Charivari Party hitmix");
        ar.add("http://rs5.stream24.net:8000/stream");
        ar.add("Munich, Germany");
        ar.add("stream_charivari_hitmix");
        ar.add("http://i.imgur.com/kJwMbn4.png");
        new NowStreamingRadio().setRadioSharedPreference(context,ar);
        clearArrayData();
    }

}
