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

        //isi detail dari ruangan ini, misal nama tempat ini = Contoh Tour
        setActivityDetail("Corridor 3 Right 2", "Corridor 3 Right 2 is a second right side of Building B Floor 3 Corridor.");

        ImageButton btnToBack = new ImageButton(this);
        btnToBack.setBackgroundResource(R.drawable.arrow_left);
        RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        lp.addRule(RelativeLayout.CENTER_VERTICAL);
        lp.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
        btnToBack.setLayoutParams(lp);
        layout.addView(btnToBack);
        btnToBack.setId(View.generateViewId());
        details.put(btnToBack.getId(), "This is the way to the Room B315.");
        btnToBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zoomToThis(v, ServerBridge.class);
            }
        });

        ImageButton btnToA = new ImageButton(this);
        btnToA.setBackgroundResource(R.drawable.orange_arrow_left);
        RelativeLayout.LayoutParams lp4 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        lp4.addRule(RelativeLayout.CENTER_HORIZONTAL);
        lp4.addRule(RelativeLayout.ALIGN_PARENT_TOP);
        lp4.setMargins(0,getdp(123),0,0);
        btnToA.setLayoutParams(lp4);
        layout.addView(btnToA);
        btnToA.setId(View.generateViewId());
        details.put(btnToA.getId(), "This is the way to the Room B315.");
        btnToA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showOtherWayDetail("gk boleh","gk boleh");
            }
        });
    }
}
