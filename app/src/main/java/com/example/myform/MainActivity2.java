package com.example.myform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView nameVal;
    TextView emailVal;
    TextView phoneVal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        nameVal = findViewById(R.id.nameVal);
        emailVal = findViewById(R.id.emailVal);
        phoneVal = findViewById(R.id.phoneVal);
        Intent intent = getIntent();
        String name = intent.getStringExtra(MainActivity.EXTRA_NAME);
        String email = intent.getStringExtra(MainActivity.EXTRA_EMAIL);
        String phone = intent.getStringExtra(MainActivity.EXTRA_PHONE);

        nameVal.setText(name);
        emailVal.setText(email);
        phoneVal.setText(phone);
    }
}