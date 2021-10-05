package com.simple_ui_ux.menus;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.simple_ui_ux.R;

import java.util.ArrayList;

public class Menu_Activity_8_Adapter extends RecyclerView.Adapter<Menu_Activity_8_Adapter.ViewHolder> {
    ArrayList<Menu_Activity_8_Model> lastNews = new ArrayList<>();

    public Menu_Activity_8_Adapter(ArrayList<Menu_Activity_8_Model> lastNews) {
        this.lastNews = lastNews;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View layout = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_news, parent, false);
        return new ViewHolder(layout);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.textView.setText(lastNews.get(position).getTitle());

        int drawableResourceId = holder.itemView.getContext().getResources().getIdentifier(lastNews.get(position).getUrl(),
                "mipmap", holder.itemView.getContext().getPackageName());

        RequestOptions requestOptions = new RequestOptions();
        requestOptions = requestOptions.transforms(new CenterCrop(), new RoundedCorners(50));

        Glide.with(holder.itemView.getContext()).load(drawableResourceId).apply(requestOptions).into(holder.imageView);
    }


    @Override
    public int getItemCount() {
        return lastNews.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView textView;
        private ImageView imageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView5);
            textView = itemView.findViewById(R.id.textView5);
        }
    }
}

