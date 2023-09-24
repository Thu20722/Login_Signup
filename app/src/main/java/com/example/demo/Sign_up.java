package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class Sign_up extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        EditText username = (EditText) findViewById(R.id.username);
        MaterialButton regbtn = (MaterialButton) findViewById(R.id.signupbtn);
        regbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username1 = username.getText().toString();
                Toast.makeText(Sign_up.this ,"Username is"+username1,Toast.LENGTH_SHORT).show();
            }
        });
    }
}