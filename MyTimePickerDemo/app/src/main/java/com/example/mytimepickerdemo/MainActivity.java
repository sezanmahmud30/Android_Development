package com.example.mytimepickerdemo;

import android.app.TimePickerDialog;
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

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private TextView textView;
    private Button button;
    private TimePickerDialog timePickerDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        textView = (TextView) findViewById(R.id.textViewId);
        button = (Button) findViewById(R.id.buttonId);

        button.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        TimePicker timePicker = new TimePicker(this);

        int currentHour = timePicker.getCurrentHour();

        int currentMinute = timePicker.getCurrentMinute();




        timePickerDialog = new TimePickerDialog(MainActivity.this,

                new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {

                        textView.setText(hourOfDay + ":" + minute);

                    }
                },currentHour,currentMinute,true);

            timePickerDialog.show();


    }
}