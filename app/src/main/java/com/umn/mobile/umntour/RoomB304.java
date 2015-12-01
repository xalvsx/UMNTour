package com.umn.mobile.umntour;

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

        //isi detail dari ruangan ini, misal nama tempat ini = Contoh Tour
        setActivityDetail("Roon B304", "Room Example is a room that basically used by student to do many activities like meeting, UKM, etc.");

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
        //details.put(btnToCorridorExample.getId(), "Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest");
        //komen diatas itu contoh batas panjang kata2nya
        btnToBackCorridor3kiri1.setId(View.generateViewId());
        details.put(btnToBackCorridor3kiri1.getId(), "This is the way to go to the Corridor Example. Corridor Example links many other rooms.");
        btnToBackCorridor3kiri1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zoomToThis(v, Corridor3left1.class);
            }
        });
        //end code button programmatically


    }
}
