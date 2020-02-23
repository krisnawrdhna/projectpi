package com.example.projectpi;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.cardview.widget.CardView;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import com.example.projectpi.Tujuan.cina;
import com.example.projectpi.Tujuan.jepang;
import com.example.projectpi.Tujuan.korea;
import com.example.projectpi.Tujuan.malaysia;
import com.example.projectpi.Tujuan.singapur;

public class MainActivity extends AppCompatActivity {

    CardView  but_indo, but_singapur, but_malay, but_cina, but_jepang, but_korea;
    Animation fadein_btnindo, fadein_btnsingapur, fadein_btnmalay, fadein_btncina, fadein_btnjepang, fadein_btnkorea;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //mulai pembuatan button
        CardView btn_indo=(CardView) findViewById(R.id.btn_indo);
        btn_indo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, indonesia.class);
                startActivity(i);
            }
        });
        //selesai
        CardView btn_singapur=(CardView) findViewById(R.id.btn_singapur);
        btn_singapur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,singapur.class);
                startActivity(i);
            }
        });
        CardView btn_malaysia=(CardView) findViewById(R.id.btn_malaysia);
        btn_malaysia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, malaysia.class);
                startActivity(i);
            }
        });
        CardView btn_cina=(CardView) findViewById(R.id.btn_cina);
        btn_cina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, cina.class);
                startActivity(i);
            }
        });
        CardView btn_jepang=(CardView) findViewById(R.id.btn_jepang);
        btn_jepang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, jepang.class);
                startActivity(i);
            }
        });
        CardView btn_korea=(CardView) findViewById(R.id.btn_korea);
        btn_korea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, korea.class);
                startActivity(i);
            }
        });

        //decalre button
        but_indo = (CardView) findViewById(R.id.btn_indo);
        but_singapur =(CardView) findViewById(R.id.btn_singapur);
        but_malay =(CardView) findViewById(R.id.btn_malaysia);
        but_cina =(CardView) findViewById(R.id.btn_cina);
        but_jepang = (CardView) findViewById(R.id.btn_jepang);
        but_korea = (CardView) findViewById(R.id.btn_korea);

        //declare animation
        fadein_btnindo = AnimationUtils.loadAnimation(this, R.anim.fadein_btn1);
        fadein_btnsingapur = AnimationUtils.loadAnimation(this,R.anim.fadein_btn2);
        fadein_btnmalay = AnimationUtils.loadAnimation(this,R.anim.fadein_btn3);
        fadein_btncina = AnimationUtils.loadAnimation(this, R.anim.fadein_btn4);
        fadein_btnjepang =AnimationUtils.loadAnimation(this, R.anim.fadein_btn5);
        fadein_btnkorea = AnimationUtils.loadAnimation(this, R.anim.fadein_btn6);

        //target your items for animation
        but_indo.setAnimation(fadein_btnindo);
        but_singapur.setAnimation(fadein_btnsingapur);
        but_malay.setAnimation(fadein_btnmalay);
        but_cina.setAnimation(fadein_btncina);
        but_jepang.setAnimation(fadein_btnjepang);
        but_korea.setAnimation(fadein_btnkorea);


    }
}
