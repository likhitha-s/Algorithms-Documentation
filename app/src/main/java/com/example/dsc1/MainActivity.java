package com.example.dsc1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    Button addBtn,deleteBtn;
    ListView LV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addBtn = findViewById(R.id.AddBtn);
        deleteBtn = findViewById(R.id.DeleteBtn);
        LV = findViewById(R.id.LV);

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent x = new Intent(MainActivity.this,Add.class);
                startActivity(x);
            }
        });

        deleteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });

        LV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent y = new Intent(MainActivity.this, Display.class);
                startActivity(y);
            }
        });

    }

    private void notification(){

        NotificationCompat.Builder builder = new NotificationCompat.Builder(this).setSmallIcon().setContentTitle().setContentText();
        Intent noti = new Intent(this,MainActivity.class);
        PendingIntent contentIntent = PendingIntent.getActivity(this,0,noti,PendingIntent.FLAG_UPDATE_CURRENT);
        builder.setContentIntent(contentIntent);
        NotificationManager manager =  (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        manager.notify(0,builder.build());

    }
}
