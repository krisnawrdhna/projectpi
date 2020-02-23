package com.example.projectpi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class jakarta extends AppCompatActivity {

    TextView desc_jakarta;
    Button btn_map;
    Animation fadein, frombottom;

    private Button btnmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jakarta);

        btnmap = findViewById(R.id.btnMapJakarta);
        btnmap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(jakarta.this,mapjakarta.class));
            }
        });

        //direct textview and button
        desc_jakarta=(TextView) findViewById(R.id.desc_jakarta);
        btn_map=(Button) findViewById(R.id.btnMapJakarta);

        //direct animation
        fadein= AnimationUtils.loadAnimation(this, R.anim.fadein_btn2);
        frombottom=AnimationUtils.loadAnimation(this, R.anim.frombottom);

        //target your animation to your item
        desc_jakarta.setAnimation(fadein);
        btn_map.setAnimation(frombottom);

    }
}
