package com.umn.mobile.umntour;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class Toilet2 extends TourActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void setUpActivity() {
        ImageView iv = (ImageView) findViewById(R.id.bgImage);
        if (isDay) { //jika pagi, gambarnya apa
            iv.setImageResource(R.drawable.toilet_lt2);
        } else { //jika malam, gambarnya apa
            iv.setImageResource(R.drawable.toilet_lt2_night);
        }

        setActivityDetail("2nd Floor Toilet", "Public sanitation facilties, complete wih closet, washtafel, clean water supply and other hygienic equipment.");

        //code untuk bikin button programmatically
        ImageButton btnToCorridorBack2 = new ImageButton(this);
        btnToCorridorBack2.setBackgroundResource(R.drawable.arrow_left);
        RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        lp.addRule(RelativeLayout.ALIGN_PARENT_START);
        lp.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
        lp.setMarginStart(getdp(26));
        lp.setMargins(0, 0, 0, getdp(25));
        btnToCorridorBack2.setLayoutParams(lp);
        layout.addView(btnToCorridorBack2);
        btnToCorridorBack2.setId(View.generateViewId());
        btnBack = btnToCorridorBack2;
        btnToCorridorBack2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zoomOutFade(v, Corridor2Right.class);
            }
        });
        //end code button programmatically
    }
}
