package com.example.projectpi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class bali extends AppCompatActivity {
    private Button btnmapbali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bali);

        btnmapbali = findViewById(R.id.btnmapbali);
        btnmapbali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(bali.this,mapbali.class));
            }
        });

    }
}
