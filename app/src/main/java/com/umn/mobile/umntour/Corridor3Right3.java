package com.umn.mobile.umntour;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class Corridor3Right3 extends TourActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void setUpActivity() {
        ImageView iv = (ImageView) findViewById(R.id.bgImage);
        if (isDay) { //jika pagi, gambarnya apa
            iv.setImageResource(R.drawable.selasar3_kanan3);
        } else { //jika malam, gambarnya apa
            iv.setImageResource(R.drawable.selasar3_kanan3_night);
        }

        setActivityDetail("3rd Floor Right Corridor", "The way to go to 3nd floor Classroom and other rooms.");

        if(isDay){
            //code untuk bikin button programmatically
            ImageButton btnToBackCorridor3kanan2 = new ImageButton(this);
            btnToBackCorridor3kanan2.setBackgroundResource(R.drawable.arrow_down);
            RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            lp.addRule(RelativeLayout.ALIGN_PARENT_START);
            lp.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
            lp.setMarginStart(getdp(219));
            btnToBackCorridor3kanan2.setLayoutParams(lp);
            layout.addView(btnToBackCorridor3kanan2);
            btnToBackCorridor3kanan2.setId(View.generateViewId());
            btnBack = btnToBackCorridor3kanan2;
            btnToBackCorridor3kanan2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    zoomOutFade(v, Corridor3Right2.class);
                }
            });
            //end code button programmatically

            //code untuk bikin button programmatically
            ImageButton btnToServerBridge = new ImageButton(this);
            btnToServerBridge.setBackgroundResource(R.drawable.arrow_up);
            RelativeLayout.LayoutParams lp2 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            lp2.addRule(RelativeLayout.ALIGN_PARENT_START);
            lp2.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
            lp2.setMarginStart(getdp(126));
            lp2.setMargins(0,0,0, getdp(129));
            btnToServerBridge.setLayoutParams(lp2);
            layout.addView(btnToServerBridge);
            btnToServerBridge.setId(View.generateViewId());
            details.put(btnToServerBridge.getId(), "This is the way to the next corridor.");
            btnToServerBridge.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    zoomToThis(v, ServerBridge.class);
                }
            });
            //end code button programmatically
            }else{
                //code untuk bikin button programmatically
                ImageButton btnToBackCorridor3kanan2 = new ImageButton(this);
                btnToBackCorridor3kanan2.setBackgroundResource(R.drawable.arrow_down);
                RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                lp.addRule(RelativeLayout.ALIGN_PARENT_START);
                lp.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
                lp.setMarginStart(getdp(219));
                btnToBackCorridor3kanan2.setLayoutParams(lp);
                layout.addView(btnToBackCorridor3kanan2);
                btnToBackCorridor3kanan2.setId(View.generateViewId());
                btnBack = btnToBackCorridor3kanan2;
                btnToBackCorridor3kanan2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        zoomOutFade(v, Corridor3Right2.class);
                    }
                });
                //end code button programmatically

            //code untuk bikin button programmatically
            ImageButton btnToServerBridge = new ImageButton(this);
            btnToServerBridge.setBackgroundResource(R.drawable.arrow_up);
            RelativeLayout.LayoutParams lp2 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            lp2.addRule(RelativeLayout.ALIGN_PARENT_START);
            lp2.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
            lp2.setMarginStart(getdp(110));
            lp2.setMargins(0,0,0, getdp(111));
            btnToServerBridge.setLayoutParams(lp2);
            layout.addView(btnToServerBridge);
            btnToServerBridge.setId(View.generateViewId());
            details.put(btnToServerBridge.getId(), "This is the way to the next corridor.");
            btnToServerBridge.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    zoomToThis(v, ServerBridge.class);
                }
            });
            //end code button programmatically
             }
        }
}
