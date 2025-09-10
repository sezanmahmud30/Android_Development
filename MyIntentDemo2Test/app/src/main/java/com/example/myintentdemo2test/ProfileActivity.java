package com.example.myintentdemo2test;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ProfileActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_profile);

        textView = (TextView) findViewById(R.id.textViewId);

        Bundle bundle = getIntent().getExtras();

        if(bundle != null){
         String value =  bundle.getString("tag");

         textView.setText(value);
        }

    }
}