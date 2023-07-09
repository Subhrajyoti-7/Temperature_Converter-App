package com.mycode.temperatureconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button1, button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id.buttonCelsius);
        button2 = findViewById(R.id.buttonFahrenheit);
        Intent intent1 = new Intent(this, CelsiusToFahrenheit.class);
        Intent intent2 = new Intent(this, FahrenheitToCelsius.class);

        button1.setOnClickListener(v -> {
            startActivity(intent1);
        });

        button2.setOnClickListener(v -> {
            startActivity(intent2);
        });
    }
}