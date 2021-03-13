package com.example.myform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.telephony.PhoneNumberUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button submit;
    EditText name;
    EditText email;
    EditText phone;

    public static final String EXTRA_NAME = "com.example.myform.NAME";
    public static final String EXTRA_EMAIL = "com.example.myform.EMAIL";
    public static final String EXTRA_PHONE = "com.example.myform.PHONE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void openActivity(View v){
        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        phone = findViewById(R.id.phone);
        submit = findViewById(R.id.button);
        String nameText = name.getText().toString();
        String emailText = email.getText().toString();
        String phoneText = phone.getText().toString();

        Intent intent = new Intent(this,MainActivity2.class);
        intent.putExtra(EXTRA_NAME,nameText);
        intent.putExtra(EXTRA_EMAIL,emailText);
        intent.putExtra(EXTRA_PHONE,phoneText);
        startActivity(intent);

    }
}