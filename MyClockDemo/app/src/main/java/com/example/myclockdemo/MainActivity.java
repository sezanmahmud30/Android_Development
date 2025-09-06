package com.example.myclockdemo;

import android.os.Bundle;
import android.view.View;
import android.widget.AnalogClock;
import android.widget.TextClock;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextClock textClock;

    private AnalogClock analogClock;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        analogClock = (AnalogClock) findViewById(R.id.analogClockId);
        textClock = (TextClock) findViewById(R.id.textClockId);

        analogClock.setOnClickListener(this);
        textClock.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.analogClockId){

            Toast.makeText(MainActivity.this,"Analog Clock",Toast.LENGTH_SHORT).show();
        }
        if(v.getId() == R.id.textClockId){

            Toast.makeText(MainActivity.this,"Text Clock",Toast.LENGTH_SHORT).show();
        }

    }
}