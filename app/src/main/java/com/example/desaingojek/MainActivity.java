package com.example.desaingojek;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
ImageView courier, transport, food, shop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        courier = findViewById(R.id.imgCourier);
        transport = findViewById(R.id.imgTransport);
        food = findViewById(R.id.imgFood);
        shop = findViewById(R.id.imgShop);

        courier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Ini Toast Instant Courier", Toast.LENGTH_SHORT).show();
            }
        });

        transport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Ini Toast Transport", Toast.LENGTH_SHORT).show();
            }
        });

        food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Ini Toast Go Food", Toast.LENGTH_SHORT).show();
            }
        });

        shop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Ini Toast Go Shoping", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
