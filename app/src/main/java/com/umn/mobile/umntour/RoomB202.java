package com.umn.mobile.umntour;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class RoomB202 extends TourActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void setUpActivity() {
        ImageView iv = (ImageView)findViewById(R.id.bgImage);
        iv.setImageResource(R.drawable.b202_night);

        if(isDay) { //cuma bisa diakses malem
            Intent i = new Intent(getApplicationContext(),Corridor2Left2.class);
            i.putExtra("isDay",isDayBefore);
            startActivity(i);
            finish();
        }

        setActivityDetail("Room B202", "Room B202 is a standard classroom and can be use as connecting room with Room B204.");

        //code untuk bikin button programmatically
        ImageButton btnToCorridor2Left2 = new ImageButton(this);
        btnToCorridor2Left2.setBackgroundResource(R.drawable.arrow_down);
        RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        lp.addRule(RelativeLayout.CENTER_HORIZONTAL);
        lp.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
        btnToCorridor2Left2.setLayoutParams(lp);
        layout.addView(btnToCorridor2Left2);
        btnToCorridor2Left2.setId(View.generateViewId());
        btnBack = btnToCorridor2Left2;
        btnToCorridor2Left2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zoomOutFade(v, Corridor2Left2.class);
            }
        });
        //end code button programmatically
    }
}
