package com.example.parkingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Button nextbutton3 = findViewById(R.id.button3);
        nextbutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(MainActivity3.this, MainActivity2.class);
                startActivity(intent3);
            }
        });

//        Button nextbuttonPermit = findViewById(R.id.buttonPermits);
//        nextbuttonPermit.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intentPermit = new Intent(MainActivity3.this, MainActivity5.class);
//                startActivity(intentPermit);
//            }
//        });
    }
}