package com.example.chven.lab1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.net.Uri;


public class IndexActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);
    }
    public void gotohome(View view) {
        Intent redirect = new Intent(IndexActivity.this, MainActivity.class);
        startActivity(redirect);
    }
    public void gotohelp(View view) {
        Uri uri = Uri.parse("https://developer.android.com/reference/org/w3c/dom/Document.html");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void gotosettings(View view) {
        Intent redirect = new Intent(IndexActivity.this, SettingsActivity.class);
        startActivity(redirect);
    }
}
