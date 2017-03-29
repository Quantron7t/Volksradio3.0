package com.amplitude.tron.volksradio30.datapopular;

import android.content.Context;

import com.amplitude.tron.volksradio30.NowStreamingRadio;

import java.util.ArrayList;

/**
 * Created by Tron on 2/5/2017.
 */

public class RadioDataGong963 {

    private ArrayList<String> ar;

    //CLEAR ARRAY DATA MEM MANGER
    private void clearArrayData()
    {
        ar.clear();
    }

    public void pushStreamOne(Context context)
    {
        ar = new ArrayList<>();
        ar.add("Gong 96.3 Münchens Relaxed");
        ar.add("http://mp3.radiogong963.c.nmdn.net/ps-radiogongrelaxed/livestream.mp3");
        ar.add("Munich, Germany");
        ar.add("stream_radio_gong_chillout");
        ar.add("http://i.imgur.com/bHZ1wYe.jpg");
        new NowStreamingRadio().setRadioSharedPreference(context,ar);
        clearArrayData();
    }

    public void pushStreamTwo(Context context)
    {
        ar = new ArrayList<>();
        ar.add("Gong 96.3");
        ar.add("http://mp3.radiogong963.c.nmdn.net/ps-radiogong963/livestream.mp3");
        ar.add("Munich, Germany");
        ar.add("stream_radio_gong_963");
        ar.add("http://i.imgur.com/RRyo285.png");
        new NowStreamingRadio().setRadioSharedPreference(context,ar);
        clearArrayData();
    }

    public void pushStreamThree(Context context)
    {
        ar = new ArrayList<>();
        ar.add("Gong 96.3 Münchens Top50");
        ar.add("http://mp3.radiogong963.c.nmdn.net/ps-radiogongtop50/livestream.mp3");
        ar.add("Munich, Germany");
        ar.add("stream_radio_gong_top50");
        ar.add("http://i.imgur.com/RnIZ17J.jpg");
        new NowStreamingRadio().setRadioSharedPreference(context,ar);
        clearArrayData();
    }

    public void pushStreamFour(Context context)
    {
        ar = new ArrayList<>();
        ar.add("Gong 96.3 Wiesn Hits");
        ar.add("http://mp3.radiogong963.c.nmdn.net/ps-radiogongevent/livestream.mp3");
        ar.add("Munich, Germany");
        ar.add("stream_radio_gong_wiesn_hits");
        ar.add("http://i.imgur.com/iQHGO7W.png");
        new NowStreamingRadio().setRadioSharedPreference(context,ar);
        clearArrayData();
    }

    public void pushStreamFive(Context context)
    {
        ar = new ArrayList<>();
        ar.add("Gong 96.3 Weihnachts-Hits");
        ar.add("http://mp3.radiogong963.c.nmdn.net/ps-radiogongchannel6/livestream.mp3");
        ar.add("Munich, Germany");
        ar.add("stream_radio_gong_weinachts_hits");
        ar.add("");
        new NowStreamingRadio().setRadioSharedPreference(context,ar);
        clearArrayData();
    }

    public void pushStreamSix(Context context)
    {
        ar = new ArrayList<>();
        ar.add("Gong 96.3 Partygong");
        ar.add("http://mp3.radiogong963.c.nmdn.net/ps-radiogongchannel5/livestream.mp3");
        ar.add("Munich, Germany");
        ar.add("stream_radio_gong_partygong");
        ar.add("http://i.imgur.com/l3f8atW.png");
        new NowStreamingRadio().setRadioSharedPreference(context,ar);
        clearArrayData();
    }

    public void pushStreamSeven(Context context)
    {
        ar = new ArrayList<>();
        ar.add("Gong 96.3 Kulthits");
        ar.add("http://mp3.radiogong963.c.nmdn.net/ps-radiogongchannel4/livestream.mp3");
        ar.add("Munich, Germany");
        ar.add("stream_radio_gong_kulthits");
        ar.add("http://i.imgur.com/YLG81kP.png");
        new NowStreamingRadio().setRadioSharedPreference(context,ar);
        clearArrayData();
    }


}
