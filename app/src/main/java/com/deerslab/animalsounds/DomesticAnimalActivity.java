package com.deerslab.animalsounds;

import android.os.Bundle;

/**
 * Created by keeper on 01.02.2016.
 */
public class DomesticAnimalActivity extends AnimalActivity{

    DomesticDatabase database = new DomesticDatabase();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.database = database;
        super.onCreate(savedInstanceState);
    }
}
