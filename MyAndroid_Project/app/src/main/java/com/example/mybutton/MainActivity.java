package com.example.mybutton;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button loginButton,logoutButton;

    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginButton = (Button) findViewById(R.id.loginButtonId);
        logoutButton =(Button) findViewById(R.id.logoutButtonId);

        textView = (TextView) findViewById(R.id.textViewId);

    loginButton.setOnClickListener(this);
    logoutButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.loginButtonId){
            textView.setText("Login Button is Clicked !");
        }

//        else dileo hoito jehetu 2 ta button ache !

       if(v.getId() == R.id.logoutButtonId) {
           textView.setText("Logout Button is Clicked !");
       }
    }
}