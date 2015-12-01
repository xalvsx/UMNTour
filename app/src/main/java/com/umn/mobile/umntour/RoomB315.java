package com.umn.mobile.umntour;

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


        //isi detail dari ruangan ini, misal nama tempat ini = Contoh Tour
        setActivityDetail("Room B315", "Room B315 is a standard classroom with a very good view on day.");



        //code untuk bikin button programmatically
        ImageButton btnToCorridor3Right2 = new ImageButton(this);
        btnToCorridor3Right2.setBackgroundResource(R.drawable.arrow_down);
        RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        lp.addRule(RelativeLayout.CENTER_HORIZONTAL);
        lp.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
        btnToCorridor3Right2.setLayoutParams(lp);
        layout.addView(btnToCorridor3Right2);
        //details.put(btnToCorridorExample.getId(), "Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest");
        //komen diatas itu contoh batas panjang kata2nya
        btnToCorridor3Right2.setId(View.generateViewId());
        details.put(btnToCorridor3Right2.getId(), "This is the way to go to the Corridor 3 Right 2. Corridor Example links many other rooms.");
        btnToCorridor3Right2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zoomToThis(v, Corridor3Right2.class);
            }
        });
        //end code button programmatically
    }
}
