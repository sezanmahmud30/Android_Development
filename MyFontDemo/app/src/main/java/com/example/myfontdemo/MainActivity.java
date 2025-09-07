package com.example.myfontdemo;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private TextView textView1,textView2;
    private Typeface typeface1,typeface2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        textView1 = (TextView) findViewById(R.id.textView1Id);
        textView2 = (TextView) findViewById(R.id.textView2Id);

        typeface1 = Typeface.createFromAsset(getAssets(),"font/KaushanScript-Regular.otf");
        textView1.setTypeface(typeface1);
    }
}