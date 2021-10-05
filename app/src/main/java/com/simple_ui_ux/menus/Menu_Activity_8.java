package com.simple_ui_ux.menus;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.WindowManager;

import com.simple_ui_ux.R;

import java.util.ArrayList;

public class Menu_Activity_8 extends AppCompatActivity {
    private RecyclerView.Adapter adapter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu8);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        recyclerView = findViewById(R.id.view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);

        ArrayList<Menu_Activity_8_Model> lastNews = new ArrayList<>();
        lastNews.add(new Menu_Activity_8_Model("Pass the law in the Senate", "pic_4"));
        lastNews.add(new Menu_Activity_8_Model("Mountaineering is good for health", "pic_2"));
        lastNews.add(new Menu_Activity_8_Model("Wind energy is very useful", "pic_3"));
        lastNews.add(new Menu_Activity_8_Model("Pass the law in the Senate", "pic_1"));

        adapter = new Menu_Activity_8_Adapter(lastNews);
        recyclerView.setAdapter(adapter);
    }
}