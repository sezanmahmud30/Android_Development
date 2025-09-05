package com.example.mytimepickerdemo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private TimePicker timePicker;
    private TextView textView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        timePicker =(TimePicker) findViewById(R.id.timePickerId);
        timePicker.setIs24HourView(true);
        textView = (TextView) findViewById(R.id.textViewId);
        button = (Button) findViewById(R.id.buttonId);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String time = timePicker.getCurrentHour() + " : " + timePicker.getCurrentMinute();

                textView.setText(time);

            }
        });

    }
}