package com.amplitude.tron.volksradio30.datapopular;

import android.content.Context;

import com.amplitude.tron.volksradio30.NowStreamingRadio;

import java.util.ArrayList;

/**
 * Created by Tron on 2/6/2017.
 */

public class RadioDataSR {

    private ArrayList<String> ar;

    //CLEAR ARRAY DATA MEM MANGER
    private void clearArrayData()
    {
        ar.clear();
    }

    public void pushStreamOne(Context context)
    {
        ar = new ArrayList<>();
        ar.add("SR 1 Europawelle");
        ar.add("http://sr1m.akacast.akamaistream.net/7/725/142685/v1/gnl.akacast.akamaistream.net/sr1m");
        ar.add("Saarbrücken, Germany");
        ar.add("stream_sr_1");
        ar.add("http://i.imgur.com/sKvBUXX.png");
        new NowStreamingRadio().setRadioSharedPreference(context,ar);
        clearArrayData();
    }

    public void pushStreamTwo(Context context)
    {
        ar = new ArrayList<>();
        ar.add("SR 1 Lounge");
        ar.add("http://sr1c2.akacast.akamaistream.net/7/458/142688/v1/gnl.akacast.akamaistream.net/sr1c2");
        ar.add("Saarbrücken, Germany");
        ar.add("stream_sr_1");
        ar.add("http://i.imgur.com/sKvBUXX.png");
        new NowStreamingRadio().setRadioSharedPreference(context,ar);
        clearArrayData();
    }

    public void pushStreamThree(Context context)
    {
        ar = new ArrayList<>();
        ar.add("SR 1 Musiktester");
        ar.add("http://sr1c1.akacast.akamaistream.net/7/461/142688/v1/gnl.akacast.akamaistream.net/sr1c1");
        ar.add("Saarbrücken, Germany");
        ar.add("stream_sr_1");
        ar.add("http://i.imgur.com/sKvBUXX.png");
        new NowStreamingRadio().setRadioSharedPreference(context,ar);
        clearArrayData();
    }

    public void pushStreamFour(Context context)
    {
        ar = new ArrayList<>();
        ar.add("SR 2 KulturRadio");
        ar.add("http://sr2m.akacast.akamaistream.net/7/375/142686/v1/gnl.akacast.akamaistream.net/sr2m");
        ar.add("Saarbrücken, Germany");
        ar.add("stream_sr_2_kulturradio");
        ar.add("http://i.imgur.com/0sJ9nIh.png");
        new NowStreamingRadio().setRadioSharedPreference(context,ar);
        clearArrayData();
    }

    public void pushStreamFive(Context context)
    {
        ar = new ArrayList<>();
        ar.add("SR 2 Off-Beat");
        ar.add("http://sr2c1.akacast.akamaistream.net/7/108/142688/v1/gnl.akacast.akamaistream.net/sr2c1");
        ar.add("Saarbrücken, Germany");
        ar.add("stream_sr_2_off_beat");
        ar.add("http://i.imgur.com/xYgdiH1.png");
        new NowStreamingRadio().setRadioSharedPreference(context,ar);
        clearArrayData();
    }

    public void pushStreamSix(Context context)
    {
        ar = new ArrayList<>();
        ar.add("SR 3 Saarlandwelle");
        ar.add("http://sr3m.akacast.akamaistream.net/7/722/142687/v1/gnl.akacast.akamaistream.net/sr3m");
        ar.add("Saarbrücken, Germany");
        ar.add("stream_sr_3");
        ar.add("http://i.imgur.com/2gtIkLl.png");
        new NowStreamingRadio().setRadioSharedPreference(context,ar);
        clearArrayData();
    }

    public void pushStreamSeven(Context context)
    {
        ar = new ArrayList<>();
        ar.add("SR 3 Schlagerwelt");
        ar.add("http://sr3c1.akacast.akamaistream.net/7/123/142688/v1/gnl.akacast.akamaistream.net/sr3c1");
        ar.add("Saarbrücken, Germany");
        ar.add("stream_sr_3");
        ar.add("http://i.imgur.com/2gtIkLl.png");
        new NowStreamingRadio().setRadioSharedPreference(context,ar);
        clearArrayData();
    }

    public void pushStreamEight(Context context)
    {
        ar = new ArrayList<>();
        ar.add("SR 3 Oldiewelt");
        ar.add("http://sr3c2.akacast.akamaistream.net/7/124/142688/v1/gnl.akacast.akamaistream.net/sr3c2");
        ar.add("Saarbrücken, Germany");
        ar.add("stream_sr_3");
        ar.add("http://i.imgur.com/2gtIkLl.png");
        new NowStreamingRadio().setRadioSharedPreference(context,ar);
        clearArrayData();
    }

    public void pushStreamNine(Context context)
    {
        ar = new ArrayList<>();
        ar.add("103.7 UnserDing");
        ar.add("http://udm.akacast.akamaistream.net/7/384/142688/v1/gnl.akacast.akamaistream.net/udm");
        ar.add("Saarbrücken, Germany");
        ar.add("stream_sr_unserding");
        ar.add("http://i.imgur.com/UuLCeHd.png");
        new NowStreamingRadio().setRadioSharedPreference(context,ar);
        clearArrayData();
    }

    public void pushStreamTen(Context context)
    {
        ar = new ArrayList<>();
        ar.add("SR Unserding Schwarz");
        ar.add("http://udc1.akacast.akamaistream.net/7/28/142688/v1/gnl.akacast.akamaistream.net/udc1");
        ar.add("Saarbrücken, Germany");
        ar.add("stream_sr_unserding");
        ar.add("http://i.imgur.com/UuLCeHd.png");
        new NowStreamingRadio().setRadioSharedPreference(context,ar);
        clearArrayData();
    }

    public void pushStreamEleven(Context context)
    {
        ar = new ArrayList<>();
        ar.add("SR UnserDing Zukunft");
        ar.add("http://udc2.akacast.akamaistream.net/7/27/142688/v1/gnl.akacast.akamaistream.net/udc2");
        ar.add("Saarbrücken, Germany");
        ar.add("stream_sr_unserding");
        ar.add("http://i.imgur.com/UuLCeHd.png");
        new NowStreamingRadio().setRadioSharedPreference(context,ar);
        clearArrayData();
    }

}
