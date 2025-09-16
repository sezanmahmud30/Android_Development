package com.example.mycustomadapter;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private ListView listView;

    private String[] countryNames;


    private int[] flags={R.drawable.afghanistan,R.drawable.armenia,R.drawable.azerbaijan,
            R.drawable.bahrain,R.drawable.bangladesh,R.drawable.bhutan,R.drawable.china,
            R.drawable.india,R.drawable.japan,R.drawable.nepal,R.drawable.pakistan,R.drawable.sri_lanka};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        countryNames = getResources().getStringArray(R.array.country_names);

        listView = (ListView) findViewById(R.id.listViewId);



        CustomAdapter adapter = new CustomAdapter(this,countryNames,flags);
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String value = countryNames[position];

                Toast.makeText(MainActivity.this,value,Toast.LENGTH_SHORT).show();

            }
        });


    }
}