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
import com.amplitude.tron.volksradio30.datapopular.RadioDataWDR;

/**
 * Created by Tron on 2/5/2017.
 */

public class StreamWDR extends Fragment {

    View rootView;
    ImageView backOutButton;

    LinearLayout LStreamOne,LStreamTwo,LStreamThree,LStreamFour,LStreamFive,LStreamSix,LStreamSeven,
            LStreamEight,LStreamNine;

    public StreamWDR(){}

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.stream_popular_wdr, container, false);
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


        return rootView;
    }

    private View.OnClickListener pushRadioData = new View.OnClickListener() {
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.streamOneLayout:
                    new RadioDataWDR().pushStreamOne(getActivity().getApplicationContext());
                    break;
                case R.id.streamTwoLayout:
                    new RadioDataWDR().pushStreamTwo(getActivity().getApplicationContext());
                    break;
                case R.id.streamThreeLayout:
                    new RadioDataWDR().pushStreamThree(getActivity().getApplicationContext());
                    break;
                case R.id.streamFourLayout:
                    new RadioDataWDR().pushStreamFour(getActivity().getApplicationContext());
                    break;
                case R.id.streamFiveLayout:
                    new RadioDataWDR().pushStreamFive(getActivity().getApplicationContext());
                    break;
                case R.id.streamSixLayout:
                    new RadioDataWDR().pushStreamSix(getActivity().getApplicationContext());
                    break;
                case R.id.streamSevenLayout:
                    new RadioDataWDR().pushStreamSeven(getActivity().getApplicationContext());
                    break;
                case R.id.streamEightLayout:
                    new RadioDataWDR().pushStreamEight(getActivity().getApplicationContext());
                    break;
                case R.id.streamNineLayout:
                    new RadioDataWDR().pushStreamNine(getActivity().getApplicationContext());
                    break;

            }
        }
    };
}
