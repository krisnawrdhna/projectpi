package com.example.projectpi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class indonesia extends AppCompatActivity {

    private CardView btn_indo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slider_indo2);

        CardView btn_indo=(CardView) findViewById(R.id.btnJakarta);
        btn_indo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(indonesia.this,jakarta.class));
            }
        });

        CardView btnbali=(CardView) findViewById(R.id.btnbali);
        btnbali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(indonesia.this,bali.class));
            }
        });

    }
}
