package com.example.mycheckboxdemo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private CheckBox milkCheckBox,teaCheckBox,coffeeCheckBox,milk_teaCheckBox;
    private Button orderButton;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        milkCheckBox = (CheckBox) findViewById(R.id.milkCheckBoxId);
        teaCheckBox = (CheckBox) findViewById(R.id.teaCheckBoxId);
        coffeeCheckBox = (CheckBox) findViewById(R.id.coffeeCheckBoxId);
        milk_teaCheckBox = (CheckBox) findViewById(R.id.milk_teaCheckBoxId);

        orderButton = (Button) findViewById(R.id.orderButtonId);
        resultTextView = (TextView) findViewById(R.id.resultTextViewId);



        orderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                StringBuilder stringBuilder = new StringBuilder();

                if(milkCheckBox.isChecked()){
                    String value = milkCheckBox.getText().toString();
                    stringBuilder.append(value + " is Ordered !\n");
                }

                if(teaCheckBox.isChecked()){
                    String value = teaCheckBox.getText().toString();
                    stringBuilder.append(value + " is Ordered !\n");
                }

                if(coffeeCheckBox.isChecked()){
                    String value = coffeeCheckBox.getText().toString();
                    stringBuilder.append(value + " is Ordered !\n");
                }

                if(milk_teaCheckBox.isChecked()){
                    String value = milk_teaCheckBox.getText().toString();
                    stringBuilder.append(value + " is Ordered !\n");
                }

                resultTextView.setText(stringBuilder);

            }
        });

    }
}