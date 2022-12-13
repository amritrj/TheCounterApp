package com.example.thecounterapp;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView welcome_text, counter_text;
    Button clickBtn, increaseBtn, decreaseBtn;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        welcome_text = findViewById(R.id.welcome_text);
        counter_text = findViewById(R.id.counter_text);
        clickBtn = findViewById(R.id.clickBtn);
        increaseBtn = findViewById(R.id.increaseBtn);
        decreaseBtn = findViewById(R.id.decreaseBtn);


        clickBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter_text.setText("" + zeroCounter());
            }
        });

        increaseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter_text.setText("" + increaseCounter());
            }
        });

        decreaseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter_text.setText("" + decreaseCounter());
            }
        });
    }
    public int decreaseCounter() {
        return --counter;
    }

    public int increaseCounter() {
        return ++counter;
    }

    public int zeroCounter(){
        counter = 0;
        return counter;
    }


}
