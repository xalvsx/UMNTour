package com.umn.mobile.umntour;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    protected SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exitTransition(CorridorExample.class);
            }
        });

        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());

        final String savepoint = sharedPreferences.getString("Savepoint","no");
        if(!savepoint.equalsIgnoreCase("no")) {
            Button btnLoad = new Button(this);
            btnLoad.setText("Load Savepoint");
            RelativeLayout.LayoutParams pl = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            pl.setMargins(0,50,0,0);
            btnLoad.setLayoutParams(pl);
            btnLoad.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {
                        exitTransition(Class.forName(savepoint));
                        ProgressDialog p = new ProgressDialog(MainActivity.this);
                        p.setIndeterminate(false);
                        p.setCancelable(false);
                        p.setMessage("Loading...");
                        p.show();
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                        Toast.makeText(MainActivity.this, "An error occured.", Toast.LENGTH_SHORT).show();
                    }
                }
            });
            ((RelativeLayout)findViewById(R.id.layout)).addView(btnLoad);
        }
    }

    protected void exitTransition(Class cls) {
        final Class c = cls;
        final RelativeLayout ll = (RelativeLayout) findViewById(R.id.topLayout);

        Animation b = new AlphaAnimation(1, 0);
        b.setDuration(2500);
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
        b.setStartOffset(500);

        ll.startAnimation(b);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
