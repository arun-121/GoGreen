package com.example.gogreen;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private TextView signup;
    private TextView sign_up;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        signup = findViewById(R.id.rectangle_4);
        sign_up = findViewById(R.id.sign_up);
        signup.setOnClickListener(view -> {
            startActivity(new Intent(this, HomeActivity.class));
        });
        sign_up.setOnClickListener(view -> {
            startActivity(new Intent(this, signup.class));
            finish();
        });


    }

}