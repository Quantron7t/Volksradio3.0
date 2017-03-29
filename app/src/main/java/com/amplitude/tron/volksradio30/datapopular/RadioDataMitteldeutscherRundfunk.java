package com.amplitude.tron.volksradio30.datapopular;

import android.content.Context;

import com.amplitude.tron.volksradio30.NowStreamingRadio;

import java.util.ArrayList;

/**
 * Created by Tron on 2/5/2017.
 */

public class RadioDataMitteldeutscherRundfunk {

    private ArrayList<String> ar;

    //CLEAR ARRAY DATA MEM MANGER
    private void clearArrayData()
    {
        ar.clear();
    }

    public void pushStreamOne(Context context)
    {
        ar = new ArrayList<>();
        ar.add("MDR SPUTNIK Insomnia Channel");
        ar.add("http://c22033-l.i.core.cdn.streamfarm.net/22033mdr/live/3087mdr_sputnik/ch_insomnia_128.mp3");
        ar.add("Halle, Germany");
        ar.add("stream_mdr_sputnik_all");
        ar.add("http://i.imgur.com/tI7bPVT.png");
        new NowStreamingRadio().setRadioSharedPreference(context,ar);
        clearArrayData();
    }

    public void pushStreamTwo(Context context)
    {
        ar = new ArrayList<>();
        ar.add("MDR AKTUELL Livestream");
        ar.add("http://c22033-ls.i.core.cdn.streamfarm.net/QpZptC4ta9922033/22033mdr/live/app2128740352/w2128904192/live_de_128.mp3");
        ar.add("Leipzig, Germany");
        ar.add("stream_mdr_aktuell_livestream");
        ar.add("http://i.imgur.com/g8nk6cP.png");
        new NowStreamingRadio().setRadioSharedPreference(context,ar);
        clearArrayData();
    }

    public void pushStreamThree(Context context)
    {
        ar = new ArrayList<>();
        ar.add("MDR KULTUR Livestream");
        ar.add("http://c22033-ls.i.core.cdn.streamfarm.net/HZSKMnDUg9922033/22033mdr/live/app2128740352/w2128904193/live_de_128.mp3");
        ar.add("Halle, Germany");
        ar.add("stream_mdr_kultur_livestream");
        ar.add("http://i.imgur.com/BcR2AkV.png");
        new NowStreamingRadio().setRadioSharedPreference(context,ar);
        clearArrayData();
    }

    public void pushStreamFour(Context context)
    {
        ar = new ArrayList<>();
        ar.add("MDR 1 Radio Sachsen");
        ar.add("http://c22033-ls.i.core.cdn.streamfarm.net/Ohu6jU56x9922033/22033mdr/live/app2128740352/w2128904197/live_de_128.mp3");
        ar.add("Dresden, Germany");
        ar.add("stream_mdr_1_radio_sachsen");
        ar.add("http://i.imgur.com/YEAja99.png");
        new NowStreamingRadio().setRadioSharedPreference(context,ar);
        clearArrayData();
    }

    public void pushStreamFive(Context context)
    {
        ar = new ArrayList<>();
        ar.add("MDR 1 Radio Sachsen-Anhalt");
        ar.add("http://c22033-ls.i.core.cdn.streamfarm.net/Z0nRRFVT49922033/22033mdr/live/app2128740352/w2128904198/live_de_128.mp3");
        ar.add("Magdeburg, Germany");
        ar.add("stream_mdr_1_radio_sachsen_anhalt");
        ar.add("http://i.imgur.com/8DODJKu.png");
        new NowStreamingRadio().setRadioSharedPreference(context,ar);
        clearArrayData();
    }

    public void pushStreamSix(Context context)
    {
        ar = new ArrayList<>();
        ar.add("MDR 1 Radio Thüringen");
        ar.add("http://c22033-ls.i.core.cdn.streamfarm.net/9lBrdAv9G9922033/22033mdr/live/app2128740352/w2128904199/live_de_128.mp3");
        ar.add("Erfurt, Germany");
        ar.add("stream_mdr_1_radio_thuringen");
        ar.add("http://i.imgur.com/WcMAoDk.png");
        new NowStreamingRadio().setRadioSharedPreference(context,ar);
        clearArrayData();
    }

    public void pushStreamSeven(Context context)
    {
        ar = new ArrayList<>();
        ar.add("MDR KULTUR FIGARINO");
        ar.add("http://c22033-l.i.core.cdn.streamfarm.net/22033mdr/live/3087mdr_figaro/ch_figarino_128.mp3");
        ar.add("Halle, Germany");
        ar.add("stream_mdr_kultur_figarino");
        ar.add("http://i.imgur.com/gBhxvOk.png");
        new NowStreamingRadio().setRadioSharedPreference(context,ar);
        clearArrayData();
    }

    public void pushStreamEight(Context context)
    {
        ar = new ArrayList<>();
        ar.add("MDR KLASSIK Livestream");
        ar.add("http://c22033-ls.i.core.cdn.streamfarm.net/spmL904bJ9922033/22033mdr/live/app2128740352/w2128904196/live_de_128.mp3");
        ar.add("Halle, Germany");
        ar.add("stream_mdr_klassik_livestream");
        ar.add("http://i.imgur.com/3XfS1sA.png");
        new NowStreamingRadio().setRadioSharedPreference(context,ar);
        clearArrayData();
    }

    public void pushStreamNine(Context context)
    {
        ar = new ArrayList<>();
        ar.add("");
        ar.add("");
        ar.add("");
        ar.add("");
        ar.add("");
        new NowStreamingRadio().setRadioSharedPreference(context,ar);
        clearArrayData();
    }
}
