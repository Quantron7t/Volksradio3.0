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
import com.amplitude.tron.volksradio30.datapopular.RadioDataRauteMusik;

/**
 * Created by Tron on 2/5/2017.
 */

public class StreamRauteMusik extends Fragment {

    View rootView;
    ImageView backOutButton;

    LinearLayout LStreamOne,LStreamTwo,LStreamThree,LStreamFour,LStreamFive;

    public StreamRauteMusik(){}

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.stream_popular_raute_musik, container, false);
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
        /*LStreamFive=(LinearLayout) rootView.findViewById(R.id.streamFiveLayout);
        LStreamFive.setOnClickListener(pushRadioData);*/

        return rootView;
    }

    private View.OnClickListener pushRadioData = new View.OnClickListener() {
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.streamOneLayout:
                    new RadioDataRauteMusik().pushStreamOne(getActivity().getApplicationContext());
                    break;
                case R.id.streamTwoLayout:
                    new RadioDataRauteMusik().pushStreamTwo(getActivity().getApplicationContext());
                    break;
                case R.id.streamThreeLayout:
                    new RadioDataRauteMusik().pushStreamThree(getActivity().getApplicationContext());
                    break;
                case R.id.streamFourLayout:
                    new RadioDataRauteMusik().pushStreamFour(getActivity().getApplicationContext());
                    break;
                /*case R.id.streamFiveLayout:
                    new RadioDataRauteMusik().pushStreamFive(getActivity().getApplicationContext());
                    break;*/
            }
        }
    };
}
