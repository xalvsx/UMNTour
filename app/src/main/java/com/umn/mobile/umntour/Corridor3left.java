package com.umn.mobile.umntour;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class Corridor3left extends TourActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void setUpActivity() {
        ImageView iv = (ImageView) findViewById(R.id.bgImage);
        if (isDay) { //jika pagi, gambarnya apa
            iv.setImageResource(R.drawable.selasar3_kiri);
        } else { //jika malam, gambarnya apa
            iv.setImageResource(R.drawable.selasar3_kiri_night);
        }

        setActivityDetail("3rd Floor Left Corridor", "The way to go to 3rd floor Classroom.");

        if(isDay){
            //code untuk bikin button programmatically
            ImageButton btnToCorridor3kiri1 = new ImageButton(this);
            btnToCorridor3kiri1.setBackgroundResource(R.drawable.arrow_up);
            RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            lp.addRule(RelativeLayout.ALIGN_PARENT_END);
            lp.addRule(RelativeLayout.CENTER_VERTICAL);
            lp.setMarginEnd(getdp(250));
            btnToCorridor3kiri1.setLayoutParams(lp);
            layout.addView(btnToCorridor3kiri1);
            btnToCorridor3kiri1.setId(View.generateViewId());
            details.put(btnToCorridor3kiri1.getId(), "This is the way to the next corridor.");
            btnToCorridor3kiri1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    zoomToThis(v, Corridor3left1.class);
                }
            });
            //end code button programmatically

            //code untuk bikin button programmatically
            ImageButton btnToBacklt3 = new ImageButton(this);
            btnToBacklt3.setBackgroundResource(R.drawable.arrow_down);
            RelativeLayout.LayoutParams lp2 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            lp2.addRule(RelativeLayout.ALIGN_PARENT_START);
            lp2.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
            lp2.setMarginStart(getdp(127));
            lp2.setMargins(0,0,0, getdp(8));
            btnToBacklt3.setLayoutParams(lp2);
            layout.addView(btnToBacklt3);
            btnToBacklt3.setId(View.generateViewId());
            btnBack = btnToBacklt3;
            btnToBacklt3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    zoomOutFade(v, Lantai3.class);
                }
            });
            //end code button programmatically
        } else {
            //code untuk bikin button programmatically
            ImageButton btnToCorridor3kiri1 = new ImageButton(this);
            btnToCorridor3kiri1.setBackgroundResource(R.drawable.arrow_up);
            RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            lp.addRule(RelativeLayout.ALIGN_PARENT_END);
            lp.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
            lp.setMarginEnd(getdp(236));
            lp.setMargins(0, 0, 0, getdp(142));
            btnToCorridor3kiri1.setLayoutParams(lp);
            layout.addView(btnToCorridor3kiri1);
            btnToCorridor3kiri1.setId(View.generateViewId());
            details.put(btnToCorridor3kiri1.getId(), "This is the way to the next corridor.");
            btnToCorridor3kiri1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    zoomToThis(v, Corridor3left1.class);
                }
            });
            //end code button programmatically

            //code untuk bikin button programmatically
            ImageButton btnToBacklt3 = new ImageButton(this);
            btnToBacklt3.setBackgroundResource(R.drawable.arrow_down);
            RelativeLayout.LayoutParams lp2 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            lp2.addRule(RelativeLayout.ALIGN_PARENT_START);
            lp2.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
            lp2.setMarginStart(getdp(127));
            lp2.setMargins(0,0,0, getdp(8));
            btnToBacklt3.setLayoutParams(lp2);
            layout.addView(btnToBacklt3);
            btnToBacklt3.setId(View.generateViewId());
            btnBack = btnToBacklt3;
            btnToBacklt3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    zoomOutFade(v, Lantai3.class);
                }
            });
            //end code button programmatically
        }
    }
}
