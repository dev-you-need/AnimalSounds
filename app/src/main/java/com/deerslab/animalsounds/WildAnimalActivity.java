package com.deerslab.animalsounds;

import android.os.Bundle;

/**
 * Created by keeper on 03.02.2016.
 */
public class WildAnimalActivity extends AnimalActivity {


    WildDatabase database = new WildDatabase();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.database = database;
        super.onCreate(savedInstanceState);
    }
}
