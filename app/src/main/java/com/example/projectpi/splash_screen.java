package com.example.projectpi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class splash_screen extends AppCompatActivity {

    ImageView IV1;
    Animation fromtop,frombottom,fadein;
    TextView title,descsplash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        IV1 = (ImageView) findViewById(R.id.IV1);
        title = (TextView) findViewById(R.id.title);
        descsplash = (TextView) findViewById(R.id.descsplash);

        //declare your animation
        fromtop = AnimationUtils.loadAnimation(this, R.anim.fromtop);
        frombottom = AnimationUtils.loadAnimation(this, R.anim.frombottom);
        fadein = AnimationUtils.loadAnimation(this, R.anim.fadein);

        //target set animation
        IV1.setAnimation(fromtop);
        title.setAnimation(fromtop);
        descsplash.setAnimation(fadein);


        final Intent i = new Intent(this, MainActivity.class);
        Thread timer = new Thread() {
            public void run() {
                try {
                    sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    startActivity(i);
                    finish();
                }
            }
        };
        timer.start();

    }
}
