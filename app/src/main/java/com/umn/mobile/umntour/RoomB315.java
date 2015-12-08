package com.umn.mobile.umntour;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class RoomB315 extends TourActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void setUpActivity() {
        ImageView iv = (ImageView)findViewById(R.id.bgImage);
        iv.setImageResource(R.drawable.b315);

        if(!isDay) { //cuma bisa diakses siang
            Intent i = new Intent(getApplicationContext(),Corridor3Right2.class);
            i.putExtra("isDay",isDayBefore);
            startActivity(i);
            finish();
        }

        setActivityDetail("Room B315", "Room B315 is a standard classroom with a very good view on day.");

        //code untuk bikin button programmatically
        ImageButton btnToCorridor3Right2 = new ImageButton(this);
        btnToCorridor3Right2.setBackgroundResource(R.drawable.arrow_down);
        RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        lp.addRule(RelativeLayout.CENTER_HORIZONTAL);
        lp.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
        btnToCorridor3Right2.setLayoutParams(lp);
        layout.addView(btnToCorridor3Right2);
        btnToCorridor3Right2.setId(View.generateViewId());
        btnBack = btnToCorridor3Right2;
        btnToCorridor3Right2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zoomOutFade(v, Corridor3Right2.class);
            }
        });
        //end code button programmatically
    }
}
