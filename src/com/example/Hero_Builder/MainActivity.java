package com.example.Hero_Builder;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hero_cards);

        if (findViewById(R.id.heroes_fragment_container) != null) {

            if (savedInstanceState != null) {
                return;
            }

            HeroesFragment heroesFragment = new HeroesFragment();

            heroesFragment.setArguments(getIntent().getExtras());

            getFragmentManager().beginTransaction()
                    .add(R.id.heroes_fragment_container, heroesFragment).commit();
        }
    }
}
