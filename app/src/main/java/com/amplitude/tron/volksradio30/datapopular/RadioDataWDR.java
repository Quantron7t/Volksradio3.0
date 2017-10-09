package com.amplitude.tron.volksradio30.datapopular;

import android.content.Context;

import com.amplitude.tron.volksradio30.NowStreamingRadio;

import java.util.ArrayList;

/**
 * Created by Tron on 2/6/2017.
 */

public class RadioDataWDR {

    private ArrayList<String> ar;

    //CLEAR ARRAY DATA MEM MANGER
    private void clearArrayData()
    {
        ar.clear();
    }

    public void pushStreamOne(Context context)
    {
        ar = new ArrayList<>();
        ar.add("WDR 1LIVE");
        ar.add("http://1live.akacast.akamaistream.net/7/706/119434/v1/gnl.akacast.akamaistream.net/1live");
        ar.add("Cologne, Germany");
        ar.add("stream_wdr_1_live");
        ar.add("http://i.imgur.com/KoXbP1t.png");
        new NowStreamingRadio().setRadioSharedPreference(context,ar);
        clearArrayData();
    }

    public void pushStreamTwo(Context context)
    {
        ar = new ArrayList<>();
        ar.add("WDR 1LIVE Diggi");
        ar.add("http://1live-diggi.akacast.akamaistream.net/7/965/119435/v1/gnl.akacast.akamaistream.net/1live-diggi");
        ar.add("Cologne, Germany");
        ar.add("stream_wdr_1_live_diggi");
        ar.add("http://i.imgur.com/KaHJMfZ.png");
        new NowStreamingRadio().setRadioSharedPreference(context,ar);
        clearArrayData();
    }

    public void pushStreamThree(Context context)
    {
        ar = new ArrayList<>();
        ar.add("WDR 2");
        ar.add("http://wdr-mp3-m-wdr2-koeln.akacast.akamaistream.net/7/812/119456/v1/gnl.akacast.akamaistream.net/wdr-mp3-m-wdr2-koeln");
        ar.add("Cologne, Germany");
        ar.add("stream_wdr_2");
        ar.add("http://i.imgur.com/gKgjiVa.png");
        new NowStreamingRadio().setRadioSharedPreference(context,ar);
        clearArrayData();
    }

    public void pushStreamFour(Context context)
    {
        ar = new ArrayList<>();
        ar.add("WDR 3");
        ar.add("http://wdr-3.akacast.akamaistream.net/7/47/119437/v1/gnl.akacast.akamaistream.net/wdr-3");
        ar.add("Cologne, Germany");
        ar.add("stream_wdr_3");
        ar.add("http://i.imgur.com/JlTpldW.png");
        new NowStreamingRadio().setRadioSharedPreference(context,ar);
        clearArrayData();
    }

    public void pushStreamFive(Context context)
    {
        ar = new ArrayList<>();
        ar.add("WDR 4");
        ar.add("http://wdr-4.akacast.akamaistream.net/7/42/119438/v1/gnl.akacast.akamaistream.net/wdr-4");
        ar.add("Cologne, Germany");
        ar.add("stream_wdr_4");
        ar.add("http://i.imgur.com/QDdawn9.png");
        new NowStreamingRadio().setRadioSharedPreference(context,ar);
        clearArrayData();
    }

    public void pushStreamSix(Context context)
    {
        ar = new ArrayList<>();
        ar.add("WDR 5");
        ar.add("http://wdr-5.akacast.akamaistream.net/7/41/119439/v1/gnl.akacast.akamaistream.net/wdr-5");
        ar.add("Cologne, Germany");
        ar.add("stream_wdr_5");
        ar.add("http://i.imgur.com/pS9HLfm.png");
        new NowStreamingRadio().setRadioSharedPreference(context,ar);
        clearArrayData();
    }

    public void pushStreamSeven(Context context)
    {
        ar = new ArrayList<>();
        ar.add("WDR Event");
        ar.add("http://wdr-mp3-m-event1.akacast.akamaistream.net/7/531/119455/v1/gnl.akacast.akamaistream.net/wdr-mp3-m-event1");
        ar.add("Cologne, Germany");
        ar.add("stream_wdr_event");
        ar.add("[Imgur](http://i.imgur.com/cNUdOXj.png)");
        new NowStreamingRadio().setRadioSharedPreference(context,ar);
        clearArrayData();
    }

    public void pushStreamEight(Context context)
    {
        ar = new ArrayList<>();
        ar.add("WDR Kiraka");
        ar.add("http://kiraka.akacast.akamaistream.net/7/285/119443/v1/gnl.akacast.akamaistream.net/kiraka");
        ar.add("Cologne, Germany");
        ar.add("stream_wdr_kiraka");
        ar.add("http://i.imgur.com/loBlaxo.png");
        new NowStreamingRadio().setRadioSharedPreference(context,ar);
        clearArrayData();
    }

    public void pushStreamNine(Context context)
    {
        ar = new ArrayList<>();
        ar.add("WDR COSMO");
        ar.add("http://funkhaus-europa.akacast.akamaistream.net/7/264/119440/v1/gnl.akacast.akamaistream.net/funkhaus-europa");
        ar.add("Cologne, Germany");
        ar.add("stream_wdr_funkhaus_europa");
        ar.add("http://i.imgur.com/wnTgZc2.png");
        new NowStreamingRadio().setRadioSharedPreference(context,ar);
        clearArrayData();
    }
}
