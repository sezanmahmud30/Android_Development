package com.example.countryprofile;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ProfileActivity extends AppCompatActivity {

    private ImageView imageView;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_profile);


        imageView = (ImageView) findViewById(R.id.imageViewID);
        textView = (TextView) findViewById(R.id.textViewId);

        Bundle bundle = getIntent().getExtras();
        if(bundle != null){

            String countryName = bundle.getString("name");


            showDetails(countryName);
        }

    }

    void showDetails(String countryName){

        if(countryName.equals("bangladesh")){
            imageView.setImageResource(R.drawable.bangladesh_national);
            textView.setText(R.string.bangladesh_text);
        }

        if(countryName.equals("india")){
            imageView.setImageResource(R.drawable.indian_parliament);
            textView.setText(R.string.india_text);
        }

        if(countryName.equals("pakistan")){
            imageView.setImageResource(R.drawable.pakistan_parliament);
            textView.setText(R.string.pakistan_text);
        }

    }
}