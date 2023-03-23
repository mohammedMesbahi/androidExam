package com.example.androidexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.androidexam.models.User;

public class HomeActivity extends AppCompatActivity {
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        textView=findViewById(R.id.hello);
        Intent intent= getIntent();
        User user = (User) intent.getSerializableExtra("user");
        textView.setText(user.getFullName());
    }
}