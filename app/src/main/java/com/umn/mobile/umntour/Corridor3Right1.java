package com.umn.mobile.umntour;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class Corridor3Right1 extends TourActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void setUpActivity() {
        ImageView iv = (ImageView)findViewById(R.id.bgImage);
        if(isDay) { //jika pagi, gambarnya apa
            iv.setImageResource(R.drawable.selasar3_kanan1);
        }
        else { //jika malam, gambarnya apa
            iv.setImageResource(R.drawable.selasar3_kanan1_night);
        }

        setActivityDetail("3rd Floor Right Corridor", "The way to go to 3nd floor Classroom and other rooms");

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

        //code untuk bikin button programmatically
        ImageButton btnToStudentLounge = new ImageButton(this);
        btnToStudentLounge.setBackgroundResource(R.drawable.arrow_up);
        RelativeLayout.LayoutParams lp2 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        lp2.addRule(RelativeLayout.CENTER_VERTICAL);
        lp2.addRule(RelativeLayout.ALIGN_PARENT_START);
        lp2.setMarginStart(getdp(93));
        btnToStudentLounge.setLayoutParams(lp2);
        layout.addView(btnToStudentLounge);
        btnToStudentLounge.setId(View.generateViewId());
        details.put(btnToStudentLounge.getId(), "This is the way to go to the Student Lounge.");
        btnToStudentLounge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zoomToThis(v, StudentLounge.class);
            }
        });
        //end code button programmatically

        //code untuk bikin button programmatically
        ImageButton btnToCorridor3Right2 = new ImageButton(this);
        btnToCorridor3Right2.setBackgroundResource(R.drawable.arrow_up);
        RelativeLayout.LayoutParams lp3 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        lp3.addRule(RelativeLayout.CENTER_HORIZONTAL);
        lp3.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
        lp3.setMargins(0, 0, 0, getdp(102));
        btnToCorridor3Right2.setLayoutParams(lp3);
        layout.addView(btnToCorridor3Right2);
        btnToCorridor3Right2.setId(View.generateViewId());
        details.put(btnToCorridor3Right2.getId(), "This is the way to go to the next corridor.");
        btnToCorridor3Right2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zoomToThis(v, Corridor3Right2.class);
            }
        });
        //end code button programmatically
    }
}
