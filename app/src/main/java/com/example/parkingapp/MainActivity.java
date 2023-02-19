package com.example.parkingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button nextbutton = findViewById(R.id.button1);
        nextbutton.setOnClickListener(new View.OnClickListener()

            {
                @Override
                public void onClick(View view)
                {
                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                    startActivity(intent);
                }

            });
        Button nextbutton2 = findViewById(R.id.button2);
        nextbutton2.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View view)
            {
                Intent intent2 = new Intent(MainActivity.this, MainActivity3.class);
                startActivity(intent2);
            }

        });


    }


}