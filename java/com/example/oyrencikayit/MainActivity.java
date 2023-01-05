package com.example.oyrencikayit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EditText edityazi = findViewById(R.id.qiymet1);
        EditText edityazi = findViewById(R.id.qiymet2);
        EditText edityazi = findViewById(R.id.qiymet3);
        EditText edityazi = findViewById(R.id.buton1);

    }
}