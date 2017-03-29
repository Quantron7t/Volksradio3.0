package com.amplitude.tron.volksradio30;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.amplitude.tron.volksradio30.fragpopular.StreamAntenneBayern;
import com.amplitude.tron.volksradio30.fragpopular.StreamFFHDigital;
import com.amplitude.tron.volksradio30.fragpopular.StreamHessischenRundfunks;
import com.amplitude.tron.volksradio30.fragpopular.StreamHitradioRT1;
import com.amplitude.tron.volksradio30.fragpopular.StreamMitteldeutscherRundfunk;
import com.amplitude.tron.volksradio30.fragpopular.StreamNDR;
import com.amplitude.tron.volksradio30.fragpopular.StreamRBB;
import com.amplitude.tron.volksradio30.fragpopular.StreamRadioBremen;
import com.amplitude.tron.volksradio30.fragpopular.StreamRadioGong963;
import com.amplitude.tron.volksradio30.fragpopular.StreamRadioPSR;
import com.amplitude.tron.volksradio30.fragpopular.StreamRauteMusik;
import com.amplitude.tron.volksradio30.fragpopular.StreamSR;
import com.amplitude.tron.volksradio30.fragpopular.StreamWDR;

/**
 * Created by Tron on 1/29/2017.
 */

public class StreamPopularRadioList extends Fragment {

    View rootView;
    ImageView backOutButton;
    LinearLayout buttonAntenneBayern,buttonRauteMusik,buttonHessischenRundfunks,buttonHitradioRT1
            ,buttonFFHDigital,buttonMitteldeutscherRundfunk,buttonRadioPSR,buttonRadioGong963,buttonRBB
            ,buttonNDR,buttonWDR,buttonSR,buttonRadioBremen;

    Fragment fragment;

    public StreamPopularRadioList(){}

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.stream_popular_menu_layout, container, false);
        ((VolksActivity)getActivity()).disableLayoutButton();
        backOutButton = (ImageView) rootView.findViewById(R.id.btn_back_out);
        backOutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((VolksActivity)getActivity()).enableLayoutButton();
                getActivity().getSupportFragmentManager().popBackStack();
            }
        });

        buttonAntenneBayern=(LinearLayout) rootView.findViewById(R.id.button_antenne_bayern);
        buttonAntenneBayern.setOnClickListener(openChildMenu);
        buttonRauteMusik=(LinearLayout) rootView.findViewById(R.id.button_raute_musik);
        buttonRauteMusik.setOnClickListener(openChildMenu);
        buttonHessischenRundfunks=(LinearLayout) rootView.findViewById(R.id.button_hessischen_rundfunks);
        buttonHessischenRundfunks.setOnClickListener(openChildMenu);
        buttonHitradioRT1=(LinearLayout) rootView.findViewById(R.id.button_hitradio_rt1);
        buttonHitradioRT1.setOnClickListener(openChildMenu);
        buttonFFHDigital=(LinearLayout) rootView.findViewById(R.id.button_ffh_digital);
        buttonFFHDigital.setOnClickListener(openChildMenu);
        buttonMitteldeutscherRundfunk=(LinearLayout) rootView.findViewById(R.id.button_mitteldeutscher_rundfunk);
        buttonMitteldeutscherRundfunk.setOnClickListener(openChildMenu);
        buttonRadioPSR=(LinearLayout) rootView.findViewById(R.id.button_radio_psr);
        buttonRadioPSR.setOnClickListener(openChildMenu);
        buttonRadioGong963=(LinearLayout) rootView.findViewById(R.id.button_radio_gong_963);
        buttonRadioGong963.setOnClickListener(openChildMenu);
        buttonRBB=(LinearLayout) rootView.findViewById(R.id.button_rbb);
        buttonRBB.setOnClickListener(openChildMenu);
        buttonNDR=(LinearLayout) rootView.findViewById(R.id.button_ndr);
        buttonNDR.setOnClickListener(openChildMenu);
        buttonWDR=(LinearLayout) rootView.findViewById(R.id.button_wdr);
        buttonWDR.setOnClickListener(openChildMenu);
        buttonSR=(LinearLayout) rootView.findViewById(R.id.button_sr);
        buttonSR.setOnClickListener(openChildMenu);
        buttonRadioBremen=(LinearLayout) rootView.findViewById(R.id.button_radio_bremen);
        buttonRadioBremen.setOnClickListener(openChildMenu);

        return rootView;
    }

    private View.OnClickListener openChildMenu = new View.OnClickListener() {
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.button_antenne_bayern:
                    fragment = new StreamAntenneBayern();
                    getActivity().getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.menu_container,fragment)
                            .addToBackStack(null)
                            .commit();
                    break;
                case R.id.button_raute_musik:
                    fragment = new StreamRauteMusik();
                    getActivity().getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.menu_container,fragment)
                            .addToBackStack(null)
                            .commit();
                    break;
                case R.id.button_hessischen_rundfunks:
                    fragment = new StreamHessischenRundfunks();
                    getActivity().getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.menu_container,fragment)
                            .addToBackStack(null)
                            .commit();
                    break;
                case R.id.button_hitradio_rt1:
                    fragment = new StreamHitradioRT1();
                    getActivity().getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.menu_container,fragment)
                            .addToBackStack(null)
                            .commit();
                    break;
                case R.id.button_ffh_digital:
                    fragment = new StreamFFHDigital();
                    getActivity().getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.menu_container,fragment)
                            .addToBackStack(null)
                            .commit();
                    break;
                case R.id.button_mitteldeutscher_rundfunk:
                    fragment = new StreamMitteldeutscherRundfunk();
                    getActivity().getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.menu_container,fragment)
                            .addToBackStack(null)
                            .commit();
                    break;
                case R.id.button_radio_psr:
                    fragment = new StreamRadioPSR();
                    getActivity().getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.menu_container,fragment)
                            .addToBackStack(null)
                            .commit();
                    break;
                case R.id.button_radio_gong_963:
                    fragment = new StreamRadioGong963();
                    getActivity().getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.menu_container,fragment)
                            .addToBackStack(null)
                            .commit();
                    break;
                case R.id.button_rbb:
                    fragment = new StreamRBB();
                    getActivity().getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.menu_container,fragment)
                            .addToBackStack(null)
                            .commit();
                    break;
                case R.id.button_ndr:
                    fragment = new StreamNDR();
                    getActivity().getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.menu_container,fragment)
                            .addToBackStack(null)
                            .commit();
                    break;
                case R.id.button_wdr:
                    fragment = new StreamWDR();
                    getActivity().getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.menu_container,fragment)
                            .addToBackStack(null)
                            .commit();
                    break;
                case R.id.button_sr:
                    fragment = new StreamSR();
                    getActivity().getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.menu_container,fragment)
                            .addToBackStack(null)
                            .commit();
                    break;
                case R.id.button_radio_bremen:
                    fragment = new StreamRadioBremen();
                    getActivity().getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.menu_container,fragment)
                            .addToBackStack(null)
                            .commit();
                    break;
            }
        }
    };
}
