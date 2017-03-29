package com.amplitude.tron.volksradio30.fraggenre;

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
import com.amplitude.tron.volksradio30.datagenre.RadioDataGenreTrance;
import com.amplitude.tron.volksradio30.datapopular.RadioDataRauteMusik;

/**
 * Created by Tron on 1/30/2017.
 */

public class StreamGenreTrance extends Fragment{

    View rootView;
    ImageView backOutButton;

    LinearLayout LStreamOne,LStreamTwo;

    public StreamGenreTrance(){}

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.stream_genre_trance, container, false);
        ((VolksActivity)getActivity()).disableLayoutButton();
        backOutButton = (ImageView) rootView.findViewById(R.id.btn_back_out);
        backOutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((VolksActivity)getActivity()).enableLayoutButton();
                getActivity().getSupportFragmentManager().popBackStack();
            }
        });

        LStreamOne=(LinearLayout) rootView.findViewById(R.id.streamCopyOneLayout);
        LStreamOne.setOnClickListener(pushRadioData);
        LStreamTwo=(LinearLayout) rootView.findViewById(R.id.streamOneLayout);
        LStreamTwo.setOnClickListener(pushRadioData);

        return rootView;
    }

    private View.OnClickListener pushRadioData = new View.OnClickListener() {
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.streamCopyOneLayout:
                    new RadioDataRauteMusik().pushStreamFour(getActivity().getApplicationContext());
                    break;
                case R.id.streamOneLayout:
                    new RadioDataGenreTrance().pushStreamOne(getActivity().getApplicationContext());
                    break;
            }
        }
    };
}
