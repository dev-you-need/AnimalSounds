package com.deerslab.animalsounds;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by keeper on 01.02.2016.
 */
public class MainMenuActivity extends Activity {

    private static MainMenuActivity mInstance = null;

    private final String TAG = getClass().getSimpleName();

    //@TargetApi(Build.VERSION_CODES.HONEYCOMB)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.main_menu_activity);

        Button btnDomestic = (Button) findViewById(R.id.btnDomestic);
        btnDomestic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainMenuActivity.this, DomesticAnimalActivity.class));
            }
        });

        Button btnWild = (Button) findViewById(R.id.btnWild);
        btnWild.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainMenuActivity.this, WildAnimalActivity.class));
            }
        });

        Button btnBirds = (Button) findViewById(R.id.btnBirds);
        btnBirds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainMenuActivity.this, BirdsAnimalActivity.class));
            }
        });

        Button btnInsect = (Button) findViewById(R.id.btnInsect);
        btnInsect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainMenuActivity.this, InsectAnimalActivity.class));
            }
        });

    }

}
