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
        iv.setImageResource(R.drawable.wallpaper); //sementara
        if(isDay) { //jika pagi, gambarnya apa
            //iv.setImageResource(R.drawable.selasar3_kanan1);
        }
        else { //jika malam, gambarnya apa
            //iv.setImageResource(R.drawable.selasar3_kanan1_night);
        }


        //isi detail dari ruangan ini, misal nama tempat ini = Contoh Tour
        setActivityDetail("Corridor 3 Right 1", "Corridor 3 Right 1 is a first right side of Building B Floor 3 Corridor.");

        //code untuk bikin button programmatically
        ImageButton btnToCorridor3Right = new ImageButton(this);
        btnToCorridor3Right.setBackgroundResource(R.drawable.arrow_right);
        RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        lp.addRule(RelativeLayout.CENTER_HORIZONTAL);
        lp.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
        btnToCorridor3Right.setLayoutParams(lp);
        layout.addView(btnToCorridor3Right);
        btnToCorridor3Right.setId(View.generateViewId());
        details.put(btnToCorridor3Right.getId(), "This is the way to go to the Corridor 3 Right.");
        btnToCorridor3Right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zoomToThis(v, Corridor3Right.class);
            }
        });
        //end code button programmatically

        //code untuk bikin button programmatically
        ImageButton btnToStudentLounge = new ImageButton(this);
        btnToStudentLounge.setBackgroundResource(R.drawable.arrow_right);
        RelativeLayout.LayoutParams lp2 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        lp2.addRule(RelativeLayout.ALIGN_PARENT_TOP);
        lp2.addRule(RelativeLayout.ALIGN_PARENT_START);
        lp2.setMarginStart(getdp(128));
        lp2.setMargins(0, getdp(93), 0, 0);
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
        btnToCorridor3Right2.setBackgroundResource(R.drawable.arrow_right);
        RelativeLayout.LayoutParams lp3 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        lp3.addRule(RelativeLayout.ALIGN_PARENT_TOP);
        lp3.addRule(RelativeLayout.ALIGN_PARENT_END);
        lp3.setMarginEnd(getdp(157));
        lp3.setMargins(0, getdp(124), 0, 0);
        btnToCorridor3Right2.setLayoutParams(lp3);
        layout.addView(btnToCorridor3Right2);
        btnToCorridor3Right2.setId(View.generateViewId());
        details.put(btnToCorridor3Right2.getId(), "This is the way to go to the Corridor 3 Right 2.");
        btnToCorridor3Right2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zoomToThis(v, Corridor3Right2.class);
            }
        });
        //end code button programmatically
    }
}
