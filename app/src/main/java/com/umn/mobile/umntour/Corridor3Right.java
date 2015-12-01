package com.umn.mobile.umntour;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class Corridor3Right extends TourActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void setUpActivity() {
        ImageView iv = (ImageView)findViewById(R.id.bgImage);
        if(isDay) { //jika pagi, gambarnya apa
            iv.setImageResource(R.drawable.selasar3_kanan);
        }
        else { //jika malam, gambarnya apa
            iv.setImageResource(R.drawable.selasar3_kanan_night);
        }

        //isi detail dari ruangan ini, misal nama tempat ini = Contoh Tour
        setActivityDetail("Corridor 3 Right", "Corridor 3 Right is a right side of Building B Floor 3 Corridor.");


        if(isDay) {
            //code untuk bikin button programmatically
            ImageButton btnToB311 = new ImageButton(this);
            btnToB311.setBackgroundResource(R.drawable.arrow_left);
            RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            lp.addRule(RelativeLayout.ALIGN_PARENT_START);
            lp.addRule(RelativeLayout.ALIGN_PARENT_TOP);
            lp.setMarginStart(getdp(250));
            lp.setMargins(0, getdp(130), 0, 0);
            btnToB311.setLayoutParams(lp);
            layout.addView(btnToB311);
            btnToB311.setId(View.generateViewId());
            details.put(btnToB311.getId(), "This is the B311 Classroom.");
            btnToB311.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    zoomToThis(v, RoomB311.class);
                }
            });
            //end code button programmatically
        }

        ImageButton btnToCorridor3Right1 = new ImageButton(this);
        btnToCorridor3Right1.setBackgroundResource(R.drawable.arrow_up);
        RelativeLayout.LayoutParams lp2 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        lp2.addRule(RelativeLayout.ALIGN_PARENT_END);
        lp2.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
        lp2.setMarginEnd(getdp(257));
        lp2.setMargins(0, 0, 0, getdp(146));
        btnToCorridor3Right1.setLayoutParams(lp2);
        layout.addView(btnToCorridor3Right1);
        btnToCorridor3Right1.setId(View.generateViewId());
        details.put(btnToCorridor3Right1.getId(), "This is the way to the Corridor 3 Right 1.");
        btnToCorridor3Right1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zoomToThis(v, Corridor3Right1.class);
            }
        });
        //end code button programmatically

        ImageButton btnToEmergencyExit = new ImageButton(this);
        btnToEmergencyExit.setBackgroundResource(R.drawable.orange_arrow_left);
        RelativeLayout.LayoutParams lp3 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        lp3.addRule(RelativeLayout.ALIGN_PARENT_START);
        lp3.addRule(RelativeLayout.CENTER_VERTICAL);
        lp3.setMarginStart(getdp(154));
        btnToEmergencyExit.setLayoutParams(lp3);
        layout.addView(btnToEmergencyExit);
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
        ImageButton btnToLantai3 = new ImageButton(this);
        btnToLantai3.setBackgroundResource(R.drawable.arrow_down);
        RelativeLayout.LayoutParams lp1 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        lp1.addRule(RelativeLayout.CENTER_HORIZONTAL);
        lp1.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
        btnToLantai3.setLayoutParams(lp1);
        layout.addView(btnToLantai3);
        btnToLantai3.setId(View.generateViewId());
        details.put(btnToLantai3.getId(), "This is the way to go to the Floor 3.");
        btnToLantai3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zoomToThis(v, Lantai3.class);
            }
        });
        //end code button programmatically
    }
}
