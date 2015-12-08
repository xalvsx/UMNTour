package com.umn.mobile.umntour;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class Corridor3left1 extends TourActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void setUpActivity() {
        ImageView iv = (ImageView) findViewById(R.id.bgImage);
        if (isDay) { //jika pagi, gambarnya apa
            iv.setImageResource(R.drawable.selasar3_kiri1);
        } else { //jika malam, gambarnya apa
            iv.setImageResource(R.drawable.selasar3_kiri1_night);
        }

        //isi detail dari ruangan ini, misal nama tempat ini = Contoh Tour
        setActivityDetail("3rd Floor Left Corridor", "The way to go to 3rd floor Classroom.");

        if(isDay){
            //code untuk bikin button programmatically
            ImageButton btnToB304 = new ImageButton(this);
            btnToB304.setBackgroundResource(R.drawable.arrow_left);
            RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            lp.addRule(RelativeLayout.ALIGN_PARENT_START);
            lp.addRule(RelativeLayout.CENTER_VERTICAL);
            lp.setMarginStart(getdp(209));
            btnToB304.setLayoutParams(lp);
            layout.addView(btnToB304);
            //details.put(btnToCorridorExample.getId(), "Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest");
            //komen diatas itu contoh batas panjang kata2nya
            btnToB304.setId(View.generateViewId());
            details.put(btnToB304.getId(), "This is the way to the Room B304.");
            btnToB304.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    zoomToThis(v, RoomB304.class);
                }
            });
            //end code button programmatically

            //code untuk bikin button programmatically
            ImageButton btnToCorridor3left2 = new ImageButton(this);
            btnToCorridor3left2.setBackgroundResource(R.drawable.arrow_up);
            RelativeLayout.LayoutParams lp2 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            lp2.addRule(RelativeLayout.ALIGN_PARENT_END);
            lp2.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
            lp2.setMarginEnd(getdp(246));
            lp2.setMargins(0, 0, 0, getdp(105));
            btnToCorridor3left2.setLayoutParams(lp2);
            layout.addView(btnToCorridor3left2);
            //details.put(btnToCorridorExample.getId(), "Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest");
            //komen diatas itu contoh batas panjang kata2nya
            btnToCorridor3left2.setId(View.generateViewId());
            details.put(btnToCorridor3left2.getId(), "This is the way to the next corridor.");
            btnToCorridor3left2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    zoomToThis(v, Corridor3left2.class);
                }
            });
            //end code button programmatically

            //code untuk bikin button programmatically
            ImageButton btnToBackCorridor3Left = new ImageButton(this);
            btnToBackCorridor3Left.setBackgroundResource(R.drawable.arrow_down);
            RelativeLayout.LayoutParams lp3 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            lp3.addRule(RelativeLayout.CENTER_HORIZONTAL);
            lp3.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
            lp3.setMargins(0, 0, 0, getdp(10));
            btnToBackCorridor3Left.setLayoutParams(lp3);
            layout.addView(btnToBackCorridor3Left);
            //details.put(btnToCorridorExample.getId(), "Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest");
            //komen diatas itu contoh batas panjang kata2nya
            btnToBackCorridor3Left.setId(View.generateViewId());
            btnBack = btnToBackCorridor3Left;
            btnToBackCorridor3Left.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    zoomOutFade(v, Corridor3left.class);
                }
            });
            //end code button programmatically
        } else {
            //code untuk bikin button programmatically
            ImageButton btnToCorridor3kiri2 = new ImageButton(this);
            btnToCorridor3kiri2.setBackgroundResource(R.drawable.arrow_up);
            RelativeLayout.LayoutParams lp2 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            lp2.addRule(RelativeLayout.ALIGN_PARENT_START);
            lp2.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
            lp2.setMarginStart(getdp(265));
            lp2.setMargins(0, 0, 0, getdp(104));
            btnToCorridor3kiri2.setLayoutParams(lp2);
            layout.addView(btnToCorridor3kiri2);
            //details.put(btnToCorridorExample.getId(), "Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest");
            //komen diatas itu contoh batas panjang kata2nya
            btnToCorridor3kiri2.setId(View.generateViewId());
            details.put(btnToCorridor3kiri2.getId(), "This is the way to the next corridor.");
            btnToCorridor3kiri2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    zoomToThis(v, Corridor3left2.class);
                }
            });
            //end code button programmatically

            //code untuk bikin button programmatically
            ImageButton btnToBackCorridor3Left = new ImageButton(this);
            btnToBackCorridor3Left.setBackgroundResource(R.drawable.arrow_down);
            RelativeLayout.LayoutParams lp3 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            lp3.addRule(RelativeLayout.CENTER_HORIZONTAL);
            lp3.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
            lp3.setMargins(0, 0, 0, getdp(10));
            btnToBackCorridor3Left.setLayoutParams(lp3);
            layout.addView(btnToBackCorridor3Left);
            //details.put(btnToCorridorExample.getId(), "Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest");
            //komen diatas itu contoh batas panjang kata2nya
            btnToBackCorridor3Left.setId(View.generateViewId());
            btnBack = btnToBackCorridor3Left;
            btnToBackCorridor3Left.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    zoomOutFade(v, Corridor3left.class);
                }
            });
            //end code button programmatically
        }
    }
}
