package com.example.mybutton;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Button loginButton,logoutButton;

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginButton = (Button) findViewById(R.id.loginButtonId);
        logoutButton =(Button) findViewById(R.id.logoutButtonId);

        textView = (TextView) findViewById(R.id.textViewId);



    }

    public void showMassage(View v) {

        if (v.getId() == R.id.loginButtonId) {
            textView.setText("Login Button is Clicked");
        } else if (v.getId() == R.id.logoutButtonId) {
            textView.setText("Logout Button is Clicked");
        }
    }
}