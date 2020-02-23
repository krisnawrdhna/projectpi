package com.example.projectpi.Tujuan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.projectpi.R;
import com.example.projectpi.beijing;
import com.example.projectpi.shanghai;

public class cina extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cina);

        CardView btn_beijing=(CardView) findViewById(R.id.btn_beijing);
        btn_beijing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(cina.this, beijing.class));
            }
        });

        CardView btn_shanghai=(CardView) findViewById(R.id.btn_shanghai);
        btn_shanghai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(cina.this, shanghai.class));
            }
        });
    }
}
