package com.simple_ui_ux.animations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;

import com.simple_ui_ux.R;

public class Animation_Activity_5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation5);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);


    }
}