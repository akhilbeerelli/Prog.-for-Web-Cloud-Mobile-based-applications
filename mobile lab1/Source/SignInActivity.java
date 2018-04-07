package com.example.chven.lab1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class SignInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        // Configure sign-in to request the user's ID, email address, and basic
// profile. ID and basic profile are included in DEFAULT_SIGN_IN.
        //GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
          //      .requestEmail()
            //    .build();
        // Build a GoogleSignInClient with the options specified by gso.
        //mGoogleSignInClient = GoogleSignIn.getClient(this, gso);
    }
    public void gotoIndex(View view) {
        Intent redirect = new Intent(SignInActivity.this, IndexActivity.class);
        startActivity(redirect);
    }

    public void gotoForgot(View view) {
        Intent redirect = new Intent(SignInActivity.this, ForgotActivity.class);
        startActivity(redirect);
    }

//   public void onClick(View v) {
//        switch (v.getId()) {
//            case R.id.button5:
//                signIn();
//                break;
//            // ...
//        }
   // }
   // private void signIn() {
        //Intent signInIntent = mGoogleSignInClient.getSignInIntent();
        //startActivityForResult(signInIntent, RC_SIGN_IN);
    //}
}
