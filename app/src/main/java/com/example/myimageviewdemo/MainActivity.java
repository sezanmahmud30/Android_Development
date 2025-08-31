package com.example.myimageviewdemo;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView imageView1,imageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        imageView1 = findViewById(R.id.imageView1Id);
        imageView2 = findViewById(R.id.imageView2Id);


        imageView1.setOnClickListener(this);
        imageView2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.imageView2Id){
            Toast.makeText(MainActivity.this,"Sezan Mahmud 2024",Toast.LENGTH_SHORT).show();

        }
        else if(v.getId()==R.id.imageView1Id){
            Toast.makeText(MainActivity.this,"Sezan Mahmud 2025",Toast.LENGTH_SHORT).show();

        }

    }
}