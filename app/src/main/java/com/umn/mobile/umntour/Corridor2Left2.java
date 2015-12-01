package com.umn.mobile.umntour;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class Corridor2Left2 extends TourActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void setUpActivity() {
        ImageView iv = (ImageView)findViewById(R.id.bgImage);
        if(isDay) { //jika pagi, gambarnya apa
            iv.setImageResource(R.drawable.selasar2_kiri2);
        }
        else { //jika malam, gambarnya apa
            iv.setImageResource(R.drawable.selasar2_kiri2_night);
        }

        //isi detail dari ruangan ini, misal nama tempat ini = Contoh Tour
        setActivityDetail("Room Example", "Room Example is a room that basically used by student to do many activities like meeting, UKM, etc.");

        //code untuk bikin button programmatically
        ImageButton btnToCorridor2Left1 = new ImageButton(this);
        btnToCorridor2Left1.setBackgroundResource(R.drawable.arrow_down);
        RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        lp.addRule(RelativeLayout.CENTER_HORIZONTAL);
        lp.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
        btnToCorridor2Left1.setLayoutParams(lp);
        layout.addView(btnToCorridor2Left1);
        //details.put(btnToCorridorExample.getId(), "Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest");
        //komen diatas itu contoh batas panjang kata2nya
        btnToCorridor2Left1.setId(View.generateViewId());
        btnBack = btnToCorridor2Left1;
        btnToCorridor2Left1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zoomOutFade(v, Corridor2Left1.class);
            }
        });
        //end code button programmatically

        if(!isDay) {
            //code untuk bikin button programmatically
            ImageButton btnToB201 = new ImageButton(this);
            btnToB201.setBackgroundResource(R.drawable.arrow_right);
            RelativeLayout.LayoutParams lp2 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            lp2.addRule(RelativeLayout.CENTER_VERTICAL);
            lp2.addRule(RelativeLayout.ALIGN_PARENT_END);
            lp2.setMarginEnd(getdp(123));
            btnToB201.setLayoutParams(lp2);
            layout.addView(btnToB201);
            //details.put(btnToCorridorExample.getId(), "Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest");
            //komen diatas itu contoh batas panjang kata2nya
            btnToB201.setId(View.generateViewId());
            details.put(btnToB201.getId(), "This is the way to go to the Room B201.");
            btnToB201.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    zoomToThis(v, RoomB201.class);
                }
            });
            //end code button programmatically

            //code untuk bikin button programmatically
            ImageButton btnToB202 = new ImageButton(this);
            btnToB202.setBackgroundResource(R.drawable.arrow_left);
            RelativeLayout.LayoutParams lp3 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            lp3.addRule(RelativeLayout.CENTER_VERTICAL);
            lp3.addRule(RelativeLayout.ALIGN_PARENT_START);
            lp3.setMarginStart(getdp(82));
            btnToB202.setLayoutParams(lp3);
            layout.addView(btnToB202);
            //details.put(btnToCorridorExample.getId(), "Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest");
            //komen diatas itu contoh batas panjang kata2nya
            btnToB202.setId(View.generateViewId());
            details.put(btnToB202.getId(), "This is the way to go to the Room B202.");
            btnToB202.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    zoomToThis(v, RoomB202.class);
                }
            });
            //end code button programmatically
        }
    }
}
