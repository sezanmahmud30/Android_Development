package com.example.myspinnerdemo;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {


    String[] countryNames;
    private Spinner spinner;
    private Button button;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        countryNames = getResources().getStringArray(R.array.country_names);

        spinner =(Spinner) findViewById(R.id.spinnerId);
        textView = (TextView) findViewById(R.id.textViewId);
        button = (Button) findViewById(R.id.buttonId);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.sample_view,R.id.textViewSampleId,countryNames);
        spinner.setAdapter(adapter);
    }
}