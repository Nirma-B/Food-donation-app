package com.example.feedzieapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.google.firebase.auth.FirebaseAuth;

import java.util.Objects;

public class ResetPasswordActivity extends AppCompatActivity{
    private EditText txtEmail;
    private String email;
    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pwd_reset);

        auth=FirebaseAuth.getInstance();

        txtEmail=findViewById(R.id.respwdemail);
        Button forgetbtn = findViewById(R.id.respwdsend);

        forgetbtn.setOnClickListener(view -> validateData());
    }
    private void validateData(){
        email=txtEmail.getText().toString();
        if (email.isEmpty()) {
            txtEmail.setError("Required");
        }else{
            forgetPass();
        }
    }
    private void forgetPass(){
        auth.sendPasswordResetEmail(email)
                .addOnCompleteListener(task -> {
                    if(task.isSuccessful()){
                        Toast.makeText(ResetPasswordActivity.this, "Check your email", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(ResetPasswordActivity.this, Logup.class));
                        finish();
                    }else{
                        Toast.makeText(ResetPasswordActivity.this, "Error:"+ Objects.requireNonNull(task.getException()).getMessage(), Toast.LENGTH_SHORT).show();


                    }
                });
    }
}