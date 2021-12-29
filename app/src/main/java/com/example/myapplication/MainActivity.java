package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    int a = 0;

    Button btn;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: ");
        textView = findViewById(R.id.textView);

        btn = findViewById(R.id.btn1);
        textView = findViewById(R.id.textView);

        btn.setOnClickListener(v -> {
            a++;
            textView.setText(String.valueOf(a));
        });
    }
}

