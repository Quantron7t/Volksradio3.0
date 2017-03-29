package com.amplitude.tron.volksradio30.datapopular;


import android.content.Context;

import com.amplitude.tron.volksradio30.NowStreamingRadio;

import java.util.ArrayList;

public class RadioDataHessischenRundfunks {

    private ArrayList<String> ar;

    //CLEAR ARRAY DATA MEM MANGER
    private void clearArrayData()
    {
        ar.clear();
    }

    public void pushStreamOne(Context context)
    {
        ar = new ArrayList<>();
        ar.add("HR Info");
        ar.add("http://www.metafilegenerator.de/HR/hrinfo/mp3/gffstream_mv_mp3_w108a.mp3");
        ar.add("Frankfurt, Germany");
        ar.add("stream_hr_info");
        ar.add("http://i.imgur.com/42MihzM.jpg");
        new NowStreamingRadio().setRadioSharedPreference(context,ar);
        clearArrayData();
    }

    public void pushStreamTwo(Context context)
    {
        ar = new ArrayList<>();
        ar.add("HR 1");
        ar.add("http://hr-mp3-m-h1.akacast.akamaistream.net/7/783/142131/v1/gnl.akacast.akamaistream.net/hr-mp3-m-h1");
        ar.add("Frankfurt, Germany");
        ar.add("stream_hr_eins");
        ar.add("http://i.imgur.com/LxFRXpi.png");
        new NowStreamingRadio().setRadioSharedPreference(context,ar);
        clearArrayData();
    }

    public void pushStreamThree(Context context)
    {
        ar = new ArrayList<>();
        ar.add("HR 2");
        ar.add("http://hr-mp3-m-h2.akacast.akamaistream.net/7/786/142132/v1/gnl.akacast.akamaistream.net/hr-mp3-m-h2");
        ar.add("Frankfurt, Germany");
        ar.add("stream_hr_zwei");
        ar.add("http://i.imgur.com/duYSu9X.png");
        new NowStreamingRadio().setRadioSharedPreference(context,ar);
        clearArrayData();
    }

    public void pushStreamFour(Context context)
    {
        ar = new ArrayList<>();
        ar.add("HR 3");
        ar.add("http://hr-mp3-m-h3.akacast.akamaistream.net/7/785/142133/v1/gnl.akacast.akamaistream.net/hr-mp3-m-h3");
        ar.add("Frankfurt, Germany");
        ar.add("stream_hr_drei");
        ar.add("http://i.imgur.com/NrmCUGm.png");
        new NowStreamingRadio().setRadioSharedPreference(context,ar);
        clearArrayData();
    }

    public void pushStreamFive(Context context)
    {
        ar = new ArrayList<>();
        ar.add("HR 4");
        ar.add("http://hr-mp3-m-h4.akacast.akamaistream.net/7/780/142134/v1/gnl.akacast.akamaistream.net/hr-mp3-m-h4");
        ar.add("Frankfurt, Germany");
        ar.add("stream_hr_vier");
        ar.add("http://i.imgur.com/RxoakOH.png");
        new NowStreamingRadio().setRadioSharedPreference(context,ar);
        clearArrayData();
    }

    public void pushStreamSix(Context context)
    {
        ar = new ArrayList<>();
        ar.add("YOU FM YOUNG FRESH MUSIC");
        ar.add("http://hr-mp3-m-youfm.akacast.akamaistream.net/7/246/142136/v1/gnl.akacast.akamaistream.net/hr-mp3-m-youfm");
        ar.add("Frankfurt, Germany");
        ar.add("stream_hr_youfm");
        ar.add("http://i.imgur.com/FSISnfJ.png");
        new NowStreamingRadio().setRadioSharedPreference(context,ar);
        clearArrayData();
    }

    public void pushStreamSeven(Context context)
    {
        ar = new ArrayList<>();
        ar.add("YOU FM Club");
        ar.add("http://hr-mp3-m-youfm-club.akacast.akamaistream.net/7/910/142137/v1/gnl.akacast.akamaistream.net/hr-mp3-m-youfm_club");
        ar.add("Frankfurt, Germany");
        ar.add("stream_hr_youfm_club");
        ar.add("http://i.imgur.com/rLoA0Ns.png");
        new NowStreamingRadio().setRadioSharedPreference(context,ar);
        clearArrayData();
    }

}
