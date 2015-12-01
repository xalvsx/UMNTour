package com.umn.mobile.umntour;

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


        //isi detail dari ruangan ini, misal nama tempat ini = Contoh Tour
        setActivityDetail("Room B311", "Room B311 is a standard classroom.");



        //code untuk bikin button programmatically
        ImageButton btnToCorridor3Right = new ImageButton(this);
        btnToCorridor3Right.setBackgroundResource(R.drawable.arrow_right);
        RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        lp.addRule(RelativeLayout.CENTER_HORIZONTAL);
        lp.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
        btnToCorridor3Right.setLayoutParams(lp);
        layout.addView(btnToCorridor3Right);
        //details.put(btnToCorridorExample.getId(), "Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest");
        //komen diatas itu contoh batas panjang kata2nya
        btnToCorridor3Right.setId(View.generateViewId());
        details.put(btnToCorridor3Right.getId(), "This is the way to go to the Corridor 3 Right.");
        btnToCorridor3Right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zoomToThis(v, Corridor3Right.class);
            }
        });
        //end code button programmatically
    }
}
