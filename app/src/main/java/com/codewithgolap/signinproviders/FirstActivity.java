package com.codewithgolap.signinproviders;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class FirstActivity extends AppCompatActivity {

    FirebaseAuth mAuth;
    FirebaseUser currentUser ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        // ini
        mAuth = FirebaseAuth.getInstance();
        currentUser = mAuth.getCurrentUser();


    }

    public void gotosignuppage(View view) {
        Intent intent = new Intent(getApplicationContext(), EmailAndPasswordRegisterActivity.class);
        startActivity(intent);
    }

    public void gotosigninpage(View view) {
        Intent intent = new Intent(getApplicationContext(), EmailAndPasswordLoginActivity.class);
        startActivity(intent);
    }
}