package com.example.mysharedemoapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class FeedbackActivity extends AppCompatActivity implements View.OnClickListener {

    private Button sendButton,clearButton;
    private EditText nameEditText,messageEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_feedback);

        sendButton = (Button) findViewById(R.id.sendButtonId);
        clearButton = (Button) findViewById(R.id.clearButtonId);

        nameEditText = (EditText) findViewById(R.id.nameEditText);
        messageEditText = (EditText) findViewById(R.id.messageEditTextId);

        sendButton.setOnClickListener(this);
        clearButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        try {

            String name = nameEditText.getText().toString();
            String message = messageEditText.getText().toString();

            if(view.getId()==R.id.sendButtonId){

                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/email");

                intent.putExtra(Intent.EXTRA_EMAIL,new String[]{"sezanmahmud789@gmail.com"});

                intent.putExtra(Intent.EXTRA_SUBJECT,"Feedback from App");
                intent.putExtra(Intent.EXTRA_TEXT,"Name : "+name +"\n Message: "+message);

                startActivity(Intent.createChooser(intent,"Feedback with"));

            }
            else if(view.getId()== R.id.clearButtonId){
                nameEditText.setText("");
                messageEditText.setText("");
            }

        }catch (Exception e){


            Toast.makeText(getApplicationContext(),"Exception : "+e,Toast.LENGTH_SHORT).show();

        }




    }
}