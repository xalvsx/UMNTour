package com.umn.mobile.umntour;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class Lantai3 extends TourActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void setUpActivity() {
        ImageView iv = (ImageView) findViewById(R.id.bgImage);
        if (isDay) { //jika pagi, gambarnya apa
            iv.setImageResource(R.drawable.lt_3);
        } else { //jika malam, gambarnya apa
            iv.setImageResource(R.drawable.lt3_night);
        }

        //isi detail dari ruangan ini, misal nama tempat ini = Contoh Tour
        setActivityDetail("3rd Floor", "Access to other floor and corridor");

        if(isDay){
            //code untuk bikin button programmatically
            ImageButton btnTolt2 = new ImageButton(this);
            btnTolt2.setBackgroundResource(R.drawable.arrow_right);
            RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            lp.addRule(RelativeLayout.ALIGN_PARENT_END);
            lp.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
            lp.setMarginEnd(getdp(156));
            lp.setMargins(0, 0, 0, getdp(75));
            btnTolt2.setLayoutParams(lp);
            layout.addView(btnTolt2);
            //details.put(btnToCorridorExample.getId(), "Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest");
            //komen diatas itu contoh batas panjang kata2nya
            btnTolt2.setId(View.generateViewId());
            details.put(btnTolt2.getId(), "This is the way to go down to 2nd Floor.");
            btnTolt2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    zoomToThis(v, Lantai2.class);
                }
            });
            //end code button programmatically

            //code untuk bikin button programmatically
            ImageButton btnToCorridorlt5 = new ImageButton(this);
            btnToCorridorlt5.setBackgroundResource(R.drawable.orange_arrow_right);
            RelativeLayout.LayoutParams lplt5 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            lplt5.addRule(RelativeLayout.ALIGN_PARENT_END);
            lplt5.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
            lplt5.setMarginEnd(getdp(20));
            lplt5.setMargins(0, 0, 0, getdp(56));
            btnToCorridorlt5.setLayoutParams(lplt5);
            layout.addView(btnToCorridorlt5);
            //details.put(btnToCorridorExample.getId(), "Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest");
            //komen diatas itu contoh batas panjang kata2nya
            btnToCorridorlt5.setId(View.generateViewId());
            details.put(btnToCorridorlt5.getId(), "Access to 5th floor");
            btnToCorridorlt5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    showOtherWayDetail("5th Floor", "Restricted area");
                }
            });
            //end code button programmatically

            //code untuk bikin button programmatically
            ImageButton btnToCorridorlt3kiri = new ImageButton(this);
            btnToCorridorlt3kiri.setBackgroundResource(R.drawable.arrow_left);
            RelativeLayout.LayoutParams lplt3kiri = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            lplt3kiri.addRule(RelativeLayout.ALIGN_PARENT_START);
            lplt3kiri.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
            lplt3kiri.setMargins(0, 0, 0, getdp(129));
            btnToCorridorlt3kiri.setLayoutParams(lplt3kiri);
            layout.addView(btnToCorridorlt3kiri);
            //details.put(btnToCorridorExample.getId(), "Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest");
            //komen diatas itu contoh batas panjang kata2nya
            btnToCorridorlt3kiri.setId(View.generateViewId());
            details.put(btnToCorridorlt3kiri.getId(), "This is the way to go to the left corridor.");
            btnToCorridorlt3kiri.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    zoomToThis(v, Corridor3left.class);
                }
            });
            //end code button programmatically

            //code untuk bikin button programmatically
            ImageButton btnToCorridorlt3kanan = new ImageButton(this);
            btnToCorridorlt3kanan.setBackgroundResource(R.drawable.arrow_right);
            RelativeLayout.LayoutParams lplt3kanan = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            lplt3kanan.addRule(RelativeLayout.ALIGN_PARENT_TOP);
            lplt3kanan.addRule(RelativeLayout.ALIGN_PARENT_END);
            lplt3kanan.setMarginEnd(getdp(137));
            lplt3kanan.setMargins(0, getdp(145), 0, 0);
            btnToCorridorlt3kanan.setLayoutParams(lplt3kanan);
            layout.addView(btnToCorridorlt3kanan);
            //details.put(btnToCorridorExample.getId(), "Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest");
            //komen diatas itu contoh batas panjang kata2nya
            btnToCorridorlt3kanan.setId(View.generateViewId());
            details.put(btnToCorridorlt3kanan.getId(), "This is the way to go to the right corridor.");
            btnToCorridorlt3kanan.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    zoomToThis(v, Corridor3Right.class);
                }
            });
            //end code button programmatically

            //code untuk bikin button programmatically
            ImageButton btnToCorridorToilet3 = new ImageButton(this);
            btnToCorridorToilet3.setBackgroundResource(R.drawable.arrow_up);
            RelativeLayout.LayoutParams lptoilet3 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            lptoilet3.addRule(RelativeLayout.ALIGN_PARENT_START);
            lptoilet3.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
            lptoilet3.setMarginStart(getdp(249));
            lptoilet3.setMargins(0, 0, 0, getdp(149));
            btnToCorridorToilet3.setLayoutParams(lptoilet3);
            layout.addView(btnToCorridorToilet3);
            //details.put(btnToCorridorExample.getId(), "Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest");
            //komen diatas itu contoh batas panjang kata2nya
            btnToCorridorToilet3.setId(View.generateViewId());
            details.put(btnToCorridorToilet3.getId(), "This is the way to go to the Toilet.");
            btnToCorridorToilet3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    zoomToThis(v, Toilet3.class);
                }
            });
            //end code button programmatically
        } else {
            //code untuk bikin button programmatically
            ImageButton btnTolt2 = new ImageButton(this);
            btnTolt2.setBackgroundResource(R.drawable.arrow_right);
            RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            lp.addRule(RelativeLayout.ALIGN_PARENT_END);
            lp.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
            lp.setMarginEnd(getdp(179));
            lp.setMargins(0, 0, 0, getdp(104));
            btnTolt2.setLayoutParams(lp);
            layout.addView(btnTolt2);
            //details.put(btnToCorridorExample.getId(), "Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest");
            //komen diatas itu contoh batas panjang kata2nya
            btnTolt2.setId(View.generateViewId());
            details.put(btnTolt2.getId(), "This is the way to go down to 2nd Floor.");
            btnTolt2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    zoomToThis(v, Lantai2.class);
                }
            });
            //end code button programmatically

            //code untuk bikin button programmatically
            ImageButton btnToCorridorlt5 = new ImageButton(this);
            btnToCorridorlt5.setBackgroundResource(R.drawable.orange_arrow_right);
            RelativeLayout.LayoutParams lplt5 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            lplt5.addRule(RelativeLayout.ALIGN_PARENT_END);
            lplt5.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
            lplt5.setMarginEnd(getdp(20));
            lplt5.setMargins(0, 0, 0, getdp(56));
            btnToCorridorlt5.setLayoutParams(lplt5);
            layout.addView(btnToCorridorlt5);
            //details.put(btnToCorridorExample.getId(), "Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest");
            //komen diatas itu contoh batas panjang kata2nya
            btnToCorridorlt5.setId(View.generateViewId());
            details.put(btnToCorridorlt5.getId(), "Access to 5th floor");
            btnToCorridorlt5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    showOtherWayDetail("5th Floor", "Restricted Area");
                }
            });
            //end code button programmatically

            //code untuk bikin button programmatically
            ImageButton btnToCorridorlt3kiri = new ImageButton(this);
            btnToCorridorlt3kiri.setBackgroundResource(R.drawable.arrow_left);
            RelativeLayout.LayoutParams lplt3kiri = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            lplt3kiri.addRule(RelativeLayout.ALIGN_PARENT_START);
            lplt3kiri.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
            lplt3kiri.setMargins(0, 0, 0, getdp(129));
            btnToCorridorlt3kiri.setLayoutParams(lplt3kiri);
            layout.addView(btnToCorridorlt3kiri);
            //details.put(btnToCorridorExample.getId(), "Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest");
            //komen diatas itu contoh batas panjang kata2nya
            btnToCorridorlt3kiri.setId(View.generateViewId());
            details.put(btnToCorridorlt3kiri.getId(), "This is the way to go to the left corridor.");
            btnToCorridorlt3kiri.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    zoomToThis(v, Corridor3left.class);
                }
            });
            //end code button programmatically

            //code untuk bikin button programmatically
            ImageButton btnToCorridorlt3kanan = new ImageButton(this);
            btnToCorridorlt3kanan.setBackgroundResource(R.drawable.arrow_right);
            RelativeLayout.LayoutParams lplt3kanan = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            lplt3kanan.addRule(RelativeLayout.ALIGN_PARENT_TOP);
            lplt3kanan.addRule(RelativeLayout.ALIGN_PARENT_END);
            lplt3kanan.setMarginEnd(getdp(172));
            lplt3kanan.setMargins(0, getdp(119), 0, 0);
            btnToCorridorlt3kanan.setLayoutParams(lplt3kanan);
            layout.addView(btnToCorridorlt3kanan);
            //details.put(btnToCorridorExample.getId(), "Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest");
            //komen diatas itu contoh batas panjang kata2nya
            btnToCorridorlt3kanan.setId(View.generateViewId());
            details.put(btnToCorridorlt3kanan.getId(), "This is the way to go to the right corridor.");
            btnToCorridorlt3kanan.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    zoomToThis(v, Corridor3Right.class);
                }
            });
            //end code button programmatically

            //code untuk bikin button programmatically
            ImageButton btnToCorridorToilet3 = new ImageButton(this);
            btnToCorridorToilet3.setBackgroundResource(R.drawable.arrow_up);
            RelativeLayout.LayoutParams lptoilet3 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            lptoilet3.addRule(RelativeLayout.ALIGN_PARENT_START);
            lptoilet3.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
            lptoilet3.setMarginStart(getdp(249));
            lptoilet3.setMargins(0, 0, 0, getdp(149));
            btnToCorridorToilet3.setLayoutParams(lptoilet3);
            layout.addView(btnToCorridorToilet3);
            //details.put(btnToCorridorExample.getId(), "Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest");
            //komen diatas itu contoh batas panjang kata2nya
            btnToCorridorToilet3.setId(View.generateViewId());
            details.put(btnToCorridorToilet3.getId(), "This is the way to go to the Toilet.");
            btnToCorridorToilet3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    zoomToThis(v, Toilet3.class);
                }
            });
        }
    }

}

