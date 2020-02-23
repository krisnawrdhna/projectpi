package com.example.projectpi.Tujuan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.projectpi.R;
import com.example.projectpi.osaka;
import com.example.projectpi.tokyo;

public class jepang extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jepang);

        CardView btn_tokyo=(CardView) findViewById(R.id.btn_tokyo);
        btn_tokyo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(jepang.this,tokyo.class));
            }
        });

        CardView btn_osaka=(CardView) findViewById(R.id.btn_osaka);
        btn_osaka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(jepang.this, osaka.class));
            }
        });

    }
}
