package com.simple_ui_ux.profile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;

import com.simple_ui_ux.R;

public class Profile_Activity_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile2);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }
}