package com.prerana.chatapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private EditText edtEmail,edtPassword,edtUsername;
    private Button btnSignin;
    private TextView txtLogin;

    private boolean isSigningUp=true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtUsername = findViewById(R.id.edtUsername);
        edtEmail = findViewById(R.id.edtEmail);
        edtPassword = findViewById(R.id.edtPassword);

        btnSignin = findViewById(R.id.btnSignin);

        txtLogin = findViewById(R.id.txtLogin);

        txtLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isSigningUp){
                    isSigningUp = false;
                    edtUsername.setVisibility(View.GONE);
                    btnSignin.setText("Log in");
                    txtLogin.setText("Don't have an account ? Sign up");

                }
                else {
                    isSigningUp=true;
                    edtUsername.setVisibility(View.VISIBLE);
                    btnSignin.setText("Sign in");
                    txtLogin.setText("Already have an account? Log in");
                }
            }
        });

    }
}