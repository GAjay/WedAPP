package com.example.ajay.livevideos.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.ajay.livevideos.R;

/**
 * A class for TODO add Class definition.
 *
 * @author : Ajay Kumar Maheshwari.
 */

public class SplashActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = new Intent(SplashActivity.this, MainActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slideup, R.anim.slidedown);
        finish();

    }

}
