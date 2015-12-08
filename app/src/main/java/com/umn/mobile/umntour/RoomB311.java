package com.umn.mobile.umntour;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class RoomB311 extends TourActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void setUpActivity() {
        ImageView iv = (ImageView)findViewById(R.id.bgImage);
        iv.setImageResource(R.drawable.b311);

        if(!isDay) { //cuma bisa diakses siang
            Intent i = new Intent(getApplicationContext(),Corridor3Right.class);
            i.putExtra("isDay",isDayBefore);
            startActivity(i);
            finish();
        }

        setActivityDetail("Room B311", "Room B311 is a standard classroom.");

        //code untuk bikin button programmatically
        ImageButton btnToCorridor3Right = new ImageButton(this);
        btnToCorridor3Right.setBackgroundResource(R.drawable.arrow_down);
        RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        lp.addRule(RelativeLayout.CENTER_HORIZONTAL);
        lp.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
        btnToCorridor3Right.setLayoutParams(lp);
        layout.addView(btnToCorridor3Right);
        btnToCorridor3Right.setId(View.generateViewId());
        btnBack = btnToCorridor3Right;
        btnToCorridor3Right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zoomOutFade(v, Corridor3Right.class);
            }
        });
        //end code button programmatically
    }
}
