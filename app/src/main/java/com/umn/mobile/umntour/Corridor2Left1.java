package com.umn.mobile.umntour;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class Corridor2Left1 extends TourActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void setUpActivity() {
        ImageView iv = (ImageView)findViewById(R.id.bgImage);
        if(isDay) { //jika pagi, gambarnya apa
            iv.setImageResource(R.drawable.selasar2_kiri1);
        }
        else { //jika malam, gambarnya apa
            iv.setImageResource(R.drawable.selasar2_kiri1_night);
        }

        //isi detail dari ruangan ini, misal nama tempat ini = Contoh Tour
        setActivityDetail("Room Example", "Room Example is a room that basically used by student to do many activities like meeting, UKM, etc.");

        //code untuk bikin button programmatically
        ImageButton btnToCorridor2Left = new ImageButton(this);
        btnToCorridor2Left.setBackgroundResource(R.drawable.arrow_down);
        RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        lp.addRule(RelativeLayout.CENTER_HORIZONTAL);
        lp.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
        btnToCorridor2Left.setLayoutParams(lp);
        layout.addView(btnToCorridor2Left);
        //details.put(btnToCorridorExample.getId(), "Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest");
        //komen diatas itu contoh batas panjang kata2nya
        btnToCorridor2Left.setId(View.generateViewId());
        btnBack = btnToCorridor2Left;
        btnToCorridor2Left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zoomOutFade(v, Corridor2Left.class);
            }
        });
        //end code button programmatically

        //code untuk bikin button programmatically
        ImageButton btnToB205 = new ImageButton(this);
        btnToB205.setBackgroundResource(R.drawable.arrow_right);
        RelativeLayout.LayoutParams lp2 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        lp2.addRule(RelativeLayout.CENTER_VERTICAL);
        lp2.addRule(RelativeLayout.ALIGN_PARENT_END);
        btnToB205.setLayoutParams(lp2);
        layout.addView(btnToB205);
        //details.put(btnToCorridorExample.getId(), "Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest");
        //komen diatas itu contoh batas panjang kata2nya
        btnToB205.setId(View.generateViewId());
        details.put(btnToB205.getId(), "This is the way to go to the Room B205.");
        btnToB205.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zoomToThis(v, RoomB205.class);
            }
        });
        //end code button programmatically

        if(isDay) {
            //code untuk bikin button programmatically
            ImageButton btnToB204 = new ImageButton(this);
            btnToB204.setBackgroundResource(R.drawable.arrow_left);
            RelativeLayout.LayoutParams lp3 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            lp3.addRule(RelativeLayout.CENTER_VERTICAL);
            lp3.addRule(RelativeLayout.ALIGN_PARENT_START);
            lp3.setMarginStart(getdp(192));
            btnToB204.setLayoutParams(lp3);
            layout.addView(btnToB204);
            //details.put(btnToCorridorExample.getId(), "Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest");
            //komen diatas itu contoh batas panjang kata2nya
            btnToB204.setId(View.generateViewId());
            details.put(btnToB204.getId(), "This is the way to go to the Room B204.");
            btnToB204.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    zoomToThis(v, RoomB204.class);
                }
            });
            //end code button programmatically
        }
        else {
            //code untuk bikin button programmatically
            ImageButton btnToB203 = new ImageButton(this);
            btnToB203.setBackgroundResource(R.drawable.arrow_right);
            RelativeLayout.LayoutParams lp3 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            lp3.addRule(RelativeLayout.CENTER_VERTICAL);
            lp3.addRule(RelativeLayout.ALIGN_PARENT_END);
            lp3.setMarginEnd(getdp(203));
            btnToB203.setLayoutParams(lp3);
            layout.addView(btnToB203);
            //details.put(btnToCorridorExample.getId(), "Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest");
            //komen diatas itu contoh batas panjang kata2nya
            btnToB203.setId(View.generateViewId());
            details.put(btnToB203.getId(), "This is the way to go to the Room B203.");
            btnToB203.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    zoomToThis(v, RoomB203.class);
                }
            });
            //end code button programmatically
        }

        //code untuk bikin button programmatically
        ImageButton btnToCorridor2Left2 = new ImageButton(this);
        btnToCorridor2Left2.setBackgroundResource(R.drawable.arrow_up);
        RelativeLayout.LayoutParams lp4 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        lp4.addRule(RelativeLayout.CENTER_HORIZONTAL);
        lp4.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
        lp4.setMargins(0, 0, 0, getdp(128));
        btnToCorridor2Left2.setLayoutParams(lp4);
        layout.addView(btnToCorridor2Left2);
        //details.put(btnToCorridorExample.getId(), "Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest");
        //komen diatas itu contoh batas panjang kata2nya
        btnToCorridor2Left2.setId(View.generateViewId());
        details.put(btnToCorridor2Left2.getId(), "This is the way to go to the Corridor 2 Left 2.");
        btnToCorridor2Left2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zoomToThis(v, Corridor2Left2.class);
            }
        });
        //end code button programmatically

    }
}
