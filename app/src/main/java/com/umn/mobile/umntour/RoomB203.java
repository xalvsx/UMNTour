package com.umn.mobile.umntour;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class RoomB203 extends TourActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void setUpActivity() {
        ImageView iv = (ImageView)findViewById(R.id.bgImage);
        iv.setImageResource(R.drawable.b203_night);

        if(isDay) { //cuma bisa diakses malem
            Intent i = new Intent(getApplicationContext(),Corridor2Left1.class);
            i.putExtra("isDay",isDayBefore);
            startActivity(i);
            finish();
        }


        //isi detail dari ruangan ini, misal nama tempat ini = Contoh Tour
        setActivityDetail("Room B203", "Room B203 is a standard classroom and can be use as connecting room with Room B201.");



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
