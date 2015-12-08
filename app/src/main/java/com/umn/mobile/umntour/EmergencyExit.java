package com.umn.mobile.umntour;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class EmergencyExit extends TourActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void setUpActivity() {
        ImageView iv = (ImageView) findViewById(R.id.bgImage);
        if (isDay) { //jika pagi, gambarnya apa
            iv.setImageResource(R.drawable.tangga_darurat);
        } else { //jika malam, gambarnya apa
            iv.setImageResource(R.drawable.tangga_darurat_night);
        }

        //isi detail dari ruangan ini, misal nama tempat ini = Contoh Tour
        setActivityDetail("Emergency Exit Corridor", "Corridor 3 Right 2 is a second right side of Building B Floor 3 Corridor.");

        //code untuk bikin button programmatically
        ImageButton btnToEmergency = new ImageButton(this);
        btnToEmergency.setBackgroundResource(R.drawable.arrow_up);
        RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        lp.addRule(RelativeLayout.ALIGN_PARENT_TOP);
        lp.addRule(RelativeLayout.CENTER_HORIZONTAL);
        lp.setMargins(0,getdp(110),0,0);
        btnToEmergency.setLayoutParams(lp);
        layout.addView(btnToEmergency);
        //details.put(btnToCorridorExample.getId(), "Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest");
        //komen diatas itu contoh batas panjang kata2nya
        btnToEmergency.setId(View.generateViewId());
        details.put(btnToEmergency.getId(), "This is the way to enter the Emergency Exit.");
        btnToEmergency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               zoomToThis(v, EmergencyExitDetail.class);
            }
        });
        //end code button programmatically

        //code untuk bikin button programmatically
        ImageButton btnToBack = new ImageButton(this);
        btnToBack.setBackgroundResource(R.drawable.arrow_left);
        RelativeLayout.LayoutParams lp2 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        lp2.addRule(RelativeLayout.ALIGN_PARENT_START);
        lp2.addRule(RelativeLayout.CENTER_VERTICAL);
        btnToBack.setLayoutParams(lp2);
        layout.addView(btnToBack);
        //details.put(btnToCorridorExample.getId(), "Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest");
        //komen diatas itu contoh batas panjang kata2nya
        btnToBack.setId(View.generateViewId());
        btnBack = btnToBack;
        btnToBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zoomOutFade(v, ServerBridge.class);
            }
        });
        //end code button programmatically
    }
}
