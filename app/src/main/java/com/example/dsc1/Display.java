package com.example.dsc1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Display extends AppCompatActivity {

    TextView name, description, algorithm;
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        name = findViewById(R.id.nameTV);
        description = findViewById(R.id.descTV);
        algorithm = findViewById(R.id.algorithmTV);
        back = findViewById(R.id.finishBtn);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent x = new Intent(Display.this,MainActivity.class);
                startActivity(x);
            }
        });
    }
}
