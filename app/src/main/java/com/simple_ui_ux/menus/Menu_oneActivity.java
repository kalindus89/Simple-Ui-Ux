package com.simple_ui_ux.menus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;

import com.simple_ui_ux.R;

public class Menu_oneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_one);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

    }
}