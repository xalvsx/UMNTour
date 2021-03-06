package com.umn.mobile.umntour;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class Bridge extends TourActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void setUpActivity() {
        ImageView iv = (ImageView) findViewById(R.id.bgImage);
        if (isDay) { //jika pagi, gambarnya apa
            iv.setImageResource(R.drawable.b_ke_a);
        } else { //jika malam, gambarnya apa
            iv.setImageResource(R.drawable.b_ke_a_night);
        }

        setActivityDetail("Bridge to A Building", "A shortcut path to the A Bulding.");

        ImageButton btnToBack = new ImageButton(this);
        btnToBack.setBackgroundResource(R.drawable.arrow_down);
        RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        lp.addRule(RelativeLayout.CENTER_HORIZONTAL);
        lp.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
        btnToBack.setLayoutParams(lp);
        layout.addView(btnToBack);
        btnToBack.setId(View.generateViewId());
        btnBack = btnToBack;
        btnToBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zoomOutFade(v, ServerBridge.class);
            }
        });

        ImageButton btnToA = new ImageButton(this);
        btnToA.setBackgroundResource(R.drawable.orange_arrow_up);
        RelativeLayout.LayoutParams lp4 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        lp4.addRule(RelativeLayout.CENTER_VERTICAL);
        lp4.addRule(RelativeLayout.ALIGN_PARENT_END);
        lp4.setMarginEnd(getdp(205));
        btnToA.setLayoutParams(lp4);
        layout.addView(btnToA);
        btnToA.setId(View.generateViewId());
        details.put(btnToA.getId(), "This is the way to the 3rd floor of A Building.");
        btnToA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showOtherWayDetail("To A Building","Restricted area");
            }
        });
    }
}
