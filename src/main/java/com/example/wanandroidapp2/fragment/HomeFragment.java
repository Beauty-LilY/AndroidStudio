
package com.example.wanandroidapp2.fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wanandroidapp2.adapter.ArticleAdapter;
import com.example.wanandroidapp2.R;

public class HomeFragment extends Fragment {

    private RecyclerView recyclerView;
    private ArticleAdapter articleAdapter;

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d("RecycleView", "HomeFragment加载成功");
        Toast.makeText(getContext(), "HomeFragment加载成功", Toast.LENGTH_SHORT).show();

        // 加载Fragment的布局
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        // 找到 RecyclerView
        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        // 初始化适配器
        articleAdapter = new ArticleAdapter();
        recyclerView.setAdapter(articleAdapter);




        return view;
    }
}
