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
import com.amplitude.tron.volksradio30.datagenre.RadioDataGenreChillout;
import com.amplitude.tron.volksradio30.datapopular.RadioDataAntenneBayern;
import com.amplitude.tron.volksradio30.datapopular.RadioDataFFHDigital;
import com.amplitude.tron.volksradio30.datapopular.RadioDataGong963;
import com.amplitude.tron.volksradio30.datapopular.RadioDataHitradioRT1;
import com.amplitude.tron.volksradio30.datapopular.RadioDataMitteldeutscherRundfunk;
import com.amplitude.tron.volksradio30.datapopular.RadioDataRadioPSR;
import com.amplitude.tron.volksradio30.datapopular.RadioDataRauteMusik;

/**
 * Created by Tron on 1/30/2017.
 */

public class StreamGenreChillout extends Fragment {
    View rootView;
    ImageView backOutButton;

    LinearLayout
            LStreamCopyOne,LStreamCopyTwo,LStreamCopyThree,LStreamCopyFour,LStreamCopyFive,
            LStreamCopySix,LStreamCopySeven,LStreamCopyEight;

    public StreamGenreChillout(){}

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.stream_genre_chillout, container, false);
        ((VolksActivity)getActivity()).disableLayoutButton();
        backOutButton = (ImageView) rootView.findViewById(R.id.btn_back_out);
        backOutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((VolksActivity)getActivity()).enableLayoutButton();
                getActivity().getSupportFragmentManager().popBackStack();
            }
        });

        LStreamCopyOne=(LinearLayout) rootView.findViewById(R.id.streamCopyOneLayout);
        LStreamCopyOne.setOnClickListener(pushRadioData);
        LStreamCopyTwo=(LinearLayout) rootView.findViewById(R.id.streamCopyTwoLayout);
        LStreamCopyTwo.setOnClickListener(pushRadioData);
        LStreamCopyThree=(LinearLayout) rootView.findViewById(R.id.streamCopyThreeLayout);
        LStreamCopyThree.setOnClickListener(pushRadioData);
        LStreamCopyFour=(LinearLayout) rootView.findViewById(R.id.streamCopyFourLayout);
        LStreamCopyFour.setOnClickListener(pushRadioData);
        LStreamCopyFive=(LinearLayout) rootView.findViewById(R.id.streamCopyFiveLayout);
        LStreamCopyFive.setOnClickListener(pushRadioData);
        LStreamCopySix=(LinearLayout) rootView.findViewById(R.id.streamCopySixLayout);
        LStreamCopySix.setOnClickListener(pushRadioData);
        LStreamCopySeven=(LinearLayout) rootView.findViewById(R.id.streamCopySevenLayout);
        LStreamCopySeven.setOnClickListener(pushRadioData);
        LStreamCopyEight=(LinearLayout) rootView.findViewById(R.id.streamCopyEightLayout);
        LStreamCopyEight.setOnClickListener(pushRadioData);

        return rootView;
    }

    private View.OnClickListener pushRadioData = new View.OnClickListener() {
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.streamOneLayout:
                    new RadioDataGenreChillout().pushStreamOne(getActivity().getApplicationContext());
                    break;
                case R.id.streamCopyOneLayout:
                    new RadioDataHitradioRT1().pushStreamOne(getActivity().getApplicationContext());
                    break;
                case R.id.streamCopyTwoLayout:
                    new RadioDataHitradioRT1().pushStreamTwo(getActivity().getApplicationContext());
                    break;
                case R.id.streamCopyThreeLayout:
                    new RadioDataAntenneBayern().pushStreamTwo(getActivity().getApplicationContext());
                    break;
                case R.id.streamCopyFourLayout:
                    new RadioDataRauteMusik().pushStreamOne(getActivity().getApplicationContext());
                    break;
                case R.id.streamCopyFiveLayout:
                    new RadioDataFFHDigital().pushStreamOne(getActivity().getApplicationContext());
                    break;
                case R.id.streamCopySixLayout:
                    new RadioDataMitteldeutscherRundfunk().pushStreamOne(getActivity().getApplicationContext());
                    break;
                case R.id.streamCopySevenLayout:
                    new RadioDataRadioPSR().pushStreamOne(getActivity().getApplicationContext());
                    break;
                case R.id.streamCopyEightLayout:
                    new RadioDataGong963().pushStreamOne(getActivity().getApplicationContext());
                    break;
            }
        }
    };
}
