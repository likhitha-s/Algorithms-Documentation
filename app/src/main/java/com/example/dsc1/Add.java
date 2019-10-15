package com.example.dsc1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Add extends AppCompatActivity {

    TextView name, description, algorithm;
    Button finish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        name = findViewById(R.id.nameTV);
        description = findViewById(R.id.descTV);
        algorithm = findViewById(R.id.algorithmTV);
        finish = findViewById(R.id.finishBtn);

        finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });
    }
}
