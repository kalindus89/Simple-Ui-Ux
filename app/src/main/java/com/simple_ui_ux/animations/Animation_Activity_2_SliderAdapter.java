package com.simple_ui_ux.animations;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.simple_ui_ux.R;

public class Animation_Activity_2_SliderAdapter extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;

    public Animation_Activity_2_SliderAdapter(Context context) {
        this.context = context;
    }

    public int [] slide_images={
            R.mipmap.group10,
            R.mipmap.group11,
            R.mipmap.group12
    };
    public String [] slide_heading={
            "EAT",
            "SLEEP",
            "CODE"
    };
    public String [] slide_description={
            "From creamy curries to spicy rotties and the traditional string hoppers, we have eaten our way through Colombo's best restaurants and put together this list.",
            "From creamy curries to spicy rotties and the traditional string hoppers, we have eaten our way through Colombo's best restaurants and put together this list.",
            "From creamy curries to spicy rotties and the traditional string hoppers, we have eaten our way through Colombo's best restaurants and put together this list."
    };

    @Override
    public int getCount() {
        return slide_heading.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==(RelativeLayout) object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        layoutInflater =(LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.activity_animation2_slider,container,false);

        ImageView slider_icon =view.findViewById(R.id.slider_icon);
        TextView slider_heading =view.findViewById(R.id.slider_heading);
        TextView slider_description =view.findViewById(R.id.slider_description);

        slider_icon.setImageResource(slide_images[position]);
        slider_heading.setText(slide_heading[position]);
        slider_description.setText(slide_description[position]);

        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {

        container.removeView((RelativeLayout)object);
    }
}
