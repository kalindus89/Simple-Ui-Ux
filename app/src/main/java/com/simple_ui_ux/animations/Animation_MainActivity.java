package com.simple_ui_ux.animations;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.simple_ui_ux.R;
import com.simple_ui_ux.menus.MainMenuActivity;
import com.simple_ui_ux.menus.Menu_Activity_1;
import com.simple_ui_ux.menus.Menu_Activity_2;

public class Animation_MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation_main);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        findViewById(R.id.menu1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Animation_MainActivity.this, Animation_Activity_1.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.menu2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Animation_MainActivity.this, Animation_Activity_2.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.menu3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Animation_MainActivity.this, Animation_Activity_3.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.menu4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Animation_MainActivity.this, Animation_Activity_4.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.menu5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Animation_MainActivity.this, Animation_Activity_5.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.menu6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Animation_MainActivity.this, Animation_Activity_6.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.menu7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Animation_MainActivity.this, Animation_Activity_7.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.menu8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Animation_MainActivity.this, Animation_Activity_8.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.menu9).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Animation_MainActivity.this, Animation_Activity_9.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.menu10).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Animation_MainActivity.this, Animation_Activity_10.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.menu11).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Animation_MainActivity.this, Animation_Activity_11.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.menu12).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Animation_MainActivity.this, Animation_Activity_12.class);
                startActivity(intent);
            }
        });
    }
}