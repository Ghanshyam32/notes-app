package com.ghanshyam.notesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText email = findViewById(R.id.signUp_email);
        EditText password = findViewById(R.id.signUp_pass);
        TextView login = findViewById(R.id.login_main);
        Button createAcc = findViewById(R.id.register);

        login.setOnClickListener(view -> {
            Intent i = new Intent(getApplicationContext(), loginActivity.class);
            startActivity(i);
        });

        createAcc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mEmail = email.toString().trim();
                String pass = password.toString().trim();

                if (mEmail.isEmpty() || pass.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "All fields are required", Toast.LENGTH_SHORT).show();
                } else if (pass.length() < 7) {
                    Toast.makeText(getApplicationContext(), "Password should be more than 7 characters", Toast.LENGTH_SHORT).show();
                }
                else{

                }
            }
        });
    }
}