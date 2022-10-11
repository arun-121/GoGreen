package com.example.gogreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
    private TextView donate1;
    private View rent_1;
    private TextView last_page;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        donate1 = findViewById(R.id.donate);
        donate1.setOnClickListener(view -> {
            startActivity(new Intent(this,Recycle_page.class));
        });
        rent_1 = findViewById(R.id.rent);
        rent_1.setOnClickListener(view -> {
            startActivity(new Intent(this,Rent_page.class));
        });  last_page = findViewById(R.id.recycle);
        last_page.setOnClickListener(view -> {
            startActivity(new Intent(this, com.example.gogreen.last_page.class));
        });


    }
}