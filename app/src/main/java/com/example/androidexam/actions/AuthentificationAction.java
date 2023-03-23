package com.example.androidexam.actions;

import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.androidexam.HomeActivity;
import com.example.androidexam.LoginActivity;
import com.example.androidexam.models.User;

public class AuthentificationAction implements View.OnClickListener{

   private LoginActivity LoginActivity;

   private EditText emailInput;
   private EditText passwordInput;
   public AuthentificationAction(LoginActivity LoginActivity){
       this.LoginActivity=LoginActivity;
       emailInput=LoginActivity.getEmailInput();
       passwordInput=LoginActivity.getPasswordInput();
   }

    @Override
    public void onClick(View view) {
        // verification
     if(emailInput.getText().toString().equals("") || passwordInput.getText().toString().equals("")) {
         Toast.makeText(LoginActivity, "all fields are required",
                 Toast.LENGTH_SHORT).show();
         return;
     }
     // authentification
       User user= LoginActivity.getServices().login(emailInput.getText().toString()
                ,passwordInput.getText().toString());
     if(user!=null)
     {
         Intent intent= new Intent(LoginActivity, HomeActivity.class);
         intent.putExtra("user",user);
         LoginActivity.startActivity(intent);
         LoginActivity.finish();
     }
        // Toast.makeText(LoginActivity, "Hi"+user.getName(), Toast.LENGTH_SHORT).show();
     else
         Toast.makeText(LoginActivity, "error", Toast.LENGTH_SHORT).show();
    }
}
