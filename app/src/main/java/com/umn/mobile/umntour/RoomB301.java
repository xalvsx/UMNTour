package com.umn.mobile.umntour;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class RoomB301 extends TourActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void setUpActivity() {
        ImageView iv = (ImageView) findViewById(R.id.bgImage);
        iv.setImageResource(R.drawable.b301);

        if(!isDay) { //cuma bisa diakses siang
            Intent i = new Intent(getApplicationContext(),Corridor3left2.class);
            i.putExtra("isDay",isDayBefore);
            startActivity(i);
            finish();
        }

        setActivityDetail("Room B301", "Room B301 is a standard classroom and can be use as connecting room with Room B303.");

        //code untuk bikin button programmatically
        ImageButton btnToBackCorridor3kiri2 = new ImageButton(this);
        btnToBackCorridor3kiri2.setBackgroundResource(R.drawable.arrow_down);
        RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        lp.addRule(RelativeLayout.ALIGN_PARENT_START);
        lp.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
        lp.setMarginStart(getdp(180));
        lp.setMargins(0, 0, 0, getdp(7));
        btnToBackCorridor3kiri2.setLayoutParams(lp);
        layout.addView(btnToBackCorridor3kiri2);
        btnToBackCorridor3kiri2.setId(View.generateViewId());
        btnBack = btnToBackCorridor3kiri2;
        btnToBackCorridor3kiri2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zoomOutFade(v, Corridor3left2.class);
            }
        });
        //end code button programmatically


    }
}
