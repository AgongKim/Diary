package com.example.finalproject.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.finalproject.R;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.HorizontalViewHolder> {

    private ArrayList<Integer> dataList;

    public void setData(ArrayList<Integer> list) {
        dataList = list;
    }

    public void add(int item){
        dataList.add(item);
    }

    @Override
    public HorizontalViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        // 사용할 아이템의 뷰를 생성해준다.
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycler_item, parent, false);

        HorizontalViewHolder holder = new HorizontalViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(HorizontalViewHolder holder, int position) {
        int resource = dataList.get(position);

        holder.icon.setImageResource(resource);
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }


    class HorizontalViewHolder extends RecyclerView.ViewHolder {

        public ImageView icon;

        public HorizontalViewHolder(View itemView) {
            super(itemView);

            icon = (ImageView) itemView.findViewById(R.id.horizon_icon);
        }
    }
}