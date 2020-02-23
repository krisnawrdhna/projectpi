package com.example.projectpi.Tujuan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.projectpi.R;
import com.example.projectpi.marinabay;

public class singapur extends AppCompatActivity {

    private CardView btn_singapur;
    private String gardenby;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singapur);


        CardView btn_marinabaysands=(CardView) findViewById(R.id.btn_marinabaysands);
        btn_marinabaysands.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(singapur.this, marinabay.class));
            }
        });

        CardView btn_gardenby=(CardView) findViewById(R.id.btn_gardenbythebay);
        btn_gardenby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(singapur.this, gardenby.class));
            }
        });




    }
}
