package com.example.feedzieapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.google.firebase.auth.FirebaseAuth;

public class Dashboard extends AppCompatActivity {


    CardView donate, receive, logout, foodmap, about, contact, mypin, history;
    FirebaseAuth fAuth;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        donate = findViewById(R.id.cardDonate);
        receive = findViewById(R.id.cardReceive);
        logout = findViewById(R.id.cardLogout);
        foodmap = findViewById(R.id.cardFoodmap);
        mypin = findViewById(R.id.cardMyPin);
        history = findViewById(R.id.cardHistory);
        about = findViewById(R.id.cardAboutus);
        contact = findViewById(R.id.cardContact);




        // FirebaseApp.initializeApp(MainActivity.this);
        fAuth= FirebaseAuth.getInstance();
        if(fAuth.getCurrentUser() ==null){
            Intent intent = new Intent(Dashboard.this, landingpage.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        }

        donate.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), Donate.class);
            startActivity(intent);
        });
        receive.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), Receive.class);
            startActivity(intent);
        });
        foodmap.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), FoodMap.class);
            startActivity(intent);
        });
        about.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), About.class);
            startActivity(intent);
        });
        mypin.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), MyPin.class);
            startActivity(intent);
        });
        history.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), UserdataActivity.class);
            startActivity(intent);
        });
        contact.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), Contact.class);
            startActivity(intent);
        });
        logout.setOnClickListener(v -> {
            FirebaseAuth.getInstance().signOut();
            Intent intent = new Intent(Dashboard.this, landingpage.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        });
    }
}