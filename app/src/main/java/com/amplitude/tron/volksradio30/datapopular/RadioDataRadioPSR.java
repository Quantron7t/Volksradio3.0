package com.amplitude.tron.volksradio30.datapopular;

import android.content.Context;

import com.amplitude.tron.volksradio30.NowStreamingRadio;

import java.util.ArrayList;

/**
 * Created by Tron on 2/5/2017.
 */

public class RadioDataRadioPSR {

    private ArrayList<String> ar;

    //CLEAR ARRAY DATA MEM MANGER
    private void clearArrayData()
    {
        ar.clear();
    }

    public void pushStreamOne(Context context)
    {
        ar = new ArrayList<>();
        ar.add("Radio PSR-Chillout");
        ar.add("http://regiocast.hoerradar.de/psr-chillout-mp3-mq");
        ar.add("Leipzig, Germany");
        ar.add("stream_radio_psr_chillout");
        ar.add("http://i.imgur.com/wKbzIUB.png");
        new NowStreamingRadio().setRadioSharedPreference(context,ar);
        clearArrayData();
    }

    public void pushStreamTwo(Context context)
    {
        ar = new ArrayList<>();
        ar.add("Radio PSR");
        ar.add("http://regiocast.hoerradar.de/psr-live-mp3-hq");
        ar.add("Leipzig, Germany");
        ar.add("stream_radio_psr");
        ar.add("http://i.imgur.com/giq7zON.png");
        new NowStreamingRadio().setRadioSharedPreference(context,ar);
        clearArrayData();
    }

    public void pushStreamThree(Context context)
    {
        ar = new ArrayList<>();
        ar.add("Radio PSR Chartbreaker");
        ar.add("http://regiocast.hoerradar.de/psr-chartbreaker-mp3-hq");
        ar.add("Leipzig, Germany");
        ar.add("stream_radio_psr_chartbreaker");
        ar.add("http://i.imgur.com/F3vvylW.png");
        new NowStreamingRadio().setRadioSharedPreference(context,ar);
        clearArrayData();
    }

    public void pushStreamFour(Context context)
    {
        ar = new ArrayList<>();
        ar.add("Radio PSR Partymix");
        ar.add("http://regiocast.hoerradar.de/psr-partymix-mp3-hq");
        ar.add("Leipzig, Germany");
        ar.add("stream_radio_psr_partymix");
        ar.add("http://i.imgur.com/2elY9XC.png");
        new NowStreamingRadio().setRadioSharedPreference(context,ar);
        clearArrayData();
    }

    public void pushStreamFive(Context context)
    {
        ar = new ArrayList<>();
        ar.add("Radio PSR 80er");
        ar.add("http://regiocast.hoerradar.de/psr-80er-mp3-hq");
        ar.add("Leipzig, Germany");
        ar.add("stream_radio_psr_80er");
        ar.add("http://i.imgur.com/0u0hrsj.png");
        new NowStreamingRadio().setRadioSharedPreference(context,ar);
        clearArrayData();
    }

    public void pushStreamSix(Context context)
    {
        ar = new ArrayList<>();
        ar.add("Radio PSR 90er");
        ar.add("http://regiocast.hoerradar.de/psr-90er-mp3-hq");
        ar.add("Leipzig, Germany");
        ar.add("stream_radio_psr_90er");
        ar.add("http://i.imgur.com/Tj3j0JF.png");
        new NowStreamingRadio().setRadioSharedPreference(context,ar);
        clearArrayData();
    }

    public void pushStreamSeven(Context context)
    {
        ar = new ArrayList<>();
        ar.add("Radio PSR Sachsensongs");
        ar.add("http://regiocast.hoerradar.de/psr-sachsensongs-mp3-hq");
        ar.add("Leipzig, Germany");
        ar.add("stream_radio_psr_sachsen_songs");
        ar.add("http://i.imgur.com/5NDtcc4.png");
        new NowStreamingRadio().setRadioSharedPreference(context,ar);
        clearArrayData();
    }

    public void pushStreamEight(Context context)
    {
        ar = new ArrayList<>();
        ar.add("Radio PSR Weihnachts-Superhits");
        ar.add("http://regiocast.hoerradar.de/psr-event01-mp3-mq");
        ar.add("Leipzig, Germany");
        ar.add("stream_radio_psr_weihnacts_superhits");
        ar.add("http://i.imgur.com/mcRg02v.png");
        new NowStreamingRadio().setRadioSharedPreference(context,ar);
        clearArrayData();
    }

    public void pushStreamNine(Context context)
    {
        ar = new ArrayList<>();
        ar.add("RADIO PSR Sinnlos-Telefon");
        ar.add("http://regiocast.hoerradar.de/psr-sinnlostelefon-mp3-mq");
        ar.add("Leipzig, Germany");
        ar.add("stream_radio_psr_sinnlos_telefon");
        ar.add("http://i.imgur.com/hr2Qeo6.png");
        new NowStreamingRadio().setRadioSharedPreference(context,ar);
        clearArrayData();
    }

    public void pushStreamTen(Context context)
    {
        ar = new ArrayList<>();
        ar.add("RADIO PSR Sommerhits");
        ar.add("http://regiocast.hoerradar.de/psr-sommerhits-mp3-mq");
        ar.add("Leipzig, Germany");
        ar.add("stream_radio_psr_sommerhits");
        ar.add("http://i.imgur.com/aY9xtVC.png");
        new NowStreamingRadio().setRadioSharedPreference(context,ar);
        clearArrayData();
    }
}
