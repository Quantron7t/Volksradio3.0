package com.amplitude.tron.volksradio30.datapopular;

import android.content.Context;

import com.amplitude.tron.volksradio30.NowStreamingRadio;

import java.util.ArrayList;

/**
 * Created by Tron on 2/5/2017.
 */

public class RadioDataFFHDigital {

    private ArrayList<String> ar;

    //CLEAR ARRAY DATA MEM MANGER
    private void clearArrayData()
    {
        ar.clear();
    }

    public void pushStreamOne(Context context)
    {
        ar = new ArrayList<>();
        ar.add("FFH Digital Lounge");
        ar.add("http://mp3.ffh.de/ffhchannels/hqlounge.mp3");
        ar.add("Frankfurt, Germany");
        ar.add("stream_ffh_digital_chillout");
        ar.add("http://i.imgur.com/8W4dq05.png");
        new NowStreamingRadio().setRadioSharedPreference(context,ar);
        clearArrayData();
    }

    public void pushStreamTwo(Context context)
    {
        ar = new ArrayList<>();
        ar.add("FFH Digital Deutsch Pur");
        ar.add("http://mp3.ffh.de/ffhchannels/hqdeutsch.mp3");
        ar.add("Frankfurt, Germany");
        ar.add("stream_ffh_digital_deutsch_pur");
        ar.add("http://i.imgur.com/tHQFApt.png");
        new NowStreamingRadio().setRadioSharedPreference(context,ar);
        clearArrayData();
    }

    public void pushStreamThree(Context context)
    {
        ar = new ArrayList<>();
        ar.add("FFH Digital Leider Geil");
        ar.add("http://mp3.ffh.de/ffhchannels/hqvoting.mp3");
        ar.add("Frankfurt, Germany");
        ar.add("stream_ffh_digital_leider_geil");
        ar.add("http://i.imgur.com/mDDA7En.png");
        new NowStreamingRadio().setRadioSharedPreference(context,ar);
        clearArrayData();
    }

    public void pushStreamFour(Context context)
    {
        ar = new ArrayList<>();
        ar.add("FFH Digital Die 80er");
        ar.add("http://mp3.ffh.de/ffhchannels/hq80er.mp3");
        ar.add("Frankfurt, Germany");
        ar.add("stream_ffh_digital_die_80er");
        ar.add("http://i.imgur.com/JKmTPmK.png");
        new NowStreamingRadio().setRadioSharedPreference(context,ar);
        clearArrayData();
    }

    public void pushStreamFive(Context context)
    {
        ar = new ArrayList<>();
        ar.add("FFH Digital Die 90er");
        ar.add("http://mp3.ffh.de/ffhchannels/hqspezial.mp3");
        ar.add("Frankfurt, Germany");
        ar.add("stream_ffh_digital_die_90er");
        ar.add("http://i.imgur.com/7NGALQd.png");
        new NowStreamingRadio().setRadioSharedPreference(context,ar);
        clearArrayData();
    }

    public void pushStreamSix(Context context)
    {
        ar = new ArrayList<>();
        ar.add("FFH iTunes Top 40");
        ar.add("http://mp3.ffh.de/ffhchannels/hqtop40.mp3");
        ar.add("Frankfurt, Germany");
        ar.add("stream_ffh_digital_top40");
        ar.add("http://i.imgur.com/zVILuTe.png");
        new NowStreamingRadio().setRadioSharedPreference(context,ar);
        clearArrayData();
    }

    public void pushStreamSeven(Context context)
    {
        ar = new ArrayList<>();
        ar.add("FFH Digital Rock");
        ar.add("http://mp3.ffh.de/ffhchannels/hqrock.mp3");
        ar.add("Frankfurt, Germany");
        ar.add("stream_ffh_digital_rock");
        ar.add("http://i.imgur.com/AkoVlF9.png");
        new NowStreamingRadio().setRadioSharedPreference(context,ar);
        clearArrayData();
    }

    public void pushStreamEight(Context context)
    {
        ar = new ArrayList<>();
        ar.add("FFH Digital Schlagerkult");
        ar.add("http://mp3.ffh.de/ffhchannels/hqschlager.mp3");
        ar.add("Frankfurt, Germany");
        ar.add("stream_ffh_radio_schlagerkult");
        ar.add("http://i.imgur.com/4HzH7R5.png");
        new NowStreamingRadio().setRadioSharedPreference(context,ar);
        clearArrayData();
    }

    public void pushStreamNine(Context context)
    {
        ar = new ArrayList<>();
        ar.add("FFH Digital Soundtrack");
        ar.add("http://mp3.ffh.de/ffhchannels/hqsoundtrack.mp3");
        ar.add("Frankfurt, Germany");
        ar.add("stream_ffh_digital_soundtrack");
        ar.add("http://i.imgur.com/Q9PFJmS.png");
        new NowStreamingRadio().setRadioSharedPreference(context,ar);
        clearArrayData();
    }

    public void pushStreamTen(Context context)
    {
        ar = new ArrayList<>();
        ar.add("FFH Digital Eurodance");
        ar.add("http://mp3.ffh.de/ffhchannels/hqeurodance.mp3");
        ar.add("Frankfurt, Germany");
        ar.add("stream_ffh_digital_eurodance");
        ar.add("http://i.imgur.com/bu3xY5R.png");
        new NowStreamingRadio().setRadioSharedPreference(context,ar);
        clearArrayData();
    }

    public void pushStreamEleven(Context context)
    {
        ar = new ArrayList<>();
        ar.add("FFH Digital Konfetti-Hits");
        ar.add("http://mp3.ffh.de/ffhchannels/hqspezial1.mp3");
        ar.add("Frankfurt, Germany");
        ar.add("stream_ffh_digital_konfetti_hits");
        ar.add("http://i.imgur.com/RQXONII.png");
        new NowStreamingRadio().setRadioSharedPreference(context,ar);
        clearArrayData();
    }

    public void pushStreamTwelve(Context context)
    {
        ar = new ArrayList<>();
        ar.add("FFH Digital Nachrichten");
        ar.add("http://resource.ffh.de/news/news.mp3");
        ar.add("Frankfurt, Germany");
        ar.add("stream_ffh_radio_news");
        ar.add("http://i.imgur.com/HDMrIyQ.jpg");
        new NowStreamingRadio().setRadioSharedPreference(context,ar);
        clearArrayData();
    }

    public void pushStreamThirteen(Context context)
    {
        ar = new ArrayList<>();
        ar.add("FFH Digital Weihnachtsradio");
        ar.add("http://mp3.ffh.de/ffhchannels/hqxmas.mp3");
        ar.add("Frankfurt, Germany");
        ar.add("stream_ffh_digital_weihnachtsradio");
        ar.add("http://i.imgur.com/8M9dQht.png");
        new NowStreamingRadio().setRadioSharedPreference(context,ar);
        clearArrayData();
    }

    public void pushStreamFourteen(Context context)
    {
        ar = new ArrayList<>();
        ar.add("FFH Digital Brandneu");
        ar.add("http://mp3.ffh.de/ffhchannels/brandneu.mp3");
        ar.add("Frankfurt, Germany");
        ar.add("stream_ffh_digital_brandneu");
        ar.add("http://i.imgur.com/rt7kvmD.png");
        new NowStreamingRadio().setRadioSharedPreference(context,ar);
        clearArrayData();
    }

}
