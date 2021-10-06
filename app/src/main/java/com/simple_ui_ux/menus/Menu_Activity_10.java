package com.simple_ui_ux.menus;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.WindowManager;

import com.simple_ui_ux.R;

import java.util.ArrayList;

public class Menu_Activity_10 extends AppCompatActivity {
    private RecyclerView.Adapter adapter;
    private RecyclerView recyclerViewList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu10);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        recyclerViewList = findViewById(R.id.view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerViewList.setLayoutManager(linearLayoutManager);
        ArrayList<Menu_Activity_10_Model> articles = new ArrayList<>();
        articles.add(new Menu_Activity_10_Model("Caitlyn Jenner in \"Hell no\"", "pic_1"));
        articles.add(new Menu_Activity_10_Model("Gov. Brian kemp", "pic_2"));
        articles.add(new Menu_Activity_10_Model("US-China War", "pic_3"));
        articles.add(new Menu_Activity_10_Model("Caitlyn Jenner in \"Hell no\"", "pic_1"));

        adapter = new Menu_Activity_10_Adapter(articles);
        recyclerViewList.setAdapter(adapter);

    }
}