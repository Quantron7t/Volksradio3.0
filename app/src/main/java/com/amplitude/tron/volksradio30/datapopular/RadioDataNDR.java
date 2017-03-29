package com.amplitude.tron.volksradio30.datapopular;

import android.content.Context;

import com.amplitude.tron.volksradio30.NowStreamingRadio;

import java.util.ArrayList;

/**
 * Created by Tron on 2/6/2017.
 */

public class RadioDataNDR {

    private ArrayList<String> ar;

    //CLEAR ARRAY DATA MEM MANGER
    private void clearArrayData()
    {
        ar.clear();
    }

    public void pushStreamOne(Context context)
    {
        ar = new ArrayList<>();
        ar.add("NDR 90,3");
        ar.add("http://ndr-ndr903-mp3.akacast.akamaistream.net/7/956/273760/v1/gnl.akacast.akamaistream.net/ndr_ndr903_mp3");
        ar.add("Hamburg, Germany");
        ar.add("stream_ndr_903");
        ar.add("http://i.imgur.com/7weWzjP.png");
        new NowStreamingRadio().setRadioSharedPreference(context,ar);
        clearArrayData();
    }

    public void pushStreamTwo(Context context)
    {
        ar = new ArrayList<>();
        ar.add("NDR 1 Niedersachsen");
        ar.add("http://ndr-ndr1-han-mp3.akacast.akamaistream.net/7/807/273766/v1/gnl.akacast.akamaistream.net/ndr_ndr1_han_mp3");
        ar.add("Hannover, Germany");
        ar.add("stream_ndr_1_niedersachsen");
        ar.add("http://i.imgur.com/kJUnhP6.png");
        new NowStreamingRadio().setRadioSharedPreference(context,ar);
        clearArrayData();
    }

    public void pushStreamThree(Context context)
    {
        ar = new ArrayList<>();
        ar.add("NDR Blue");
        ar.add("http://ndr-ndrblue-mp3.akacast.akamaistream.net/7/803/273759/v1/gnl.akacast.akamaistream.net/ndr_ndrblue_mp3");
        ar.add("Hamburg, Germany");
        ar.add("stream_ndr_blue");
        ar.add("http://i.imgur.com/GykEUn7.png");
        new NowStreamingRadio().setRadioSharedPreference(context,ar);
        clearArrayData();
    }

    public void pushStreamFour(Context context)
    {
        ar = new ArrayList<>();
        ar.add("NDR 1 Radio MV");
        ar.add("http://ndr-ndrradiomv-sn-mp3.akacast.akamaistream.net/7/992/273771/v1/gnl.akacast.akamaistream.net/ndr_ndrradiomv_sn_mp3");
        ar.add("Schwerin, Germany");
        ar.add("stream_ndr_1_radio_mv");
        ar.add("http://i.imgur.com/Uas686i.png");
        new NowStreamingRadio().setRadioSharedPreference(context,ar);
        clearArrayData();
    }

    public void pushStreamFive(Context context)
    {
        ar = new ArrayList<>();
        ar.add("NDR 1 Welle Nord");
        ar.add("http://ndr-ndr1wellenord-ki-mp3.akacast.akamaistream.net/7/161/273761/v1/gnl.akacast.akamaistream.net/ndr_ndr1wellenord_ki_mp3");
        ar.add("Flensburg, Germany");
        ar.add("stream_ndr_1_welle_nord");
        ar.add("http://i.imgur.com/u15W7c8.png");
        new NowStreamingRadio().setRadioSharedPreference(context,ar);
        clearArrayData();
    }

    public void pushStreamSix(Context context)
    {
        ar = new ArrayList<>();
        ar.add("NDR 2");
        ar.add("http://ndr-ndr2-nds-mp3.akacast.akamaistream.net/7/400/252763/v1/gnl.akacast.akamaistream.net/ndr_ndr2_nds_mp3");
        ar.add("Hamburg, Germany");
        ar.add("stream_ndr_2");
        ar.add("http://i.imgur.com/SrfzCIF.png");
        new NowStreamingRadio().setRadioSharedPreference(context,ar);
        clearArrayData();
    }

    public void pushStreamSeven(Context context)
    {
        ar = new ArrayList<>();
        ar.add("NDR Kultur");
        ar.add("http://ndr-ndrkultur-mp3.akacast.akamaistream.net/7/527/273758/v1/gnl.akacast.akamaistream.net/ndr_ndrkultur_mp3");
        ar.add("Hamburg, Germany");
        ar.add("stream_ndr_kultur");
        ar.add("http://i.imgur.com/RFPLJLT.png");
        new NowStreamingRadio().setRadioSharedPreference(context,ar);
        clearArrayData();
    }

    public void pushStreamEight(Context context)
    {
        ar = new ArrayList<>();
        ar.add("NDR Info");
        ar.add("http://ndr-ndrinfo-nds-mp3.akacast.akamaistream.net/7/250/273753/v1/gnl.akacast.akamaistream.net/ndr_ndrinfo_nds_mp3");
        ar.add("Hamburg, Germany");
        ar.add("stream_ndr_info");
        ar.add("http://i.imgur.com/KtHxqOU.png");
        new NowStreamingRadio().setRadioSharedPreference(context,ar);
        clearArrayData();
    }

    public void pushStreamNine(Context context)
    {
        ar = new ArrayList<>();
        ar.add("NDR Info Spezial");
        ar.add("http://ndr-ndrinfo-spezial-mp3.akacast.akamaistream.net/7/795/273757/v1/gnl.akacast.akamaistream.net/ndr_ndrinfo_spezial_mp3");
        ar.add("Hamburg, Germany");
        ar.add("stream_ndr_info_spezial");
        ar.add("http://i.imgur.com/5F5v2TB.png");
        new NowStreamingRadio().setRadioSharedPreference(context,ar);
        clearArrayData();
    }

    public void pushStreamTen(Context context)
    {
        ar = new ArrayList<>();
        ar.add("NDR N-JOY");
        ar.add("http://ndr-n-joy-mp3.akacast.akamaistream.net/7/665/273752/v1/gnl.akacast.akamaistream.net/ndr_n-joy_mp3");
        ar.add("Hamburg, Germany");
        ar.add("stream_ndr_njoy");
        ar.add("http://i.imgur.com/SpaaNHO.png");
        new NowStreamingRadio().setRadioSharedPreference(context,ar);
        clearArrayData();
    }

    public void pushStreamEleven(Context context) {
        ar = new ArrayList<>();
        ar.add("NDR N-Joy Top 30");
        ar.add("http://ndr-ndrloop8-hi-mp3.akacast.akamaistream.net/7/762/160823/v1/gnl.akacast.akamaistream.net/ndr_ndrloop8_hi_mp3");
        ar.add("Hamburg, Germany");
        ar.add("stream_ndr_njoy");
        ar.add("http://i.imgur.com/SpaaNHO.png");
        new NowStreamingRadio().setRadioSharedPreference(context, ar);
        clearArrayData();
    }

    public void pushStreamTwelve(Context context) {
        ar = new ArrayList<>();
        ar.add("NDR N-Joy Pop");
        ar.add("http://ndr-ndrloop29-hi-mp3.akacast.akamaistream.net/7/477/160823/v1/gnl.akacast.akamaistream.net/ndr_ndrloop29_hi_mp3");
        ar.add("Hamburg, Germany");
        ar.add("stream_ndr_njoy");
        ar.add("http://i.imgur.com/SpaaNHO.png");
        new NowStreamingRadio().setRadioSharedPreference(context, ar);
        clearArrayData();
    }
}
