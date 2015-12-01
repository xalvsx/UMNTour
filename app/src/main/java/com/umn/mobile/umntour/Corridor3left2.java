package com.umn.mobile.umntour;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class Corridor3left2 extends TourActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void setUpActivity() {
        ImageView iv = (ImageView) findViewById(R.id.bgImage);
        if (isDay) { //jika pagi, gambarnya apa
            iv.setImageResource(R.drawable.selasar3_kiri2);
        } else { //jika malam, gambarnya apa
            iv.setImageResource(R.drawable.selasar3_kiri2_night);
        }

        //isi detail dari ruangan ini, misal nama tempat ini = Contoh Tour
        setActivityDetail("3rd Floor Left Corridor", "Room Example is a room that basically used by student to do many activities like meeting, UKM, etc.");

        if(isDay){
            //code untuk bikin button programmatically
            ImageButton btnToB301 = new ImageButton(this);
            btnToB301.setBackgroundResource(R.drawable.arrow_right);
            RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            lp.addRule(RelativeLayout.ALIGN_PARENT_END);
            lp.addRule(RelativeLayout.CENTER_VERTICAL);
            lp.setMarginEnd(getdp(98));
            btnToB301.setLayoutParams(lp);
            layout.addView(btnToB301);
            //details.put(btnToCorridorExample.getId(), "Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest");
            //komen diatas itu contoh batas panjang kata2nya
            btnToB301.setId(View.generateViewId());
            details.put(btnToB301.getId(), "This is the way to go to the Corridor Example. Corridor Example links many other rooms.");
            btnToB301.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    zoomToThis(v, RoomB301.class);
                }
            });
            //end code button programmatically

            //code untuk bikin button programmatically
            ImageButton btnToBackCorridor3Left1 = new ImageButton(this);
            btnToBackCorridor3Left1.setBackgroundResource(R.drawable.arrow_down);
            RelativeLayout.LayoutParams lp3 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            lp3.addRule(RelativeLayout.CENTER_HORIZONTAL);
            lp3.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
            lp3.setMargins(0, 0, 0, getdp(10));
            btnToBackCorridor3Left1.setLayoutParams(lp3);
            layout.addView(btnToBackCorridor3Left1);
            //details.put(btnToCorridorExample.getId(), "Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest");
            //komen diatas itu contoh batas panjang kata2nya
            btnToBackCorridor3Left1.setId(View.generateViewId());
            details.put(btnToBackCorridor3Left1.getId(), "This is the way to go to the Corridor Example. Corridor Example links many other rooms.");
            btnToBackCorridor3Left1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    zoomToThis(v, Corridor3left2.class);
                }
            });
            //end code button programmatically
        } else {
            //code untuk bikin button programmatically
            ImageButton btnToBackCorridor3Left1 = new ImageButton(this);
            btnToBackCorridor3Left1.setBackgroundResource(R.drawable.arrow_down);
            RelativeLayout.LayoutParams lp3 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            lp3.addRule(RelativeLayout.CENTER_HORIZONTAL);
            lp3.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
            lp3.setMargins(0, 0, 0, getdp(10));
            btnToBackCorridor3Left1.setLayoutParams(lp3);
            layout.addView(btnToBackCorridor3Left1);
            //details.put(btnToCorridorExample.getId(), "Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest");
            //komen diatas itu contoh batas panjang kata2nya
            btnToBackCorridor3Left1.setId(View.generateViewId());
            details.put(btnToBackCorridor3Left1.getId(), "This is the way to go to the Corridor Example. Corridor Example links many other rooms.");
            btnToBackCorridor3Left1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    zoomToThis(v, Corridor3left.class);
                }
            });
            //end code button programmatically
        }
    }
}
