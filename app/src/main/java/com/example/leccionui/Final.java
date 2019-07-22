package com.example.leccionui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Final extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

        Intent intent = getIntent();
        String[] message = intent.getStringArrayExtra("strings");

        TextView textViewUser = findViewById(R.id.textView);
        textViewUser.setText(message[0] + message[1]);


    }
}