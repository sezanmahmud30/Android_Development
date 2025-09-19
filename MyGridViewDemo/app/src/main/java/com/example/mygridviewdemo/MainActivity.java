package com.example.mygridviewdemo;

import android.os.Bundle;
import android.widget.GridView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private GridView gridView;

    int[] flags = {R.drawable.afghanistan, R.drawable.armenia, R.drawable.azerbaijan,
            R.drawable.bahrain, R.drawable.bangladesh, R.drawable.bhutan,
            R.drawable.china, R.drawable.india, R.drawable.japan, R.drawable.nepal,
            R.drawable.pakistan, R.drawable.sri_lanka};

    String[]  countryNames;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        countryNames = getResources().getStringArray(R.array.country_names);

        gridView = (GridView) findViewById(R.id.gridViewId);

        CustomAdapter adapter = new CustomAdaptar(this,countryNames,flags);
        gridView.setAdapter();

    }
}