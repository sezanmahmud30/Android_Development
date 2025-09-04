package com.example.mydatepickerdemo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private DatePicker datePicker;
    private Button selectButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textViewId);
        selectButton = (Button) findViewById(R.id.buttonId);
        datePicker = (DatePicker) findViewById(R.id.datePickerId);

        textView.setText(currentDate());

        selectButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textView.setText(currentDate());
            }
        });
    }

    String currentDate(){

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Current Date : ");
        stringBuilder.append(datePicker.getDayOfMonth()+"/");
        stringBuilder.append((datePicker.getMonth() +1) +"/");
        stringBuilder.append(datePicker.getYear());

        return stringBuilder.toString();
    }
}