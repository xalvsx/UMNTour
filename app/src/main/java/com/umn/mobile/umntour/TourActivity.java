package com.umn.mobile.umntour;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.ScaleAnimation;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.orhanobut.dialogplus.DialogPlus;
import com.orhanobut.dialogplus.OnItemClickListener;
import com.orhanobut.dialogplus.ViewHolder;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;

public class TourActivity extends AppCompatActivity implements View.OnClickListener {

    protected List<ImageButton> mButtons = new ArrayList<ImageButton>();
    protected Boolean isFabOpen = false;
    protected FloatingActionButton fab,fab1,fab2,fab3,fab4,fab5;
    protected Animation fab_open1,fab_open2,fab_open3,fab_open4,fab_open5,fab_close,rotate_forward,rotate_backward;
    protected RelativeLayout layout;
    protected boolean flagEnter = true;
    protected DisplayMetrics m;

    protected String detailTitle = "",detailContent = "";
    protected boolean bookmarked = false;
    protected boolean isTouring = false;
    protected boolean isDay = true;

    protected SharedPreferences sharedPreferences;
    protected HashMap<Integer, String> details = new HashMap<>();

    protected Snackbar activeSnackbar = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tour);

        m = getApplicationContext().getResources().getDisplayMetrics();

        Animation b = new AlphaAnimation(1,0);
        b.setDuration(2200);
        b.setFillAfter(true);

        enterTransition();


        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        fab = (FloatingActionButton)findViewById(R.id.fab);
        fab1 = (FloatingActionButton)findViewById(R.id.fab1);
        fab2 = (FloatingActionButton)findViewById(R.id.fab2);
        fab3 = (FloatingActionButton)findViewById(R.id.fab3);
        fab4 = (FloatingActionButton)findViewById(R.id.fab4);
        fab5 = (FloatingActionButton)findViewById(R.id.fab5);
        fab_open1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fab_open1);
        fab_open2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fab_open2);
        fab_open3 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fab_open3);
        fab_open4 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fab_open4);
        fab_open5 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fab_open5);
        fab_close = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fab_close);
        rotate_forward = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate_forward);
        rotate_backward = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate_backward);
        fab.setOnClickListener(this);
        fab1.setOnClickListener(this);
        fab2.setOnClickListener(this);
        fab3.setOnClickListener(this);
        fab4.setOnClickListener(this);
        fab5.setOnClickListener(this);

        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());

        String savepoint = sharedPreferences.getString("Savepoint","no");
        if(savepoint.equalsIgnoreCase(this.getClass().getName())) {
            fab4.setImageResource(android.R.drawable.btn_star_big_on);
            bookmarked = true;
        }

        Calendar c = Calendar.getInstance();
        int timeOfDay = c.get(Calendar.HOUR_OF_DAY);
        if(timeOfDay >= 18 || timeOfDay < 6) {
            isDay = false;
        }

        layout = (RelativeLayout)findViewById(R.id.layout);

        setUpActivity();

        getAllImageButtons((ViewGroup) findViewById(R.id.layout));
    }

    protected void setUpActivity(){};

    protected int getdp(int val) {
        int px = (int) TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP,
                val,
                m
        );
        return px;
    }

    protected void setActivityDetail(String title, String content) {
        detailTitle = title;
        detailContent = content;
    }

    protected void showDetail() {
        LinearLayout lay = new LinearLayout(getApplicationContext());
        LinearLayout.LayoutParams p = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        p.setMargins(50, 50, 50, 50);
        lay.setLayoutParams(p);
        lay.setGravity(Gravity.CENTER);
        lay.setOrientation(LinearLayout.VERTICAL);

        LinearLayout.LayoutParams ttl = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);

        TextView title = new TextView(getApplicationContext());
        title.setText(detailTitle);
        title.setGravity(Gravity.CENTER);
        title.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        title.setTextSize(26f);
        ttl.setMargins(0, 0, 0, 25);
        title.setLayoutParams(ttl);
        title.setTextColor(ContextCompat.getColor(getApplicationContext(), android.R.color.holo_blue_dark));
        lay.addView(title);

        TextView content = new TextView(getApplicationContext());
        content.setText(detailContent);
        content.setTextSize(20f);
        content.setLayoutParams(ttl);
        content.setTextColor(ContextCompat.getColor(getApplicationContext(), android.R.color.black));
        lay.addView(content);
        Button btnOk = new Button(getApplicationContext());
        btnOk.setText("OK");
        lay.addView(btnOk);

        final DialogPlus dialog = DialogPlus.newDialog(this)
                .setOnItemClickListener(new OnItemClickListener() {
                    @Override
                    public void onItemClick(DialogPlus dialog, Object item, View view, int position) {
                    }
                })
                .setContentHolder(new ViewHolder(lay))
                .setInAnimation(R.anim.dialog_in)
                .setOutAnimation(R.anim.dialog_out)
                .setGravity(Gravity.CENTER)
                .setCancelable(true)
                .setContentHeight(ViewGroup.LayoutParams.WRAP_CONTENT)
                .setContentWidth(ViewGroup.LayoutParams.WRAP_CONTENT)
                .setPadding(25, 25, 25, 25)
                .create();
        dialog.show();

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
    }

    @Override
    public void onClick(View v) {
        final View v2 = v;
        int id = v.getId();
        switch (id) {
            case R.id.fab:
                animateFAB();
                break;
            case R.id.fab1:
                //navigate to home activity
                exitTransition(MainActivity.class,0);
                break;
            case R.id.fab2:
                //show group member
                break;
            case R.id.fab3:
                showDetail();
                break;
            case R.id.fab4:
                //save activity name
                Class c = this.getClass();
                final String namaClass = c.getName();
                final SharedPreferences.Editor editor = sharedPreferences.edit();
                //ImageView iv = (ImageView)findViewById(R.id.bgImage);
                if(bookmarked) {
                    editor.putString("Savepoint","no");
                    fab4.setImageResource(android.R.drawable.btn_star_big_off);
                    Snackbar.make(v, "Savepoint has been deleted :)", Snackbar.LENGTH_SHORT).show();
                    bookmarked = false;
                }
                else {
                    String savepoint = sharedPreferences.getString("Savepoint","no");
                    if(savepoint.equalsIgnoreCase("no")) {
                        editor.putString("Savepoint", namaClass);
                        fab4.setImageResource(android.R.drawable.btn_star_big_on);
                        Snackbar.make(v, "Savepoint has been created :)", Snackbar.LENGTH_SHORT).show();
                        bookmarked = true;
                    }
                    else {
                        AlertDialog.Builder builder = new AlertDialog.Builder(this);
                        builder.setTitle("Savepoint")
                                .setMessage("Your last savepoint will be replaced. Are you sure?")
                                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        editor.putString("Savepoint", namaClass);
                                        fab4.setImageResource(android.R.drawable.btn_star_big_on);
                                        Snackbar.make(v2, "Savepoint has been created :)", Snackbar.LENGTH_SHORT).show();
                                        bookmarked = true;
                                        dialog.dismiss();
                                    }
                                })
                                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        dialog.cancel();
                                    }
                                });
                        AlertDialog dialog = builder.create();
                        dialog.show();
                    }
                }
                editor.commit();

                break;
            case R.id.fab5:
                if(isTouring) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    builder.setTitle("Tour Guide")
                            .setMessage("Do you want to stop the tour guide?")
                            .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    final ImageView iv = (ImageView)findViewById(R.id.bgImage);
                                    iv.clearAnimation();
                                    if(isTouring) {
                                        //showButton();
                                        Snackbar snack = Snackbar.make(iv, "Tour stopped..", Snackbar.LENGTH_SHORT);
                                        ViewGroup group = (ViewGroup) snack.getView();
                                        group.setAlpha(0.9f);
                                        group.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), android.R.color.holo_blue_light));
                                        snack.show();
                                        isTouring = false;
                                    }
                                    dialog.dismiss();
                                }
                            })
                            .setNegativeButton("No", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog dialog = builder.create();
                    dialog.show();
                }
                else {
                    AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    builder.setTitle("Tour Guide")
                            .setMessage("Do you want to activate this place's tour guide?")
                            .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    tourGuide();
                                    dialog.dismiss();
                                }
                            })
                            .setNegativeButton("No", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog dialog = builder.create();
                    dialog.show();
                }
                break;
        }
    }

    public void animateFAB() {
        if (isFabOpen) {
            fab.startAnimation(rotate_backward);
            fab1.startAnimation(fab_close);
            fab2.startAnimation(fab_close);
            fab3.startAnimation(fab_close);
            fab4.startAnimation(fab_close);
            fab5.startAnimation(fab_close);
            fab1.setClickable(false);
            fab2.setClickable(false);
            fab3.setClickable(false);
            fab4.setClickable(false);
            fab5.setClickable(false);
            isFabOpen = false;
        }
        else {
            fab.startAnimation(rotate_forward);
            fab1.startAnimation(fab_open1);
            fab2.startAnimation(fab_open2);
            fab3.startAnimation(fab_open3);
            fab4.startAnimation(fab_open4);
            fab5.startAnimation(fab_open5);
            fab1.setClickable(true);
            fab2.setClickable(true);
            fab3.setClickable(true);
            fab4.setClickable(true);
            fab5.setClickable(true);
            isFabOpen = true;

        }
    }

    protected void zoomToThis(View v, Class cls) {
        if(isFabOpen)
        {
            fab.callOnClick();
        }
        final ImageView iv = (ImageView)findViewById(R.id.bgImage);
        float scaleX = 3;
        float scaleY = 3;
        float pX = v.getX();
        float pY = v.getY();
        long duration = 3000;

        final Animation s = new ScaleAnimation(1,scaleX,1,scaleY,pX,pY);
        s.setFillAfter(true);
        s.setDuration(duration);
        s.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {}
            @Override
            public void onAnimationEnd(Animation animation) {}
            @Override
            public void onAnimationRepeat(Animation animation) {}
        });

        //fade the button
        Animation fade = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.fade);
        fade.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {}
            @Override
            public void onAnimationEnd(Animation animation) {
                Snackbar snack = Snackbar.make(iv, "Navigating...", Snackbar.LENGTH_SHORT);
                ViewGroup group = (ViewGroup) snack.getView();
                group.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), android.R.color.holo_blue_dark));
                snack.show();
                iv.startAnimation(s);
            }
            @Override
            public void onAnimationRepeat(Animation animation) {}
        });
        v.startAnimation(fade);

        for (ImageButton btn: mButtons) {
            if(btn!=v) {
                Animation f = AnimationUtils.loadAnimation(getApplicationContext(),
                        R.anim.fade);
                f.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {}
                    @Override
                    public void onAnimationEnd(Animation animation) {}
                    @Override
                    public void onAnimationRepeat(Animation animation) {}
                });
                btn.startAnimation(f);
            }
        };

        exitTransition(cls,2000);
    }

    protected void getAllImageButtons(ViewGroup v) {
        for (int i = 0; i < v.getChildCount(); i++) {
            View child = v.getChildAt(i);
            if(child instanceof ViewGroup)
                getAllImageButtons((ViewGroup) child);
            else if(child instanceof ImageButton)
                mButtons.add((ImageButton)child);
        }
    }

    protected void tourGuide() {
        isTouring = true;
        if(isFabOpen)
        {
            fab.callOnClick();
        }
        final ImageView iv = (ImageView)findViewById(R.id.bgImage);
        showTourDetail(iv,"Please wait, we'll guide you around..");
        long duration = 1000;
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setFillAfter(true);

        //fade the button + set tour animation
        for (final ImageButton btn: mButtons) {
            Animation f = AnimationUtils.loadAnimation(getApplicationContext(),
                    R.anim.fade);
            f.setFillAfter(true);
            f.setAnimationListener(new Animation.AnimationListener() {
                @Override
                public void onAnimationStart(Animation animation) {}
                @Override
                public void onAnimationEnd(Animation animation) {
                    btn.setClickable(false);
                }
                @Override
                public void onAnimationRepeat(Animation animation) {}
            });
            btn.startAnimation(f);

            float fromX = 1;
            float fromY = 1;
            float scaleX = 2.5f;
            float scaleY = 2.5f;
            float pX = btn.getX();
            float pY = btn.getY();
            long duration2 = 3000;

            Animation s = new ScaleAnimation(fromX,scaleX,fromY,scaleY,pX,pY);
            s.setFillAfter(true);
            s.setStartOffset(duration);
            s.setDuration(duration2);
            final int btnId = btn.getId();
            s.setAnimationListener(new Animation.AnimationListener() {
                @Override
                public void onAnimationStart(Animation animation) {}
                @Override
                public void onAnimationEnd(Animation animation) {
                    showTourDetail(iv,details.get(btnId));
                }
                @Override
                public void onAnimationRepeat(Animation animation) {}
            });

            duration += 5500;
            animationSet.addAnimation(s);

            Animation s2 = new ScaleAnimation(fromX,1/scaleX,fromY,1/scaleY,pX,pY);
            s2.setFillAfter(true);
            s2.setStartOffset(duration);
            s2.setDuration(duration2 - 1000);
            s2.setAnimationListener(new Animation.AnimationListener() {
                @Override
                public void onAnimationStart(Animation animation) {}
                @Override
                public void onAnimationEnd(Animation animation) {
                    activeSnackbar.dismiss();
                }
                @Override
                public void onAnimationRepeat(Animation animation) {}
            });
            duration += 2250;
            animationSet.addAnimation(s2);
        };

        //final long showBtnDuration = duration;
        animationSet.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                showButton();
                if (isTouring) {
                    Snackbar snack = Snackbar.make(iv, "Enjoy your view :)", Snackbar.LENGTH_LONG);
                    ViewGroup group = (ViewGroup) snack.getView();
                    group.setAlpha(0.9f);
                    group.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), android.R.color.holo_blue_light));
                    snack.show();
                }
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
            }
        });


        iv.startAnimation(animationSet);
    }

    protected void showButton()
    {
        //fade in
        for (final ImageButton btn: mButtons) {
            Animation f = AnimationUtils.loadAnimation(getApplicationContext(),
                    R.anim.fadein);
            //f.setStartOffset(duration);
            f.setAnimationListener(new Animation.AnimationListener() {
                @Override
                public void onAnimationStart(Animation animation) {}
                @Override
                public void onAnimationEnd(Animation animation) {
                    btn.setClickable(true);
                    isTouring = false;
                }
                @Override
                public void onAnimationRepeat(Animation animation) {}
            });
            btn.startAnimation(f);
        };
    }

    protected void showTourDetail(ImageView iv, String text) {
        Snackbar snack = Snackbar.make(iv, text, Snackbar.LENGTH_INDEFINITE);
        ViewGroup group = (ViewGroup) snack.getView();
        group.setAlpha(0.9f);
        group.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), android.R.color.holo_blue_light));
        /*View view = snack.getView();
        TextView tv = (TextView) view.findViewById(android.support.design.R.id.snackbar_text);
        tv.setTextColor(Color.rgb(100,255,200));*/
        snack.setCallback(new Snackbar.Callback() {
            @Override
            public void onDismissed(Snackbar snackbar, int event) {}
            @Override
            public void onShown(Snackbar snackbar) {
                activeSnackbar = snackbar;
            }
        });
        snack.show();
    }

    protected void enterTransition() {
        if(flagEnter) {
            final RelativeLayout ll = (RelativeLayout) findViewById(R.id.topLayout);

            Animation b = new AlphaAnimation(0, 1);
            b.setDuration(1100);
            b.setFillAfter(true);
            b.setAnimationListener(new Animation.AnimationListener() {
                @Override
                public void onAnimationStart(Animation animation) {}
                @Override
                public void onAnimationEnd(Animation animation) {
                    ll.setAlpha(1);
                }
                @Override
                public void onAnimationRepeat(Animation animation) {}
            });

            ll.startAnimation(b);
            flagEnter = false;
        }
    }

    protected void exitTransition(Class cls, long offsetDuration) {
        final Class c = cls;
        final RelativeLayout ll = (RelativeLayout) findViewById(R.id.topLayout);

        Animation b = new AlphaAnimation(1, 0);
        b.setDuration(1500);
        b.setFillAfter(true);
        b.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {}
            @Override
            public void onAnimationEnd(Animation animation) {
                ll.setAlpha(0);
                Intent i = new Intent(getApplicationContext(), c);
                startActivity(i);
                finish();
            }
            @Override
            public void onAnimationRepeat(Animation animation) {}
        });
        b.setStartOffset(offsetDuration);

        ll.startAnimation(b);
    }

}
