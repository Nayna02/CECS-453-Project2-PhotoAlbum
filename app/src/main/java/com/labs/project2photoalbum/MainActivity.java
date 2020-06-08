package com.labs.project2photoalbum;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    // ArrayList for 7 wonders names
    ArrayList<String> personNames = new ArrayList<>(Arrays.asList("tajmahal", "christtheredeemer1", "colosseum1", "machupicchu1",
            "petra", "pyramidodgiza1", "thegreatwall1"));

    ArrayList<Integer> personImages = new
            ArrayList<>(Arrays.asList(R.drawable.tajmahal,
            R.drawable.christtheredeemer1,
            R.drawable.colosseum1,
            R.drawable.machupicchu1,
            R.drawable.petra,
            R.drawable.pyramidodgiza1,
            R.drawable.thegreatwall1));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
