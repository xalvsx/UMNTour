package com.umn.mobile.umntour.Loading;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.umn.mobile.umntour.R;

public class LoadScreen1 extends AppCompatActivity {

    protected long duration = 2000;
    protected long fadeInOffset = 500;
    protected long fadeOutOffset = 1500;
    protected String className = LoadScreen1.class.getName();
    protected ImageView iv = null;

    protected void setUpLoading() {
        duration = 2000;
        fadeInOffset = 500;
        fadeOutOffset = 1500;
        className = LoadScreen2.class.getName();
        iv.setImageResource(R.drawable.umntour);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load_screen1);

        iv = (ImageView)findViewById(R.id.bgImage);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        setUpLoading();

        enterTransition();
    }

    protected void enterTransition() {
        final RelativeLayout ll = (RelativeLayout) findViewById(R.id.layout);

        Animation b = new AlphaAnimation(0, 1);
        b.setDuration(duration);
        b.setFillAfter(true);
        b.setStartOffset(fadeInOffset);
        b.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                ll.setAlpha(1);
                try {
                    exitTransition(Class.forName(className), fadeOutOffset);
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
            }
        });

        ll.startAnimation(b);
    }

    protected void exitTransition(Class cls, long offsetDuration) {
        final Class c = cls;
        final RelativeLayout ll = (RelativeLayout) findViewById(R.id.layout);

        Animation b = new AlphaAnimation(1, 0);
        b.setDuration(1500);
        b.setFillAfter(true);
        b.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                ll.setAlpha(0);
                Intent i = new Intent(getApplicationContext(), c);
                startActivity(i);
                finish();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
            }
        });
        b.setStartOffset(offsetDuration);

        ll.startAnimation(b);
    }

}
