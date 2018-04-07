package com.example.chven.lab1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ForgotActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot);
    }
    public void gotoIndex(View view) {
        Intent redirect = new Intent(ForgotActivity.this, IndexActivity.class);
        startActivity(redirect);
    }
}
