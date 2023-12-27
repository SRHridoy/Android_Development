package com.elitcoder.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String arr[] = {"Hridoy","Elite","Coder","C","C++","Java","Python","JavaScript","Ruby"};

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);
        //Adapter lagbe string array ke list view e dekhaite hole ba fit korte hole...Ar adapter e 3 ta argument pass kora lagbe...
        ArrayAdapter ad = new ArrayAdapter(this, android.R.layout.simple_list_item_1,arr);
        listView.setAdapter(ad);

    }
}