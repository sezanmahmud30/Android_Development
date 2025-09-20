package com.example.myspinnerdemo2;

import android.media.session.PlaybackState;
import android.os.Bundle;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner;
    private String[] countryNames;
    private String[] population;
    private int[] flags = {R.drawable.afghanistan,R.drawable.armenia,R.drawable.azerbaijan,R.drawable.bahrain,
            R.drawable.bangladesh,R.drawable.bhutan,R.drawable.china,R.drawable.india,R.drawable.japan,
            R.drawable.nepal,R.drawable.pakistan,R.drawable.sri_lanka};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        countryNames = getResources().getStringArray(R.array.country_names);
        population = getResources().getStringArray(R.array.population);

        spinner = (Spinner) findViewById(R.id.spinnerId);

        CustomAdapter customAdapter = new CustomAdapter(this,flags,countryNames,population);
        spinner.setAdapter(customAdapter);
    }
}