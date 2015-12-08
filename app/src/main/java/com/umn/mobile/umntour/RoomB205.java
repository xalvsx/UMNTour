package com.umn.mobile.umntour;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class RoomB205 extends TourActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void setUpActivity() {
        ImageView iv = (ImageView)findViewById(R.id.bgImage);
        if(isDay) { //jika pagi, gambarnya apa
            iv.setImageResource(R.drawable.b205);
        }
        else { //jika malam, gambarnya apa
            iv.setImageResource(R.drawable.b205_night);
        }

        setActivityDetail("Room B205", "Room B205 is a standard classroom.");

        //code untuk bikin button programmatically
        ImageButton btnToCorridor2Left1 = new ImageButton(this);
        btnToCorridor2Left1.setBackgroundResource(R.drawable.arrow_down);
        RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        lp.addRule(RelativeLayout.CENTER_HORIZONTAL);
        lp.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
        btnToCorridor2Left1.setLayoutParams(lp);
        layout.addView(btnToCorridor2Left1);
        btnToCorridor2Left1.setId(View.generateViewId());
        btnBack = btnToCorridor2Left1;
        btnToCorridor2Left1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zoomOutFade(v, Corridor2Left1.class);
            }
        });
        //end code button programmatically
    }
}
