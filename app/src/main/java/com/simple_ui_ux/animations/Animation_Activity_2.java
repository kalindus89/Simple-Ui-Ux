package com.simple_ui_ux.animations;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.simple_ui_ux.R;

public class Animation_Activity_2 extends AppCompatActivity {


    private ViewPager sliderViewPager;
    private LinearLayout dotsLayout;
    private TextView[] mDots;

    private Animation_Activity_2_SliderAdapter splash_activity_2_sliderAdapter;
    private Button backButton, nxtButton;
    private int currentPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation2);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        sliderViewPager = findViewById(R.id.sliderViewPager);
        dotsLayout = findViewById(R.id.dotsLayout);
        nxtButton = findViewById(R.id.nxtButton);

        backButton = findViewById(R.id.backButton);
        backButton.setEnabled(false);
        backButton.setVisibility(View.INVISIBLE);

        splash_activity_2_sliderAdapter = new Animation_Activity_2_SliderAdapter(this);
        sliderViewPager.setAdapter(splash_activity_2_sliderAdapter);

        addDotsIndicator(0);

        sliderViewPager.addOnPageChangeListener(viewListener);

        nxtButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sliderViewPager.setCurrentItem(currentPage+1);
            }
        });
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sliderViewPager.setCurrentItem(currentPage-1);
            }
        });
    }

    public void addDotsIndicator(int position) {
        mDots = new TextView[3]; // amount of tabs
        dotsLayout.removeAllViews();

        for (int i = 0; i < mDots.length; i++) {

            mDots[i] = new TextView(this);
            mDots[i].setText(Html.fromHtml("&#8226;"));
            mDots[i].setTextSize(35);
            mDots[i].setTextColor(getResources().getColor(R.color.colorTransparentWhite));

            dotsLayout.addView(mDots[i]);
        }

        if (mDots.length > 0) {
            mDots[position].setTextColor(getResources().getColor(R.color.blue));
        }
    }

    ViewPager.OnPageChangeListener viewListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {
            addDotsIndicator(position);

            currentPage = position;

            if (currentPage == 0) {

                nxtButton.setEnabled(true);
                backButton.setEnabled(false);
                backButton.setVisibility(View.INVISIBLE);

                nxtButton.setText("NEXT");
                backButton.setText("");

            } else if (position == mDots.length - 1) {

                nxtButton.setEnabled(true);
                backButton.setEnabled(true);
                backButton.setVisibility(View.VISIBLE);

                nxtButton.setText("FINISH");
                backButton.setText("BACK");
            } else {

                nxtButton.setEnabled(true);
                backButton.setEnabled(true);
                backButton.setVisibility(View.VISIBLE);

                nxtButton.setText("NEXT");
                backButton.setText("BACK");
            }
        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };
}