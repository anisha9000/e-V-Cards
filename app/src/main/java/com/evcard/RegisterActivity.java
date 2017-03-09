package com.evcard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.evcard.utils.Preferences;

public class RegisterActivity extends AppCompatActivity {

    // UI Elements
    Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        intiScreen();
    }

    private void intiScreen() {
        btnRegister = (Button) findViewById(R.id.btn_register);
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Preferences.setBooleanPreference(RegisterActivity.this,Preferences.IS_LOGIN, true);
                openDashboard();
            }
        });

    }

    private void openDashboard() {
        Intent intent = new Intent(this, Dashboard.class);
        startActivity(intent);
    }
}
