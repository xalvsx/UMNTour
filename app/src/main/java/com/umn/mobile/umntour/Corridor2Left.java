package com.umn.mobile.umntour;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class Corridor2Left extends TourActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void setUpActivity() {
        ImageView iv = (ImageView)findViewById(R.id.bgImage);
        if(isDay) { //jika pagi, gambarnya apa
            iv.setImageResource(R.drawable.selasar2_kiri);
        }
        else { //jika malam, gambarnya apa
            iv.setImageResource(R.drawable.selasar2_kiri_night);
        }

        //isi detail dari ruangan ini, misal nama tempat ini = Contoh Tour
        setActivityDetail("","Room Example is a room that basically used by student to do many activities like meeting, UKM, etc.");

        if(isDay) { //jika pagi, buttonnya apa
            //code untuk bikin button programmatically
            ImageButton btnToCorridorKiri1 = new ImageButton(this);
            btnToCorridorKiri1.setBackgroundResource(R.drawable.arrow_up);
            RelativeLayout.LayoutParams lp1 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            lp1.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
            lp1.addRule(RelativeLayout.CENTER_HORIZONTAL);
            lp1.setMargins(0, 0, 0, getdp(111));
            btnToCorridorKiri1.setLayoutParams(lp1);
            layout.addView(btnToCorridorKiri1);
            //details.put(btnToCorridorExample.getId(), "Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest");
            //komen diatas itu contoh batas panjang kata2nya
            btnToCorridorKiri1.setId(View.generateViewId());
            details.put(btnToCorridorKiri1.getId(), "Menuju Koridor Lantai 2");
            btnToCorridorKiri1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    zoomToThis(v, Corridor2Left1.class);
                }
            });
            //end code button programmatically

            //code untuk bikin button programmatically
            ImageButton btnToCorridorBack = new ImageButton(this);
            btnToCorridorBack.setBackgroundResource(R.drawable.arrow_down);
            RelativeLayout.LayoutParams lp3 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            lp3.addRule(RelativeLayout.CENTER_HORIZONTAL);
            lp3.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
            btnToCorridorBack.setLayoutParams(lp3);
            layout.addView(btnToCorridorBack);
            //details.put(btnToCorridorExample.getId(), "Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest");
            //komen diatas itu contoh batas panjang kata2nya
            btnToCorridorBack.setId(View.generateViewId());
            btnBack = btnToCorridorBack;
            btnToCorridorBack.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    zoomOutFade(v, Lantai2.class);
                }
            });
            //end code button programmatically


        }
        else { //jika malam, buttonnya apa
            //code untuk bikin button programmatically
            ImageButton btnToCorridorKiri2 = new ImageButton(this);
            btnToCorridorKiri2.setBackgroundResource(R.drawable.arrow_up);
            RelativeLayout.LayoutParams lp2 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            lp2.addRule(RelativeLayout.CENTER_HORIZONTAL);
            lp2.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
            lp2.setMargins(0,0,0, getdp(124));
            btnToCorridorKiri2.setLayoutParams(lp2);
            layout.addView(btnToCorridorKiri2);
            //details.put(btnToCorridorExample.getId(), "Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest");
            //komen diatas itu contoh batas panjang kata2nya
            btnToCorridorKiri2.setId(View.generateViewId());
            details.put(btnToCorridorKiri2.getId(), "Go to Corridor");
            btnToCorridorKiri2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    zoomToThis(v, Corridor2Left1.class);
                }
            });
            //end code button programmatically

            //code untuk bikin button programmatically
            ImageButton btnToCorridorBackNight = new ImageButton(this);
            btnToCorridorBackNight.setBackgroundResource(R.drawable.arrow_down);
            RelativeLayout.LayoutParams lp4 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            lp4.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
            lp4.addRule(RelativeLayout.CENTER_HORIZONTAL);
            btnToCorridorBackNight.setLayoutParams(lp4);
            layout.addView(btnToCorridorBackNight);
            //details.put(btnToCorridorExample.getId(), "Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest");
            //komen diatas itu contoh batas panjang kata2nya
            btnToCorridorBackNight.setId(View.generateViewId());
            btnBack = btnToCorridorBackNight;
            btnToCorridorBackNight.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    zoomOutFade(v, Lantai2.class);
                }
            });
            //end code button programmatically
        }
    }
}
