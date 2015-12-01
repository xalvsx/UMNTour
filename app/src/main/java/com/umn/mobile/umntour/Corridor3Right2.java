package com.umn.mobile.umntour;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class Corridor3Right2 extends TourActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void setUpActivity() {
        ImageView iv = (ImageView)findViewById(R.id.bgImage);
        if(isDay) { //jika pagi, gambarnya apa
            iv.setImageResource(R.drawable.selasar3_kanan2);
        }
        else { //jika malam, gambarnya apa
            iv.setImageResource(R.drawable.selasar3_kanan2_night);
        }


        //isi detail dari ruangan ini, misal nama tempat ini = Contoh Tour
        setActivityDetail("Corridor 3 Right 2", "Corridor 3 Right 2 is a second right side of Building B Floor 3 Corridor.");



        //code untuk bikin button programmatically
        ImageButton btnToCorridor3Right1 = new ImageButton(this);
        btnToCorridor3Right1.setBackgroundResource(R.drawable.arrow_down);
        RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        lp.addRule(RelativeLayout.CENTER_HORIZONTAL);
        lp.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
        btnToCorridor3Right1.setLayoutParams(lp);
        layout.addView(btnToCorridor3Right1);
        //details.put(btnToCorridorExample.getId(), "Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest");
        //komen diatas itu contoh batas panjang kata2nya
        btnToCorridor3Right1.setId(View.generateViewId());
        details.put(btnToCorridor3Right1.getId(), "This is the way to go to the Corridor 3 Right 1.");
        btnToCorridor3Right1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zoomToThis(v, Corridor3Right1.class);
            }
        });
        //end code button programmatically

        if(isDay) {
            ImageButton btnToB315 = new ImageButton(this);
            btnToB315.setBackgroundResource(R.drawable.arrow_right);
            RelativeLayout.LayoutParams lp3 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            lp3.addRule(RelativeLayout.ALIGN_PARENT_END);
            lp3.addRule(RelativeLayout.CENTER_VERTICAL);
            lp3.setMarginEnd(getdp(114));
            btnToB315.setLayoutParams(lp3);
            layout.addView(btnToB315);
            btnToB315.setId(View.generateViewId());
            details.put(btnToB315.getId(), "This is the way to the Room B315.");
            btnToB315.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    zoomToThis(v, RoomB315.class);
                }
            });
        }


    }
}
