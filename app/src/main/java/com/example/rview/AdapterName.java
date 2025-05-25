package com.example.rview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AdapterName extends RecyclerView.Adapter<AdapterName.NameViewHolder> {

    String[] names ={};
    int[] ids = {};

    public AdapterName(){
        TempListItem tempListItem = new TempListItem();
        names = tempListItem.getName();
        ids = tempListItem.getAvatar();
    }

    @NonNull
    @Override
    public NameViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_name, parent, false);
        return AdapterName.NameViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NameViewHolder holder, int position) {

        holder.setItems(names[position], ids[position]);

    }

    @Override
    public int getItemCount() {
        return names.length;
    }

    public class NameViewHolder extends RecyclerView.ViewHolder{
        private ImageView imageView;
        private TextView textView;
        public NameViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            textView = itemView.findViewById(R.id.textView);

        }
        public setItems(String name, int imageid){
            textView.setText(name);
            imageView.setImageResource(imageid);

        }
    }
}
