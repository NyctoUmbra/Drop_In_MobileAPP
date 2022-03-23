package com.swe4550.dropin;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class LogIn extends AppCompatActivity {

    //bonding variables
    EditText userEmail;
    EditText userPassword;
    Button loginBtn;
    Button signupBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        userEmail = findViewById(R.id.user_email);
        userPassword = findViewById(R.id.user_password);
        loginBtn = findViewById(R.id.login_btn);
        signupBtn = findViewById(R.id.signup_btn);


        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(userEmail.getText().toString().trim().length() == 0 || userPassword.getText().toString().trim().length() < 6){
                    Toast.makeText(LogIn.this, "Email and Password must be filled and Password longer than six characters", Toast.LENGTH_LONG).show();
                }
                else{
                    if(userLogIn(userEmail.getText().toString().trim(), userPassword.getText().toString().trim())){
                        startActivity(new Intent(LogIn.this, Discover.class));
                }
                else{
                        Toast.makeText(LogIn.this, "Incorrect Email or Password. Make sure credentials are correct.", Toast.LENGTH_LONG).show();
                }
            }
        }
    });
    }







    boolean userLogIn(String email, String password){
        //initialize variables
        FirebaseAuth mAuth = FirebaseAuth.getInstance();
        final boolean[] TaskSuccessful = new boolean[1];

        //Sign in and check if task is completed correctly or not
        mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()) {
                    TaskSuccessful[0] = true;
                }else{
                    TaskSuccessful[0] = false;
                }
            }
        });

        //return succesful status
        return TaskSuccessful[0];
    }
}

 //loginBtn.setOnClickListener(
//@Override void OnClick(View v){   }







// 3/14/22 stuff

// public void onClick(view v) {
/* switch (v.getId()){
  case R.id.register:
    startActivity(new Layout(getTheme()));
          }
     }
 }                                  */







//This is an edit
//This is an another edit
// This yet another edit
// Sandwich
//saveState
// This yet another edit
// Sandwich