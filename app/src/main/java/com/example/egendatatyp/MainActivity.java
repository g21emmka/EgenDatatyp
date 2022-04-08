package com.example.egendatatyp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Berg b = new Berg("Billinge", "Skövde", 304);
        Log.d("==GREGER==",b.getName());
    }
}