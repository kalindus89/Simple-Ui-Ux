package com.simple_ui_ux.menus;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.simple_ui_ux.R;

import java.util.ArrayList;


public class Menu_Activity_10_Adapter extends RecyclerView.Adapter<Menu_Activity_10_Adapter.ViewHolder> {

ArrayList<Menu_Activity_10_Model> listDomains;
    public Menu_Activity_10_Adapter(ArrayList<Menu_Activity_10_Model> listDomains) {
        this.listDomains = listDomains;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder2, parent, false);
        return new ViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.feederName.setText(String.valueOf(listDomains.get(position).getTitle()));

        int drawableResourceId = holder.itemView.getContext().getResources().getIdentifier(listDomains.get(position).getUrl(), "mipmap", holder.itemView.getContext().getPackageName());

        Glide.with(holder.itemView.getContext())
                .load(drawableResourceId)
                .into(holder.removeItem);
    }



    @Override
    public int getItemCount() {
        return listDomains.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView feederName;
        ImageView removeItem;

        public ViewHolder(View itemView) {
            super(itemView);
            feederName = itemView.findViewById(R.id.feederName);
            removeItem = itemView.findViewById(R.id.removeFeeder);
        }
    }
}
