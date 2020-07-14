package com.example.myandroidjokelib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivityLib extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_lib);
        String joke = getIntent().getStringExtra("Joke");
        TextView textView = findViewById(R.id.joke_lib_text_view);
        textView.setText(joke);
    }
}