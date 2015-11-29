package com.umn.mobile.umntour;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class RoomExample extends TourActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void setUpActivity() {
        ImageView iv = (ImageView)findViewById(R.id.bgImage);
        if(isDay) { //jika pagi, gambarnya apa
            iv.setImageResource(R.drawable.wallpaper);
        }
        else { //jika malam, gambarnya apa
            iv.setImageResource(R.drawable.wallpaper_night);
        }

        //isi detail dari ruangan ini, misal nama tempat ini = Contoh Tour
        setActivityDetail("Room Example","Room Example is a room that basically used by student to do many activities like meeting, UKM, etc.");



        //code untuk bikin button programmatically
        ImageButton btnToCorridorExample = new ImageButton(this);
        btnToCorridorExample.setBackgroundResource(android.R.drawable.ic_dialog_map);
        RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        lp.addRule(RelativeLayout.ALIGN_PARENT_START);
        lp.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
        lp.setMarginStart(getdp(100));
        lp.setMargins(0, 0, 0, getdp(100));
        btnToCorridorExample.setLayoutParams(lp);
        layout.addView(btnToCorridorExample);
        //details.put(btnToCorridorExample.getId(), "Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest");
        //komen diatas itu contoh batas panjang kata2nya
        btnToCorridorExample.setId(View.generateViewId());
        details.put(btnToCorridorExample.getId(), "This is the way to go to the Corridor Example. Corridor Example links many other rooms.");
        btnToCorridorExample.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zoomToThis(v, CorridorExample.class);
            }
        });
        //end code button programmatically

    }
}
