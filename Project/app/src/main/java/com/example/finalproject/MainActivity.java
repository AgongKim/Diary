package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.finalproject.adapter.GridViewAdapter;
import com.example.finalproject.adapter.RecyclerViewAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    long lastClickTime;
    RecyclerView recyclerView1,recyclerView2;
    RecyclerViewAdapter adapter1,adapter2;
    LinearLayoutManager layoutManager1,layoutManager2;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //더블클릭 체크용 변수
        lastClickTime = System.currentTimeMillis();

        //가로 리싸이클러 뷰
        recyclerView1 = findViewById(R.id.recyclerView1);
        layoutManager1 = new LinearLayoutManager(this);
        layoutManager1.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView1.setLayoutManager(layoutManager1);
        adapter1 = new RecyclerViewAdapter();

        ArrayList<Integer> data = new ArrayList<>();
        adapter1.setData(data);

        recyclerView1.setAdapter(adapter1);

        adapter1.add(R.drawable.ruda2);
        adapter1.add(R.drawable.psh);
        adapter1.add(R.drawable.your2);
        adapter1.add(R.drawable.your3);
        adapter1.add(R.drawable.f56c965dddc6eab12f98f86784782253);

        recyclerView2 = findViewById(R.id.recyclerVIew2);
        layoutManager2 = new LinearLayoutManager(this);
        layoutManager2.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView2.setLayoutManager(layoutManager2);
        adapter2 = new RecyclerViewAdapter();
        ArrayList<Integer> data2 = new ArrayList<>();
        adapter2.setData(data2);
        recyclerView2.setAdapter(adapter2);

        adapter2.add(R.drawable.book1);
        adapter2.add(R.drawable.book2);
        adapter2.add(R.drawable.book3);
        adapter2.add(R.drawable.book4);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
        long currTime = System.currentTimeMillis();
        if (currTime - lastClickTime < ViewConfiguration.getDoubleTapTimeout()) {
            onItemDoubleClick(adapterView, view, position, l);
        }
        lastClickTime = currTime;
    }

    public void onItemDoubleClick(AdapterView<?> adapterView, View view, int position, long l) {
        Toast.makeText(this,"더블클릭",Toast.LENGTH_SHORT).show();
    }


}