package com.example.projectpi.Tujuan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.projectpi.R;
import com.example.projectpi.jeju;
import com.example.projectpi.seoul;

public class korea extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_korea);

        CardView btn_seoul=(CardView) findViewById(R.id.btn_seoul);
        btn_seoul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(korea.this, seoul.class));
            }
        });

        CardView btn_jeju=(CardView) findViewById(R.id.btn_jeju);
        btn_jeju.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(korea.this, jeju.class));
            }
        });

    }
}
