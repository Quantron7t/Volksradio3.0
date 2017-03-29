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
import com.amplitude.tron.volksradio30.datapopular.RadioDataGong963;
import com.amplitude.tron.volksradio30.datapopular.RadioDataRauteMusik;

/**
 * Created by Tron on 2/5/2017.
 */

public class StreamRadioGong963 extends Fragment {

    View rootView;
    ImageView backOutButton;

    LinearLayout LStreamOne,LStreamTwo,LStreamThree,LStreamFour,LStreamFive,LStreamSix,LStreamSeven;

    public StreamRadioGong963(){}

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.stream_popular_radio_gong_963, container, false);
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


        return rootView;
    }

    private View.OnClickListener pushRadioData = new View.OnClickListener() {
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.streamOneLayout:
                    new RadioDataGong963().pushStreamOne(getActivity().getApplicationContext());
                    break;
                case R.id.streamTwoLayout:
                    new RadioDataGong963().pushStreamTwo(getActivity().getApplicationContext());
                    break;
                case R.id.streamThreeLayout:
                    new RadioDataGong963().pushStreamThree(getActivity().getApplicationContext());
                    break;
                case R.id.streamFourLayout:
                    new RadioDataGong963().pushStreamFour(getActivity().getApplicationContext());
                    break;
                case R.id.streamFiveLayout:
                    new RadioDataGong963().pushStreamFive(getActivity().getApplicationContext());
                    break;
                case R.id.streamSixLayout:
                    new RadioDataGong963().pushStreamSix(getActivity().getApplicationContext());
                    break;
                case R.id.streamSevenLayout:
                    new RadioDataGong963().pushStreamSeven(getActivity().getApplicationContext());
                    break;
            }
        }
    };
}
