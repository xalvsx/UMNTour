package com.umn.mobile.umntour;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class Corridor2Right extends TourActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void setUpActivity() {
        ImageView iv = (ImageView)findViewById(R.id.bgImage);
        if(isDay) { //jika pagi, gambarnya apa
            iv.setImageResource(R.drawable.selasar2_kanan);
        }
        else { //jika malam, gambarnya apa
            iv.setImageResource(R.drawable.selasar2_kanan_night);
        }

        //isi detail dari ruangan ini, misal nama tempat ini = Contoh Tour
        setActivityDetail("2nd Floor Right Corridor", "This is the way to go to Mushola, Toilet and Balcony.");

        //code untuk bikin button programmatically
        ImageButton btnToEmergencyExit = new ImageButton(this);
        btnToEmergencyExit.setBackgroundResource(R.drawable.orange_arrow_left);
        RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        lp.addRule(RelativeLayout.ALIGN_PARENT_END);
        lp.addRule(RelativeLayout.CENTER_VERTICAL);
        lp.setMarginEnd(getdp(205));
        btnToEmergencyExit.setLayoutParams(lp);
        layout.addView(btnToEmergencyExit);
        //details.put(btnToCorridorExample.getId(), "Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest");
        //komen diatas itu contoh batas panjang kata2nya
        btnToEmergencyExit.setId(View.generateViewId());
        details.put(btnToEmergencyExit.getId(), "This is the way to the Emergency Exit.");
        btnToEmergencyExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showOtherWayDetail("The Emergency Exit","This is the way to the Emergency Exit.");
            }
        });
        //end code button programmatically

        //code untuk bikin button programmatically
        ImageButton btnToMushola = new ImageButton(this);
        btnToMushola.setBackgroundResource(R.drawable.arrow_left);
        RelativeLayout.LayoutParams lp2 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        lp2.addRule(RelativeLayout.ALIGN_PARENT_END);
        lp2.addRule(RelativeLayout.CENTER_VERTICAL);
        lp2.setMarginEnd(getdp(151));
        btnToMushola.setLayoutParams(lp2);
        layout.addView(btnToMushola);
        //details.put(btnToCorridorExample.getId(), "Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest");
        //komen diatas itu contoh batas panjang kata2nya
        btnToMushola.setId(View.generateViewId());
        details.put(btnToMushola.getId(), "This is the way to the Mushola.");
        btnToMushola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zoomToThis(v, Mushola.class);
            }
        });
        //end code button programmatically

        //code untuk bikin button programmatically
        ImageButton btnToToilet2 = new ImageButton(this);
        btnToToilet2.setBackgroundResource(R.drawable.arrow_up);
        RelativeLayout.LayoutParams lp3 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        lp3.addRule(RelativeLayout.ALIGN_PARENT_START);
        lp3.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
        lp3.setMarginStart(getdp(134));
        lp3.setMargins(0, 0, 0, getdp(79));
        btnToToilet2.setLayoutParams(lp3);
        layout.addView(btnToToilet2);
        //details.put(btnToCorridorExample.getId(), "Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest");
        //komen diatas itu contoh batas panjang kata2nya
        btnToToilet2.setId(View.generateViewId());
        details.put(btnToToilet2.getId(), "This is the way to the Toilet.");
        btnToToilet2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zoomToThis(v, Toilet2.class);
            }
        });
        //end code button programmatically

        //code untuk bikin button programmatically
        ImageButton btnToBalcony = new ImageButton(this);
        btnToBalcony.setBackgroundResource(R.drawable.arrow_up);
        RelativeLayout.LayoutParams lp4 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        lp4.addRule(RelativeLayout.ALIGN_PARENT_END);
        lp4.addRule(RelativeLayout.CENTER_VERTICAL);
        lp4.setMarginEnd(getdp(62));
        btnToBalcony.setLayoutParams(lp4);
        layout.addView(btnToBalcony);
        //details.put(btnToCorridorExample.getId(), "Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest");
        //komen diatas itu contoh batas panjang kata2nya
        btnToBalcony.setId(View.generateViewId());
        details.put(btnToBalcony.getId(), "This is the way to go to the Balcony.");
        btnToBalcony.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zoomToThis(v, Balcony.class);
            }
        });
        //end code button programmatically

        //code untuk bikin button programmatically
        ImageButton btnToLantai2 = new ImageButton(this);
        btnToLantai2.setBackgroundResource(R.drawable.arrow_down);
        RelativeLayout.LayoutParams lp5 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        lp5.addRule(RelativeLayout.CENTER_HORIZONTAL);
        lp5.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
        btnToLantai2.setLayoutParams(lp5);
        layout.addView(btnToLantai2);
        //details.put(btnToCorridorExample.getId(), "Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest");
        //komen diatas itu contoh batas panjang kata2nya
        btnToLantai2.setId(View.generateViewId());
        btnBack = btnToLantai2;
        //details.put(btnToCorridor3Right.getId(), "This is the way to go to the Corridor 3 Right.");
        btnToLantai2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zoomOutFade(v, Lantai2.class);
            }
        });
        //end code button programmatically


    }
}
