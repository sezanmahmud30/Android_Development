package com.example.mybutton;

import android.os.Bundle;
import android.os.Handler;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

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

            Toast toast =Toast.makeText(MainActivity.this,"Login Button is Clicked",Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER,0,0);
            toast.show();

        } else if (v.getId() == R.id.logoutButtonId) {

            Toast toast =Toast.makeText(MainActivity.this,"Logout Button is Clicked !",Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER,0,0);
            toast.show();

        }
    }
}