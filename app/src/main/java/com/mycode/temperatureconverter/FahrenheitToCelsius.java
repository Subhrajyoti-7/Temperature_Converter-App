package com.mycode.temperatureconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FahrenheitToCelsius extends AppCompatActivity {

    Button button;
    TextView textView;
    EditText editText;
    String temp;
    float temperature;
    @SuppressLint({"MissingInflatedId", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fahrenheit_to_celsius);
        button = findViewById(R.id.buttonConvert2);
        textView = findViewById(R.id.result2);
        editText = findViewById(R.id.input2);

        button.setOnClickListener(v -> {
            temp = editText.getText().toString();
            float fahrenheit = Float.parseFloat(temp);
            temperature = ((fahrenheit - 32) * 5) / 9;
            textView.setText(fahrenheit + " F = " + temperature + " C");
            editText.setText("");
        });
    }
}