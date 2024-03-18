package com.example.fibbonacciapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView welcometext;
    TextView seriesdisplay;
    Button Generate;
    EditText Limit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        welcometext = findViewById(R.id.welcometext);
        seriesdisplay = findViewById(R.id.series_display);
        Limit = findViewById(R.id.Limit);
        Generate = findViewById(R.id.Generate);

        Generate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num = Integer.parseInt(Limit.getText().toString());
                StringBuilder sequence = new StringBuilder();
                int a = 0;
                int b = 1;
                sequence.append(a).append(",");

                for (int i = 1; i < num; i++) {
                    sequence.append(b).append(",");
                    int sum = a + b;
                    a = b;
                    b = sum;
                }
                String fibo = sequence.toString();
                seriesdisplay.setText(fibo);
                Toast.makeText(MainActivity.this, "Your Fibonacci Series is", Toast.LENGTH_LONG).show();
            }
        });
    }
}
