package com.amplitude.tron.volksradio30;

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
import com.amplitude.tron.volksradio30.fraggenre.StreamGenreChillout;
import com.amplitude.tron.volksradio30.fraggenre.StreamGenreClassic;
import com.amplitude.tron.volksradio30.fraggenre.StreamGenreHitmix;
import com.amplitude.tron.volksradio30.fraggenre.StreamGenreInformation;
import com.amplitude.tron.volksradio30.fraggenre.StreamGenreNews;
import com.amplitude.tron.volksradio30.fraggenre.StreamGenreRock;
import com.amplitude.tron.volksradio30.fraggenre.StreamGenreSport;
import com.amplitude.tron.volksradio30.fraggenre.StreamGenreTrance;

/**
 * Created by Tron on 1/29/2017.
 */

public class StreamGenreRadioList extends Fragment {

    View rootView;
    ImageView backOutButton;

    LinearLayout genreSport,genreNews,genreInfo,genreClassic,genreTrance,genreHitmix,genreRock,genreChillout;
    Fragment fragment;

    public StreamGenreRadioList(){}

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        setRetainInstance(false);
        rootView = inflater.inflate(R.layout.stream_genre_menu_layout, container, false);
        ((VolksActivity)getActivity()).disableLayoutButton();
        backOutButton = (ImageView) rootView.findViewById(R.id.btn_back_out);
        backOutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((VolksActivity)getActivity()).enableLayoutButton();
                getActivity().getSupportFragmentManager().popBackStack();
            }
        });

        genreSport=(LinearLayout) rootView.findViewById(R.id.genre_sport_layout);
        genreSport.setOnClickListener(openChildMenu);
        genreNews=(LinearLayout) rootView.findViewById(R.id.genre_news_layout);
        genreNews.setOnClickListener(openChildMenu);
        genreInfo=(LinearLayout) rootView.findViewById(R.id.genre_information_layout);
        genreInfo.setOnClickListener(openChildMenu);
        genreClassic=(LinearLayout) rootView.findViewById(R.id.genre_classic_layout);
        genreClassic.setOnClickListener(openChildMenu);
        genreChillout=(LinearLayout) rootView.findViewById(R.id.genre_chillout_layout);
        genreChillout.setOnClickListener(openChildMenu);
        genreTrance=(LinearLayout) rootView.findViewById(R.id.genre_trance_layout);
        genreTrance.setOnClickListener(openChildMenu);
        genreHitmix=(LinearLayout) rootView.findViewById(R.id.genre_hitmix_layout);
        genreHitmix.setOnClickListener(openChildMenu);
        genreRock=(LinearLayout) rootView.findViewById(R.id.genre_rock_layout);
        genreRock.setOnClickListener(openChildMenu);

        return rootView;
    }

    private View.OnClickListener openChildMenu = new View.OnClickListener() {
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.genre_sport_layout:
                    fragment = new StreamGenreSport();
                    getActivity().getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.menu_container,fragment)
                            .addToBackStack(null)
                            .commit();
                    break;
                case R.id.genre_news_layout:
                    fragment = new StreamGenreNews();
                    getActivity().getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.menu_container,fragment)
                            .addToBackStack(null)
                            .commit();
                    break;
                case R.id.genre_information_layout:
                    fragment = new StreamGenreInformation();
                    getActivity().getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.menu_container,fragment)
                            .addToBackStack(null)
                            .commit();
                    break;
                case R.id.genre_classic_layout:
                    fragment = new StreamGenreClassic();
                    getActivity().getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.menu_container,fragment)
                            .addToBackStack(null)
                            .commit();
                    break;
                case R.id.genre_chillout_layout:
                    fragment = new StreamGenreChillout();
                    getActivity().getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.menu_container,fragment)
                            .addToBackStack(null)
                            .commit();
                    break;
                case R.id.genre_trance_layout:
                    fragment = new StreamGenreTrance();
                    getActivity().getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.menu_container,fragment)
                            .addToBackStack(null)
                            .commit();
                    break;
                case R.id.genre_hitmix_layout:
                    fragment = new StreamGenreHitmix();
                    getActivity().getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.menu_container,fragment)
                            .addToBackStack(null)
                            .commit();
                    break;
                case R.id.genre_rock_layout:
                    fragment = new StreamGenreRock();
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
