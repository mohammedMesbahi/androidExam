package com.example.androidexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.androidexam.actions.AuthentificationAction;
import com.example.androidexam.business.Services;

public class LoginActivity extends AppCompatActivity {
    private Button loginButton;
    private Button registerButton;
    private EditText emailInput;
    private EditText passwordInput;
    private Services services;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        services= ((MyContext)getApplicationContext()).getServices();
        //recuperation des views
        loginButton=findViewById(R.id.login_button);
        emailInput=findViewById(R.id.email_input);
        passwordInput=findViewById(R.id.password_input);
        registerButton = findViewById(R.id.register_button);
        registerButton.setOnClickListener(
                view->{
                    Intent intent= new Intent(this,RegisterActivity.class);
                    startActivity(intent);
                    finish();
                }
        );
        AuthentificationAction authentificationAction=new AuthentificationAction(this);
        loginButton.setOnClickListener(authentificationAction);
    }
    public Services getServices() {
        return services;
    }

    public EditText getEmailInput() {
        return emailInput;
    }

    public EditText getPasswordInput() {
        return passwordInput;
    }
}