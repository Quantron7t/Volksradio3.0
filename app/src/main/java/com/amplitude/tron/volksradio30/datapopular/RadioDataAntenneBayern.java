package com.amplitude.tron.volksradio30.datapopular;


import android.content.Context;

import com.amplitude.tron.volksradio30.NowStreamingRadio;

import java.util.ArrayList;

public class RadioDataAntenneBayern {

    private ArrayList<String> ar;

    //CLEAR ARRAY DATA MEM MANGER
    private void clearArrayData()
    {
        ar.clear();
    }

    public void pushStreamOne(Context context)
    {
       ar = new ArrayList<>();
       ar.add("Antenne Bayern");
       ar.add("http://mp3channels.webradio.antenne.de:80/antenne");
       ar.add("Munich, Germany");
       ar.add("stream_antenne_bayern_main");
       ar.add("http://i.imgur.com/vAyCoqd.png");
       new NowStreamingRadio().setRadioSharedPreference(context,ar);
       clearArrayData();
    }

    public void pushStreamTwo(Context context)
    {
        ar = new ArrayList<>();
        ar.add("Antenne Bayern - Chillout");
        ar.add("http://mp3channels.webradio.antenne.de:80/chillout");
        ar.add("Munich, Germany");
        ar.add("stream_antenne_bayern_chillout");
        ar.add("http://i.imgur.com/QGgXkrp.png");
        new NowStreamingRadio().setRadioSharedPreference(context,ar);
        clearArrayData();
    }

    public void pushStreamThree(Context context)
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

    public void pushStreamFour(Context context)
    {
        ar = new ArrayList<>();
        ar.add("Antenne Bayern - Hitmix");
        ar.add("http://mp3channels.webradio.antenne.de:80/hitmix");
        ar.add("Munich, Germany");
        ar.add("stream_antenne_bayern_hitmix");
        ar.add("http://i.imgur.com/AzDpzT5.png");
        new NowStreamingRadio().setRadioSharedPreference(context,ar);
        clearArrayData();
    }

    public void pushStreamFive(Context context)
    {
        ar = new ArrayList<>();
        ar.add("Antenne Bayern - Top40");
        ar.add("http://mp3channels.webradio.antenne.de:80/top-40");
        ar.add("Munich, Germany");
        ar.add("stream_antenne_bayern_top40");
        ar.add("http://i.imgur.com/QYE8XDG.png");
        new NowStreamingRadio().setRadioSharedPreference(context,ar);
        clearArrayData();
    }

}
