package com.umn.mobile.umntour;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class Toilet3 extends TourActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void setUpActivity() {
        ImageView iv = (ImageView) findViewById(R.id.bgImage);
        if (isDay) { //jika pagi, gambarnya apa
            iv.setImageResource(R.drawable.toilet_lt3);
        } else { //jika malam, gambarnya apa
            iv.setImageResource(R.drawable.toilet_lt3_night);
        }

        //isi detail dari ruangan ini, misal nama tempat ini = Contoh Tour
        setActivityDetail("Room Example", "Room Example is a room that basically used by student to do many activities like meeting, UKM, etc.");

        //code untuk bikin button programmatically
        ImageButton btnToCorridorBack3 = new ImageButton(this);
        btnToCorridorBack3.setBackgroundResource(R.drawable.arrow_left);
        RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        lp.addRule(RelativeLayout.ALIGN_PARENT_START);
        lp.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
        lp.setMarginStart(getdp(26));
        lp.setMargins(0, 0, 0, getdp(25));
        btnToCorridorBack3.setLayoutParams(lp);
        layout.addView(btnToCorridorBack3);
        //details.put(btnToCorridorExample.getId(), "Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest");
        //komen diatas itu contoh batas panjang kata2nya
        btnToCorridorBack3.setId(View.generateViewId());
        btnBack = btnToCorridorBack3;
        btnToCorridorBack3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zoomOutFade(v, Lantai3.class);
            }
        });
        //end code button programmatically
    }
}