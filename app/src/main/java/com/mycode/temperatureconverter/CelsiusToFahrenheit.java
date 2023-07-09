package com.mycode.temperatureconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CelsiusToFahrenheit extends AppCompatActivity {

    Button button;
    TextView textView;
    EditText editText;

    String temp;
    float temperature;

    @SuppressLint({"MissingInflatedId", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.celsius_to_fahrenheit);
        button = findViewById(R.id.buttonConvert);
        textView = findViewById(R.id.result);
        editText = findViewById(R.id.input);

        button.setOnClickListener(v -> {
            temp = editText.getText().toString();
            float celsius = Float.parseFloat(temp);
            temperature = (celsius * 9 / 5) + 32;
            textView.setText(celsius + " C = " + temperature + " F");
            editText.setText("");
        });
    }
}