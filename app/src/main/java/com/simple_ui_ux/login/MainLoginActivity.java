package com.simple_ui_ux.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.simple_ui_ux.R;

public class MainLoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_login);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        findViewById(R.id.menu1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainLoginActivity.this, Login_Activity_1.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.menu2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainLoginActivity.this, Login_Activity_3.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.menuLast).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainLoginActivity.this, Login_Activity_2.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.menu3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainLoginActivity.this, Login_Activity_4.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.menu4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainLoginActivity.this, Login_Activity_5.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.menu5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainLoginActivity.this, Login_Activity_6.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.menu6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainLoginActivity.this, Login_Activity_7.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.menu7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainLoginActivity.this, Login_Activity_8.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.menu9).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainLoginActivity.this, Login_Activity_9.class);
                startActivity(intent);
            }
        });
    }
}