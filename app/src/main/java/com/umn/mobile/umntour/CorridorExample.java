package com.umn.mobile.umntour;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class CorridorExample extends TourActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void setUpActivity() {
        ImageView iv = (ImageView)findViewById(R.id.bgImage);
        if(isDay) { //jika pagi, gambarnya apa
            iv.setImageResource(R.drawable.cwallpaper);
        }
        else { //jika malam, gambarnya apa
            iv.setImageResource(R.drawable.cwallpaper_night);
        }

        //isi detail dari ruangan ini, misal nama tempat ini = Contoh Tour
        setActivityDetail("Corridor Example","Corridor Example is a corridor that links so many other class room. People usually come and go in this place.");



        //code untuk bikin button programmatically
        ImageButton btnToRoomExample = new ImageButton(this);
        btnToRoomExample.setBackgroundResource(android.R.drawable.ic_dialog_map);
        RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        lp.addRule(RelativeLayout.ALIGN_PARENT_START);
        lp.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
        lp.setMarginStart(getdp(400));
        lp.setMargins(0, 0, 0, getdp(250));
        btnToRoomExample.setLayoutParams(lp);
        layout.addView(btnToRoomExample);
        //details.put(btnToCorridorExample.getId(), "Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest");
        //komen diatas itu contoh batas panjang kata2nya
        btnToRoomExample.setId(View.generateViewId());
        details.put(btnToRoomExample.getId(), "This is the way to go to the Room asdasdExample. Room Example links only to Corridor Example.");
        btnToRoomExample.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zoomToThis(v, RoomExample.class);
            }
        });
        //end code button programmatically

        //code untuk bikin button programmatically
        ImageButton btnToRoomExample2 = new ImageButton(this);
        btnToRoomExample2.setBackgroundResource(android.R.drawable.ic_dialog_alert);
        RelativeLayout.LayoutParams lp2 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        lp2.addRule(RelativeLayout.ALIGN_PARENT_START);
        lp2.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
        lp2.setMarginStart(getdp(200));
        lp2.setMargins(0, 0, 0, getdp(150));
        btnToRoomExample2.setLayoutParams(lp2);
        layout.addView(btnToRoomExample2);
        //details.put(btnToCorridorExample.getId(), "Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest");
        //komen diatas itu contoh batas panjang kata2nya
        btnToRoomExample2.setId(View.generateViewId());
        details.put(btnToRoomExample2.getId(), "This is the way to go to the Room2 Example. Currently, room2 is not available.");
        btnToRoomExample2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showOtherWayDetail("The 'A' Building","This is the way to the 'A' building, where the lecturers, staff, and academic services be held!");
            }
        });
        //end code button programmatically

    }
}
