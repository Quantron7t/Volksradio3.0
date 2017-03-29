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
import com.amplitude.tron.volksradio30.datapopular.RadioDataAntenneBayern;

/**
 * Created by Tron on 1/29/2017.
 */

public class StreamAntenneBayern extends Fragment {

    View rootView;
    ImageView backOutButton;

    LinearLayout LStreamOne,LStreamTwo,LStreamThree,LStreamFour,LStreamFive;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.stream_popular_antenne_bayern, container, false);
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

        return rootView;
    }

    private View.OnClickListener pushRadioData = new View.OnClickListener() {
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.streamOneLayout:
                    new RadioDataAntenneBayern().pushStreamOne(getActivity().getApplicationContext());
                    break;
                case R.id.streamTwoLayout:
                    new RadioDataAntenneBayern().pushStreamTwo(getActivity().getApplicationContext());
                    break;
                case R.id.streamThreeLayout:
                    new RadioDataAntenneBayern().pushStreamThree(getActivity().getApplicationContext());
                    break;
                case R.id.streamFourLayout:
                    new RadioDataAntenneBayern().pushStreamFour(getActivity().getApplicationContext());
                    break;
                case R.id.streamFiveLayout:
                    new RadioDataAntenneBayern().pushStreamFive(getActivity().getApplicationContext());
                    break;
            }
        }
    };
}
