package com.umn.mobile.umntour;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class ServerBridge extends TourActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void setUpActivity() {
        ImageView iv = (ImageView) findViewById(R.id.bgImage);
        if (isDay) { //jika pagi, gambarnya apa
            iv.setImageResource(R.drawable.server_pintu_b);
        } else { //jika malam, gambarnya apa
            iv.setImageResource(R.drawable.server_pintu_b_night);
        }

        //isi detail dari ruangan ini, misal nama tempat ini = Contoh Tour
        setActivityDetail("Corridor 3 Right 2", "Corridor 3 Right 2 is a second right side of Building B Floor 3 Corridor.");

        //code untuk bikin button programmatically
        ImageButton btnToServer = new ImageButton(this);
        btnToServer.setBackgroundResource(R.drawable.arrow_left);
        RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        lp.addRule(RelativeLayout.ALIGN_PARENT_START);
        lp.addRule(RelativeLayout.CENTER_VERTICAL);
        lp.setMarginStart(getdp(133));
        btnToServer.setLayoutParams(lp);
        layout.addView(btnToServer);
        //details.put(btnToCorridorExample.getId(), "Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest");
        //komen diatas itu contoh batas panjang kata2nya
        btnToServer.setId(View.generateViewId());
        details.put(btnToServer.getId(), "UMN IT infrastructure room");
        btnToServer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showOtherWayDetail("Server Room","Restricted area");
            }
        });
        //end code button programmatically

        //code untuk bikin button programmatically
        ImageButton btnToBackCorridor3kanan3 = new ImageButton(this);
        btnToBackCorridor3kanan3.setBackgroundResource(R.drawable.arrow_down);
        RelativeLayout.LayoutParams lp2 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        lp2.addRule(RelativeLayout.ALIGN_PARENT_END);
        lp2.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
        lp2.setMarginEnd(getdp(178));
        btnToBackCorridor3kanan3.setLayoutParams(lp2);
        layout.addView(btnToBackCorridor3kanan3);
        //details.put(btnToCorridorExample.getId(), "Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest");
        //komen diatas itu contoh batas panjang kata2nya
        btnToBackCorridor3kanan3.setId(View.generateViewId());
        btnBack = btnToBackCorridor3kanan3;
        btnToBackCorridor3kanan3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zoomOutFade(v, Corridor3Right3.class);
            }
        });
        //end code button programmatically

        //code untuk bikin button programmatically
        ImageButton btnToEmergencyExit = new ImageButton(this);
        btnToEmergencyExit.setBackgroundResource(R.drawable.arrow_left);
        RelativeLayout.LayoutParams lp3 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        lp3.addRule(RelativeLayout.ALIGN_PARENT_END);
        lp3.addRule(RelativeLayout.CENTER_VERTICAL);
        lp3.setMarginEnd(getdp(160));
        btnToEmergencyExit.setLayoutParams(lp3);
        layout.addView(btnToEmergencyExit);
        //details.put(btnToCorridorExample.getId(), "Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest");
        //komen diatas itu contoh batas panjang kata2nya
        btnToEmergencyExit.setId(View.generateViewId());
        details.put(btnToEmergencyExit.getId(), "This is the way to go to the emergency Exit corridor");
        btnToEmergencyExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zoomToThis(v, EmergencyExit.class);
            }
        });
        //end code button programmatically

        ImageButton btnToBridge = new ImageButton(this);
        btnToBridge.setBackgroundResource(R.drawable.arrow_up);
        RelativeLayout.LayoutParams lp4 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        lp4.addRule(RelativeLayout.ALIGN_PARENT_END);
        lp4.addRule(RelativeLayout.ALIGN_PARENT_TOP);
        lp4.setMarginEnd(getdp(43));
        lp4.setMargins(0,getdp(109),0,0);
        btnToBridge.setLayoutParams(lp4);
        layout.addView(btnToBridge);
        btnToBridge.setId(View.generateViewId());
        details.put(btnToBridge.getId(), "This is the way to connecting bridge to A building");
        btnToBridge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zoomToThis(v, Bridge.class);
            }
        });
    }
}
