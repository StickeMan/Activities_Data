package com.example.activities_navigation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView = (TextView) findViewById(R.id.text);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        if (bundle!=null){
            String cadena = (String) bundle.get("DATO");
            textView.setText(cadena);
        }
    }
}