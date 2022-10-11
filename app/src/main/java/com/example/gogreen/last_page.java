package com.example.gogreen;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class last_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last_page);
        findViewById(R.id.rectangle_4).setOnClickListener(v -> {
            AlertDialog d = new AlertDialog.Builder(this)

                    .setMessage("alerted")
                    .setPositiveButton("OK", (d1, i) -> {
                    })
                    .create();
            d.show();
        });
    }
}