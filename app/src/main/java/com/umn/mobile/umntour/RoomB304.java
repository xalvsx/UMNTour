package com.umn.mobile.umntour;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class RoomB304 extends TourActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void setUpActivity() {
        ImageView iv = (ImageView) findViewById(R.id.bgImage);
        iv.setImageResource(R.drawable.b304);

        if(!isDay) { //cuma bisa diakses siang
            Intent i = new Intent(getApplicationContext(),Corridor3left1.class);
            i.putExtra("isDay",isDayBefore);
            startActivity(i);
            finish();
        }

        setActivityDetail("Room B304", "Room B304 is a standard classroom and can be use as connecting room with Room B302.");

        //code untuk bikin button programmatically
        ImageButton btnToBackCorridor3kiri1 = new ImageButton(this);
        btnToBackCorridor3kiri1.setBackgroundResource(R.drawable.arrow_down);
        RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        lp.addRule(RelativeLayout.ALIGN_PARENT_START);
        lp.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
        lp.setMarginStart(getdp(180));
        lp.setMargins(0, 0, 0, getdp(9));
        btnToBackCorridor3kiri1.setLayoutParams(lp);
        layout.addView(btnToBackCorridor3kiri1);
        btnToBackCorridor3kiri1.setId(View.generateViewId());
        btnBack = btnToBackCorridor3kiri1;
        btnToBackCorridor3kiri1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zoomOutFade(v, Corridor3left1.class);
            }
        });
        //end code button programmatically


    }
}
