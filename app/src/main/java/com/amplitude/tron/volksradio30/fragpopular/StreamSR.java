package com.amplitude.tron.volksradio30.fragpopular;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.amplitude.tron.volksradio30.R;
import com.amplitude.tron.volksradio30.VolksActivity;
import com.amplitude.tron.volksradio30.datapopular.RadioDataFFHDigital;
import com.amplitude.tron.volksradio30.datapopular.RadioDataSR;
import com.amplitude.tron.volksradio30.datapopular.RadioDataWDR;

/**
 * Created by Tron on 2/5/2017.
 */

public class StreamSR extends Fragment {

    View rootView;
    ImageView backOutButton;

    LinearLayout LStreamOne,LStreamTwo,LStreamThree,LStreamFour,LStreamFive,LStreamSix,LStreamSeven
                ,LStreamEight,LStreamNine,LStreamTen,LStreamEleven;

    public StreamSR(){}

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.stream_popular_sr, container, false);
        ((VolksActivity)getActivity()).disableLayoutButton();
        backOutButton = (ImageView) rootView.findViewById(R.id.btn_back_out);
        backOutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((VolksActivity)getActivity()).enableLayoutButton();
                getActivity().getSupportFragmentManager().popBackStack();
            }
        });

        LStreamOne=(LinearLayout) rootView.findViewById(R.id.streamOneLayout);
        LStreamOne.setOnClickListener(pushRadioData);
        LStreamTwo=(LinearLayout) rootView.findViewById(R.id.streamTwoLayout);
        LStreamTwo.setOnClickListener(pushRadioData);
        LStreamThree=(LinearLayout) rootView.findViewById(R.id.streamThreeLayout);
        LStreamThree.setOnClickListener(pushRadioData);
        LStreamFour=(LinearLayout) rootView.findViewById(R.id.streamFourLayout);
        LStreamFour.setOnClickListener(pushRadioData);
        LStreamFive=(LinearLayout) rootView.findViewById(R.id.streamFiveLayout);
        LStreamFive.setOnClickListener(pushRadioData);
        LStreamSix=(LinearLayout) rootView.findViewById(R.id.streamSixLayout);
        LStreamSix.setOnClickListener(pushRadioData);
        LStreamSeven=(LinearLayout) rootView.findViewById(R.id.streamSevenLayout);
        LStreamSeven.setOnClickListener(pushRadioData);
        LStreamEight=(LinearLayout) rootView.findViewById(R.id.streamEightLayout);
        LStreamEight.setOnClickListener(pushRadioData);
        LStreamNine=(LinearLayout) rootView.findViewById(R.id.streamNineLayout);
        LStreamNine.setOnClickListener(pushRadioData);
        LStreamTen=(LinearLayout) rootView.findViewById(R.id.streamTenLayout);
        LStreamTen.setOnClickListener(pushRadioData);
        LStreamEleven=(LinearLayout) rootView.findViewById(R.id.streamElevenLayout);
        LStreamEleven.setOnClickListener(pushRadioData);

        return rootView;
    }

    private View.OnClickListener pushRadioData = new View.OnClickListener() {
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.streamOneLayout:
                    new RadioDataSR().pushStreamOne(getActivity().getApplicationContext());
                    break;
                case R.id.streamTwoLayout:
                    new RadioDataSR().pushStreamTwo(getActivity().getApplicationContext());
                    break;
                case R.id.streamThreeLayout:
                    new RadioDataSR().pushStreamThree(getActivity().getApplicationContext());
                    break;
                case R.id.streamFourLayout:
                    new RadioDataSR().pushStreamFour(getActivity().getApplicationContext());
                    break;
                case R.id.streamFiveLayout:
                    new RadioDataSR().pushStreamFive(getActivity().getApplicationContext());
                    break;
                case R.id.streamSixLayout:
                    new RadioDataSR().pushStreamSix(getActivity().getApplicationContext());
                    break;
                case R.id.streamSevenLayout:
                    new RadioDataSR().pushStreamSeven(getActivity().getApplicationContext());
                    break;
                case R.id.streamEightLayout:
                    new RadioDataSR().pushStreamEight(getActivity().getApplicationContext());
                    break;
                case R.id.streamNineLayout:
                    new RadioDataSR().pushStreamNine(getActivity().getApplicationContext());
                    break;
                case R.id.streamTenLayout:
                    new RadioDataSR().pushStreamTen(getActivity().getApplicationContext());
                    break;
                case R.id.streamElevenLayout:
                    new RadioDataSR().pushStreamEleven(getActivity().getApplicationContext());
                    break;
            }
        }
    };
}
