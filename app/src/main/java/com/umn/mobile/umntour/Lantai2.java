package com.umn.mobile.umntour;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class Lantai2 extends TourActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void setUpActivity() {
        ImageView iv = (ImageView)findViewById(R.id.bgImage);
        if(isDay) { //jika pagi, gambarnya apa
            iv.setImageResource(R.drawable.lt_2);
        }
        else { //jika malam, gambarnya apa
            iv.setImageResource(R.drawable.lt2_night);
        }

        //isi detail dari ruangan ini, misal nama tempat ini = Contoh Tour
        setActivityDetail("","Room Example is a room that basically used by student to do many activities like meeting, UKM, etc.");


        //code untuk bikin button programmatically
        ImageButton btnToLobby = new ImageButton(this);
        btnToLobby.setBackgroundResource(R.drawable.orange_arrow_right);
        RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        lp.addRule(RelativeLayout.ALIGN_PARENT_END);
        lp.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
        lp.setMarginEnd(getdp(152));
        lp.setMargins(0, 0, 0, getdp(109));
        btnToLobby.setLayoutParams(lp);
        layout.addView(btnToLobby);
        //details.put(btnToCorridorExample.getId(), "Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest");
        //komen diatas itu contoh batas panjang kata2nya
        btnToLobby.setId(View.generateViewId());
        details.put(btnToLobby.getId(), "This is the way to go to the Corridor Example. Corridor Example links many other rooms.");
        btnToLobby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showOtherWayDetail("Lobby", "Menuju ke Lobby gedung B");
            }
        });
        //end code button programmatically

        //code untuk bikin button programmatically
        ImageButton btnToThrid = new ImageButton(this);
        btnToThrid.setBackgroundResource(R.drawable.arrow_right);
        RelativeLayout.LayoutParams lp2 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        lp2.addRule(RelativeLayout.ALIGN_PARENT_END);
        lp2.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
        lp2.setMarginEnd(getdp(38));
        lp2.setMargins(0, 0, 0, getdp(97));
        btnToThrid.setLayoutParams(lp2);
        layout.addView(btnToThrid);
        //details.put(btnToCorridorExample.getId(), "Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest");
        //komen diatas itu contoh batas panjang kata2nya
        btnToThrid.setId(View.generateViewId());
        details.put(btnToThrid.getId(), "Tombol ini mengarah menuju lantai 3");
        btnToThrid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zoomToThis(v, Lantai2.class);
            }
        });
        //end code button programmatically


        //code untuk bikin button programmatically
        ImageButton btnToBalcony = new ImageButton(this);
        btnToBalcony.setBackgroundResource(R.drawable.arrow_right);
        RelativeLayout.LayoutParams lp3 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        lp3.addRule(RelativeLayout.ALIGN_PARENT_START);
        lp3.addRule(RelativeLayout.CENTER_VERTICAL);
        lp3.setMarginStart(getdp(198));
        btnToBalcony.setLayoutParams(lp3);
        layout.addView(btnToBalcony);
        //details.put(btnToCorridorExample.getId(), "Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest");
        //komen diatas itu contoh batas panjang kata2nya
        btnToBalcony.setId(View.generateViewId());
        details.put(btnToBalcony.getId(), "Tombol ini mengarah menuju balkon lantai 2, pengungjung dapat melihat lobby gedung B");
        btnToBalcony.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zoomToThis(v, Lantai2.class);
            }
        });
        //end code button programmatically

        //code untuk bikin button programmatically
        ImageButton BtnToCorridor = new ImageButton(this);
        BtnToCorridor.setBackgroundResource(R.drawable.arrow_left);
        RelativeLayout.LayoutParams lp4 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        lp4.addRule(RelativeLayout.CENTER_VERTICAL);
        lp4.addRule(RelativeLayout.ALIGN_PARENT_START);
        BtnToCorridor.setLayoutParams(lp4);
        layout.addView(BtnToCorridor);
        //details.put(btnToCorridorExample.getId(), "Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest");
        //komen diatas itu contoh batas panjang kata2nya
        BtnToCorridor.setId(View.generateViewId());
        details.put(BtnToCorridor.getId(), "Tombol ini mengarah menuju koridor lantai 2");
        BtnToCorridor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zoomToThis(v, Corridor2Left.class);
            }
        });
        //end code button programmatically
    }
}
