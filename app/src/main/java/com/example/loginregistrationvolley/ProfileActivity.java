package com.example.loginregistrationvolley;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ProfileActivity extends AppCompatActivity {
    TextView textView;
    Button logout;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        //Assign ID's to textview and button.
        textView = (TextView) findViewById(R.id.TextViewUserEmail);
        logout = (Button) findViewById(R.id.button_logout);

        // Receiving value into activity using intent.
        String TempHolder = getIntent().getStringExtra("UserEmailTAG");

        // Setting up received value into TextView.
        textView.setText("Welcome - " + TempHolder);

        // Adding click listener to logout button.
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Showing Echo Response Message Coming From Server.
                Toast.makeText(ProfileActivity.this, "Logged Out Successfully", Toast.LENGTH_LONG).show();

                // Closing the current activity.
                finish();

                // Redirect to  Login activity after log out.
                Intent intent = new Intent(ProfileActivity.this, LoginActivity.class);

                startActivity(intent);

            }
        });
    }
    }

