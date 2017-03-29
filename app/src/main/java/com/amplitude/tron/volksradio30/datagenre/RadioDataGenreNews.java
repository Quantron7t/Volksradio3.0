package com.amplitude.tron.volksradio30.datagenre;

import android.content.Context;

import com.amplitude.tron.volksradio30.NowStreamingRadio;

import java.util.ArrayList;

/**
 * Created by Tron on 1/30/2017.
 */

public class RadioDataGenreNews {

    private ArrayList<String> ar;

    //CLEAR ARRAY DATA MEM MANGER
    private void clearArrayData()
    {
        ar.clear();
    }

    public void pushStreamOne(Context context)
    {
        ar = new ArrayList<>();
        ar.add("Deutschlandfunk Nachrichten");
        ar.add("http://dradio_mp3_dlf_m.akacast.akamaistream.net/7/249/142684/v1/gnl.akacast.akamaistream.net/dradio_mp3_dlf_m");
        ar.add("Cologne, Germany");
        ar.add("stream_deutschlandfunk_news");
        ar.add("http://i.imgur.com/eDCSe1N.png");
        new NowStreamingRadio().setRadioSharedPreference(context,ar);
        clearArrayData();
    }

    public void pushStreamTwo(Context context)
    {
        ar = new ArrayList<>();
        ar.add("B5 Aktuell");
        ar.add("http://br-mp3-b5aktuell-m.akacast.akamaistream.net/7/779/142694/v1/gnl.akacast.akamaistream.net/br_mp3_b5aktuell_m");
        ar.add("Munich, Germany");
        ar.add("stream_br_b5_aktuell");
        ar.add("http://i.imgur.com/FI86iP2.png");
        new NowStreamingRadio().setRadioSharedPreference(context,ar);
        clearArrayData();
    }
}
