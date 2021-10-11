package com.simple_ui_ux.full_ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.simple_ui_ux.R;
import com.simple_ui_ux.profile.Profile_Activity_1;
import com.simple_ui_ux.profile.Profile_MainActivity;

public class FullUi_MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_ui_main);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        findViewById(R.id.menu1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FullUi_MainActivity.this, FullUi_Activity_1.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.menu2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FullUi_MainActivity.this, FullUi_Activity_2.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.menu3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FullUi_MainActivity.this, FullUi_Activity_3.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.menu4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FullUi_MainActivity.this, FullUi_Activity_4.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.menu5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FullUi_MainActivity.this, FullUi_Activity_5.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.menu6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FullUi_MainActivity.this, FullUi_Activity_6.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.menu7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FullUi_MainActivity.this, FullUi_Activity_7.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.menu8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FullUi_MainActivity.this, FullUi_Activity_8.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.menu9).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FullUi_MainActivity.this, FullUi_Activity_9.class);
                startActivity(intent);
            }
        });
    }
}