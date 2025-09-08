package com.example.myzoomcontroldemo;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ZoomControls;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private ZoomControls zoomControls;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.imageViewId);
        zoomControls = (ZoomControls) findViewById(R.id.zoomControlId);

        zoomControls.setOnZoomInClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(),"Zoom in",Toast.LENGTH_SHORT).show();

                float x = imageView.getScaleX();
                float y = imageView.getScaleY();

                imageView.setScaleX((float) x + 1);
                imageView.setScaleY((float) y + 1);
            }
        });


        zoomControls.setOnZoomOutClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(),"Zoom out",Toast.LENGTH_SHORT).show();

                float x = imageView.getScaleX();
                float y = imageView.getScaleY();

                if(x > 1 && y > 1){

                    imageView.setScaleX((float) x - 1);
                    imageView.setScaleY((float) y - 1);
                }

            }
        });

    }
}