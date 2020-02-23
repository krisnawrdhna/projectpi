package com.example.projectpi.Tujuan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.projectpi.R;
import com.example.projectpi.kuala2;


public class malaysia extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_malaysia);

        CardView btn_genting = (CardView) findViewById(R.id.btn_genting);
        btn_genting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(malaysia.this, com.example.projectpi.genting.class));
            }
        });

        CardView btn_kuala = (CardView) findViewById(R.id.btn_kuala);
        btn_kuala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(malaysia.this, kuala2.class));
            }
        });
    }
}
