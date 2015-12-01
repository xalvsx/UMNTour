package com.umn.mobile.umntour;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class StudentLounge extends TourActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void setUpActivity() {
        ImageView iv = (ImageView)findViewById(R.id.bgImage);
        if(isDay) { //jika pagi, gambarnya apa
            iv.setImageResource(R.drawable.student_lounge);
        }
        else { //jika malam, gambarnya apa
            iv.setImageResource(R.drawable.student_lounge_night);
        }


        //isi detail dari ruangan ini, misal nama tempat ini = Contoh Tour
        setActivityDetail("Student Lounge", "Student Lounge is a place for student to gather.");



        //code untuk bikin button programmatically
        ImageButton btnToCorridor3Right1 = new ImageButton(this);
        btnToCorridor3Right1.setBackgroundResource(R.drawable.arrow_right);
        RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        lp.addRule(RelativeLayout.CENTER_HORIZONTAL);
        lp.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
        btnToCorridor3Right1.setLayoutParams(lp);
        layout.addView(btnToCorridor3Right1);
        btnToCorridor3Right1.setId(View.generateViewId());
        details.put(btnToCorridor3Right1.getId(), "This is the way to go to the Corridor 3 Right 1.");
        btnToCorridor3Right1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zoomToThis(v, Corridor3Right1.class);
            }
        });
        //end code button programmatically
    }
}
