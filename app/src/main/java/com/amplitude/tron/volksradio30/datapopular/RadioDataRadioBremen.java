package com.amplitude.tron.volksradio30.datapopular;

import android.content.Context;

import com.amplitude.tron.volksradio30.NowStreamingRadio;

import java.util.ArrayList;

/**
 * Created by Tron on 2/6/2017.
 */

public class RadioDataRadioBremen {

    private ArrayList<String> ar;

    //CLEAR ARRAY DATA MEM MANGER
    private void clearArrayData() {
        ar.clear();
    }

    public void pushStreamOne(Context context) {
        ar = new ArrayList<>();
        ar.add("Bremen Eins");
        ar.add("http://rb-mp3-m-bremeneins.akacast.akamaistream.net/7/716/234436/v1/gnl.akacast.akamaistream.net/rb-mp3-m-bremeneins");
        ar.add("Bremen, Germany");
        ar.add("stream_radio_bremen_eins");
        ar.add("http://i.imgur.com/tYtGUli.png");
        new NowStreamingRadio().setRadioSharedPreference(context, ar);
        clearArrayData();
    }

    public void pushStreamTwo(Context context) {
        ar = new ArrayList<>();
        ar.add("Bremen Vier");
        ar.add("http://rb-mp3-m-bremenvier.akacast.akamaistream.net/7/23/234437/v1/gnl.akacast.akamaistream.net/rb-mp3-m-bremenvier");
        ar.add("Bremen, Germany");
        ar.add("stream_radio_bremen_vier");
        ar.add("http://i.imgur.com/eAeAQ9x.png");
        new NowStreamingRadio().setRadioSharedPreference(context, ar);
        clearArrayData();
    }

    public void pushStreamThree(Context context) {
        ar = new ArrayList<>();
        ar.add("Bremen Next");
        ar.add("http://rb-mp3-m-bremennext.akacast.akamaistream.net/7/705/234439/v1/gnl.akacast.akamaistream.net/rb-mp3-m-bremennext");
        ar.add("Bremen, Germany");
        ar.add("stream_radio_bremen_next");
        ar.add("http://i.imgur.com/CMVmfCq.png");
        new NowStreamingRadio().setRadioSharedPreference(context, ar);
        clearArrayData();
    }

    public void pushStreamFour(Context context) {
        ar = new ArrayList<>();
        ar.add("Nordwestradio");
        ar.add("http://rb-mp3-m-nordwestradio.akacast.akamaistream.net/7/639/234438/v1/gnl.akacast.akamaistream.net/rb-mp3-m-nordwestradio");
        ar.add("Bremen, Germany");
        ar.add("stream_radio_bremen_nordwestradio");
        ar.add("http://i.imgur.com/PxauUei.png");
        new NowStreamingRadio().setRadioSharedPreference(context, ar);
        clearArrayData();
    }

    public void pushStreamFive(Context context) {
        ar = new ArrayList<>();
        ar.add("Radio Bremen Eins Spezial");
        ar.add("http://80.252.104.101:8000/special");
        ar.add("Bremen, Germany");
        ar.add("stream_radio_bremen_eins_common");
        ar.add("http://i.imgur.com/Rep2dFU.png");
        new NowStreamingRadio().setRadioSharedPreference(context, ar);
        clearArrayData();
    }

    public void pushStreamSix(Context context) {
        ar = new ArrayList<>();
        ar.add("Bremen Vier Axel P");
        ar.add("http://80.252.104.101:8000/axelp");
        ar.add("Bremen, Germany");
        ar.add("stream_radio_bremen_vier_common");
        ar.add("http://i.imgur.com/tsFHmO9.png");
        new NowStreamingRadio().setRadioSharedPreference(context, ar);
        clearArrayData();
    }

    public void pushStreamSeven(Context context) {
        ar = new ArrayList<>();
        ar.add("Radio Bremen Eins Beat Club");
        ar.add("http://80.252.104.101:8000/beatclub");
        ar.add("Bremen, Germany");
        ar.add("stream_radio_bremen_beatclub");
        ar.add("http://i.imgur.com/U4n8Q3f.png");
        new NowStreamingRadio().setRadioSharedPreference(context, ar);
        clearArrayData();
    }

    public void pushStreamEight(Context context) {
        ar = new ArrayList<>();
        ar.add("Bremen Vier Rockt");
        ar.add("http://80.252.104.101:8000/rockt");
        ar.add("Bremen, Germany");
        ar.add("stream_radio_bremen_vier_common");
        ar.add("http://i.imgur.com/tsFHmO9.png");
        new NowStreamingRadio().setRadioSharedPreference(context, ar);
        clearArrayData();
    }

    public void pushStreamNine(Context context) {
        ar = new ArrayList<>();
        ar.add("Bremen Vier Spezial");
        ar.add("http://80.252.104.101:8000/spezial");
        ar.add("Bremen, Germany");
        ar.add("stream_radio_bremen_vier_common");
        ar.add("http://i.imgur.com/tsFHmO9.png");
        new NowStreamingRadio().setRadioSharedPreference(context, ar);
        clearArrayData();
    }
}
