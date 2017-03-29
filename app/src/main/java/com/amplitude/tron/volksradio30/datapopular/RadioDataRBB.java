package com.amplitude.tron.volksradio30.datapopular;

import android.content.Context;

import com.amplitude.tron.volksradio30.NowStreamingRadio;

import java.util.ArrayList;

/**
 * Created by Tron on 2/5/2017.
 */

public class RadioDataRBB {

    private ArrayList<String> ar;

    //CLEAR ARRAY DATA MEM MANGER
    private void clearArrayData()
    {
        ar.clear();
    }

    public void pushStreamOne(Context context)
    {
        ar = new ArrayList<>();
        ar.add("RBB Antenne Brandenburg");
        ar.add("http://rbb-mp3-antenneb-m.akacast.akamaistream.net/7/516/292092/v1/gnl.akacast.akamaistream.net/rbb_mp3_antenneb_m");
        ar.add("Potsdam, Germany");
        ar.add("stream_rbb_antenne_brandenburg");
        ar.add("http://i.imgur.com/7mCZMkj.png");
        new NowStreamingRadio().setRadioSharedPreference(context,ar);
        clearArrayData();
    }

    public void pushStreamTwo(Context context)
    {
        ar = new ArrayList<>();
        ar.add("RBB Fritz");
        ar.add("http://rbb-mp3-fritz-m.akacast.akamaistream.net/7/799/292093/v1/gnl.akacast.akamaistream.net/rbb_mp3_fritz_m");
        ar.add("Potsdam, Germany");
        ar.add("stream_rbb_fritz");
        ar.add("http://i.imgur.com/TtoTLPY.png");
        new NowStreamingRadio().setRadioSharedPreference(context,ar);
        clearArrayData();
    }

    public void pushStreamThree(Context context)
    {
        ar = new ArrayList<>();
        ar.add("RBB Radio Eins");
        ar.add("http://rbb-mp3-radioeins-m.akacast.akamaistream.net/7/854/292097/v1/gnl.akacast.akamaistream.net/rbb_mp3_radioeins_m");
        ar.add("Potsdam, Germany");
        ar.add("stream_rbb_radio_eins");
        ar.add("http://i.imgur.com/McWh2DL.png");
        new NowStreamingRadio().setRadioSharedPreference(context,ar);
        clearArrayData();
    }

    public void pushStreamFour(Context context)
    {
        ar = new ArrayList<>();
        ar.add("RBB InfoRadio");
        ar.add("http://rbb-mp3-inforadio-m.akacast.akamaistream.net/7/134/292094/v1/gnl.akacast.akamaistream.net/rbb_mp3_inforadio_m");
        ar.add("Berlin, Germany");
        ar.add("stream_rbb_inforadio");
        ar.add("http://i.imgur.com/ur8Fpt8.png");
        new NowStreamingRadio().setRadioSharedPreference(context,ar);
        clearArrayData();
    }

    public void pushStreamFive(Context context)
    {
        ar = new ArrayList<>();
        ar.add("RBB Kulturradio");
        ar.add("http://rbb-mp3-kulturradio-m.akacast.akamaistream.net/7/935/292095/v1/gnl.akacast.akamaistream.net/rbb_mp3_kulturradio_m");
        ar.add("Berlin, Germany");
        ar.add("stream_rbb_kulturradio");
        ar.add("http://i.imgur.com/mqoUT1V.png");
        new NowStreamingRadio().setRadioSharedPreference(context,ar);
        clearArrayData();
    }

    public void pushStreamSix(Context context)
    {
        ar = new ArrayList<>();
        ar.add("RBB radioBERLIN 88,8");
        ar.add("http://rbb-mp3-radioberlin-m.akacast.akamaistream.net/7/70/292096/v1/gnl.akacast.akamaistream.net/rbb_mp3_radioberlin_m");
        ar.add("Berlin, Germany");
        ar.add("stream_rbb_radioberlin_888");
        ar.add("http://i.imgur.com/LxuxvpX.png");
        new NowStreamingRadio().setRadioSharedPreference(context,ar);
        clearArrayData();
    }
}
