package com.umn.mobile.umntour;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.design.widget.Snackbar;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.orhanobut.dialogplus.DialogPlus;
import com.orhanobut.dialogplus.OnItemClickListener;
import com.orhanobut.dialogplus.ViewHolder;

public class MainActivity extends AppCompatActivity {

    protected SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());

        Button btnStart = (Button)findViewById(R.id.btnStart);
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animateButton(v);
                exitTransition(Lantai3.class);
                ProgressDialog p = new ProgressDialog(MainActivity.this);
                p.setIndeterminate(false);
                p.setCancelable(false);
                p.setMessage("Starting tour...");
                p.show();
            }
        });

        LinearLayout lay = new LinearLayout(getApplicationContext());
        LinearLayout.LayoutParams p = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        p.setMargins(50, 50, 50, 50);
        lay.setLayoutParams(p);
        lay.setGravity(Gravity.CENTER);
        lay.setOrientation(LinearLayout.VERTICAL);

        LinearLayout.LayoutParams ttl = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);

        ImageView ivGroup = new ImageView(this);
        ivGroup.setImageResource(R.drawable.umntour);
        lay.addView(ivGroup);

        final DialogPlus dialog = DialogPlus.newDialog(this)
                .setOnItemClickListener(new OnItemClickListener() {
                    @Override
                    public void onItemClick(DialogPlus dialog, Object item, View view, int position) {
                    }
                })
                .setContentHolder(new ViewHolder(lay))
                .setInAnimation(R.anim.about_dialog_in)
                .setOutAnimation(R.anim.about_dialog_out)
                .setGravity(Gravity.CENTER)
                .setCancelable(true)
                .setContentHeight(ViewGroup.LayoutParams.WRAP_CONTENT)
                .setContentWidth(ViewGroup.LayoutParams.WRAP_CONTENT)
                .setPadding(25, 25, 25, 25)
                .create();

        ivGroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        Button btnAbout = (Button)findViewById(R.id.btnAbout);
        btnAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animateButton(v); dialog.show();
            }
        });

        final String savepoint = sharedPreferences.getString("Savepoint","no");
        Button btnLoad = (Button)findViewById(R.id.btnLoad);
        if(!savepoint.equalsIgnoreCase("no")) {
            btnLoad.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    animateButton(v);
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
        }
        else {
            btnLoad.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    animateButton(v);
                    Snackbar snack = Snackbar.make(v, "You don't have a savepoint. Start touring and save one!", Snackbar.LENGTH_SHORT);
                    ViewGroup group = (ViewGroup) snack.getView();
                    group.setAlpha(0.9f);
                    group.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), android.R.color.holo_blue_light));
                    snack.show();
                }
            });
        }

        Button btnExit = (Button)findViewById(R.id.btnExit);
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animateButton(v);
                onBackPressed();
            }
        });
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

    private void animateButton(View view) {
        final View v = view;
        Animation btnAnimate = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.button_animate);
        btnAnimate.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {}
            @Override
            public void onAnimationEnd(Animation animation) {}
            @Override
            public void onAnimationRepeat(Animation animation) {}
        });
        v.startAnimation(btnAnimate);
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder2 = new AlertDialog.Builder(this);
        builder2.setTitle("Exit")
                .setMessage("Do you want to go exit the application?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                        dialog.dismiss();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
        AlertDialog dialog2 = builder2.create();
        dialog2.show();
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
