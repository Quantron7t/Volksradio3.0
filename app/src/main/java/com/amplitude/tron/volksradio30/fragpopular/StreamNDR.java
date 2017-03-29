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
import com.amplitude.tron.volksradio30.datapopular.RadioDataNDR;

/**
 * Created by Tron on 2/5/2017.
 */

public class StreamNDR extends Fragment {

    View rootView;
    ImageView backOutButton;

    LinearLayout LStreamOne,LStreamTwo,LStreamThree,LStreamFour,LStreamFive,LStreamSix,LStreamSeven,
            LStreamEight,LStreamNine,LStreamTen,LStreamEleven,LStreamTwelve;

    public StreamNDR(){}

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.stream_popular_ndr, container, false);
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
        LStreamTwelve=(LinearLayout) rootView.findViewById(R.id.streamTwelveLayout);
        LStreamTwelve.setOnClickListener(pushRadioData);


        return rootView;
    }

    private View.OnClickListener pushRadioData = new View.OnClickListener() {
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.streamOneLayout:
                    new RadioDataNDR().pushStreamOne(getActivity().getApplicationContext());
                    break;
                case R.id.streamTwoLayout:
                    new RadioDataNDR().pushStreamTwo(getActivity().getApplicationContext());
                    break;
                case R.id.streamThreeLayout:
                    new RadioDataNDR().pushStreamThree(getActivity().getApplicationContext());
                    break;
                case R.id.streamFourLayout:
                    new RadioDataNDR().pushStreamFour(getActivity().getApplicationContext());
                    break;
                case R.id.streamFiveLayout:
                    new RadioDataNDR().pushStreamFive(getActivity().getApplicationContext());
                    break;
                case R.id.streamSixLayout:
                    new RadioDataNDR().pushStreamSix(getActivity().getApplicationContext());
                    break;
                case R.id.streamSevenLayout:
                    new RadioDataNDR().pushStreamSeven(getActivity().getApplicationContext());
                    break;
                case R.id.streamEightLayout:
                    new RadioDataNDR().pushStreamEight(getActivity().getApplicationContext());
                    break;
                case R.id.streamNineLayout:
                    new RadioDataNDR().pushStreamNine(getActivity().getApplicationContext());
                    break;
                case R.id.streamTenLayout:
                    new RadioDataNDR().pushStreamTen(getActivity().getApplicationContext());
                    break;
                case R.id.streamElevenLayout:
                    new RadioDataNDR().pushStreamEleven(getActivity().getApplicationContext());
                    break;
                case R.id.streamTwelveLayout:
                    new RadioDataNDR().pushStreamTwelve(getActivity().getApplicationContext());
                    break;

            }
        }
    };
}
