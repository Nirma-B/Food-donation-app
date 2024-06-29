package com.example.feedzieapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.messaging.FirebaseMessaging;

public class MainActivity extends AppCompatActivity {
    FirebaseAuth fAuth;
    BottomNavigationView bottomNavigationView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bottomNavigationView = findViewById(R.id.navigator);
        bottomNavigationView.setSelectedItemId(R.id.dashboard);

        bottomNavigationView.setOnItemSelectedListener(item -> {
            int selectedItemId = item.getItemId();

            if (selectedItemId == R.id.dashboard) {
                startActivity(new Intent(getApplicationContext(), Dashboard.class));
                overridePendingTransition(0, 0);
                return true;

            } else if (selectedItemId == R.id.locateNGOs) {
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, new LocateNGOFragment())
                        .commit();
                return true;

            } else if (selectedItemId == R.id.Mission) {
                startActivity(new Intent(getApplicationContext(), mission.class));
                overridePendingTransition(0, 0);

            }

            return false;
        });

        FirebaseApp.initializeApp(MainActivity.this);
        fAuth= FirebaseAuth.getInstance();
        if(fAuth.getCurrentUser() ==null){
            Intent intent = new Intent(MainActivity.this, landingpage.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        }
        FirebaseMessaging.getInstance().subscribeToTopic("/topics/donateFood")
                .addOnCompleteListener(task -> {
                    String msg = "getString(R.string.msg_subscribed)";
                    if (!task.isSuccessful()) {
                        msg = "getString(R.string.msg_subscribe_failed)";
                    }
                });
    }
}