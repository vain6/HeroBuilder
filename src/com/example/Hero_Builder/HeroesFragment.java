package com.example.Hero_Builder;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Juhani on 4.3.2015.
 */
public class HeroesFragment extends Fragment {

    private OnHeroSelectedListener listener;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.heroes_view, container, false);
    }

    public interface OnHeroSelectedListener {
        public void onHeroSelected(String link);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (activity instanceof OnHeroSelectedListener) {
            listener = (OnHeroSelectedListener) activity;
        } else {
            throw new ClassCastException(activity.toString()
                + " must implement HeroesFragment.OnHeroSelectedListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        listener = null;
    }
}