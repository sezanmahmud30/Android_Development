package com.example.myalartdialogdemo;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button exitButton;
    private AlertDialog.Builder  alertDialogBuilder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        exitButton = (Button) findViewById(R.id.buttonId);

        exitButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);

        //for setting title
        alertDialogBuilder.setTitle(R.string.title_text);

        //for setting message
        alertDialogBuilder.setMessage(R.string.message_text);

        //for setting Icon
        alertDialogBuilder.setIcon(R.drawable.question_icon);



        alertDialogBuilder.setCancelable(false);
        

        alertDialogBuilder.setPositiveButton("Yes" , new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                // Exit
                finish();
            }
        });

        alertDialogBuilder.setNegativeButton("No" , new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });


        alertDialogBuilder.setNeutralButton("Cancel" , new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this,"You have Clicked on Cancel button",Toast.LENGTH_SHORT).show();
            }
        });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();



    }
}