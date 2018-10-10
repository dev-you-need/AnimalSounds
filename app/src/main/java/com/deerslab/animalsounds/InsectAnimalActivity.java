package com.deerslab.animalsounds;

import android.os.Bundle;

/**
 * Created by keeper on 03.02.2016.
 */
public class InsectAnimalActivity extends AnimalActivity {

    InsectDatabase database = new InsectDatabase();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.database = database;
        super.onCreate(savedInstanceState);
    }
}
