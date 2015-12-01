package com.umn.mobile.umntour;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class Mushola extends TourActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void setUpActivity() {
        ImageView iv = (ImageView)findViewById(R.id.bgImage);
        iv.setImageResource(R.drawable.mushola);


        //isi detail dari ruangan ini, misal nama tempat ini = Contoh Tour
        setActivityDetail("Mushola", "Mushola.");



        //code untuk bikin button programmatically
        ImageButton btnToCorridor2Right = new ImageButton(this);
        btnToCorridor2Right.setBackgroundResource(R.drawable.arrow_down);
        RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        lp.addRule(RelativeLayout.CENTER_HORIZONTAL);
        lp.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
        btnToCorridor2Right.setLayoutParams(lp);
        layout.addView(btnToCorridor2Right);
        //details.put(btnToCorridorExample.getId(), "Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest Lorem Ipsum is a simple dummy text Ini adalah lokasi btnTest");
        //komen diatas itu contoh batas panjang kata2nya
        btnToCorridor2Right.setId(View.generateViewId());
        btnBack = btnToCorridor2Right;
        //details.put(btnToCorridor3Right.getId(), "This is the way to go to the Corridor 3 Right.");
        btnToCorridor2Right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zoomOutFade(v, Corridor2Right.class);
            }
        });
        //end code button programmatically
    }
}
