package com.umn.mobile.umntour.Loading;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.umn.mobile.umntour.MainActivity;
import com.umn.mobile.umntour.R;

public class LoadScreen2 extends LoadScreen1 {

    protected void setUpLoading() {
        duration = 2000;
        fadeInOffset = 0;
        fadeOutOffset = 1500;
        className = MainActivity.class.getName();
        iv.setImageResource(R.drawable.splash2);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
