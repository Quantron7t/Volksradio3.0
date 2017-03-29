package com.amplitude.tron.volksradio30;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

/**
 * Created by Tron on 1/29/2017.
 */

public class StreamRadioCatalog extends Fragment {

    View rootView;
    ImageView closeButton;
    LinearLayout LLGenre,LLPopular;

    Fragment subMenuFragment;

    public StreamRadioCatalog(){}

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.stream_main_menu, container, false);
        ((VolksActivity)getActivity()).disableLayoutButton();

        closeButton = (ImageView) rootView.findViewById(R.id.btn_close_popup);
        closeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((VolksActivity)getActivity()).enableLayoutButton();
                getActivity().getSupportFragmentManager().popBackStack();
            }
        });

        LLGenre=(LinearLayout) rootView.findViewById(R.id.genre_layout);
        LLGenre.setOnClickListener(enterSubMenu);

        LLPopular=(LinearLayout) rootView.findViewById(R.id.popular_layout);
        LLPopular.setOnClickListener(enterSubMenu);

        return rootView;
    }

    private View.OnClickListener enterSubMenu = new View.OnClickListener() {
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.genre_layout:
                    subMenuFragment = new StreamGenreRadioList();
                    getActivity().getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.menu_container, subMenuFragment)
                            .addToBackStack(null)
                            .commit();
                    break;
                case R.id.popular_layout:
                    subMenuFragment = new StreamPopularRadioList();
                    getActivity().getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.menu_container, subMenuFragment)
                            .addToBackStack(null)
                            .commit();
                    break;
            }
        }
    };
}
