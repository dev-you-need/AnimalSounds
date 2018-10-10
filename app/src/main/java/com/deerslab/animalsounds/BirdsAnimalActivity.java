package com.deerslab.animalsounds;

import android.os.Bundle;

/**
 * Created by keeper on 03.02.2016.
 */
public class BirdsAnimalActivity extends AnimalActivity {

    BirdsDatabase database = new BirdsDatabase();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.database = database;
        super.onCreate(savedInstanceState);
    }

}
