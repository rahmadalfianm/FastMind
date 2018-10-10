package com.amrdeveloper.fastmind;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SigninActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
    }

    public void goToLoginActivity(View view){
        Intent intent = new Intent(SigninActivity.this , LoginActivity.class);
        startActivity(intent);
        finish();
    }
}