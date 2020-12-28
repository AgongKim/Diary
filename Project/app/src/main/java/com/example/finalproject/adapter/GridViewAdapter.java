package com.example.finalproject.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.finalproject.R;

import java.util.List;

public class GridViewAdapter extends ArrayAdapter {
        Activity activity;
        int resource;
        public GridViewAdapter(@NonNull Context context, int resource, @NonNull List objects) {
            super(context, resource, objects);
            activity=(Activity)context;
            this.resource = resource;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            if(convertView==null){
                convertView=activity.getLayoutInflater().inflate(resource,null);
            }
            int image = (Integer)this.getItem(position);
            ImageView imageView = convertView.findViewById(R.id.imageView);
            imageView.setImageResource(image);
            return convertView;
        }
}