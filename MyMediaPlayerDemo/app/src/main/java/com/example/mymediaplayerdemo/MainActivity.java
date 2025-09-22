package com.example.mymediaplayerdemo;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageButton playButton,pauseButton;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        playButton = (ImageButton) findViewById(R.id.playButtonId);
        pauseButton = (ImageButton) findViewById(R.id.pauseButtonId);

        mediaPlayer = MediaPlayer.create(this,R.raw.music1);

        playButton.setOnClickListener(this);
        pauseButton.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

    if(v.getId()== R.id.playButtonId){
        if(mediaPlayer != null){

            mediaPlayer.start();
            int duration = mediaPlayer.getDuration()/1000;
            Toast.makeText(MainActivity.this,"Song Played",Toast.LENGTH_SHORT).show();
        }
    }
    if (v.getId()== R.id.pauseButtonId)

        if(mediaPlayer != null){

            mediaPlayer.pause();
            Toast.makeText(MainActivity.this,"Song Paused",Toast.LENGTH_SHORT).show();
        }

    }

    protected void onDestroy(){

        if(mediaPlayer != null && mediaPlayer.isPlaying()){

            mediaPlayer.stop();
            mediaPlayer.release();
            mediaPlayer= null;

        }
        super.onDestroy();
    }
}