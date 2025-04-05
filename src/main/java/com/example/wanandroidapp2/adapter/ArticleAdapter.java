package com.example.wanandroidapp2.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wanandroidapp2.Article;
import com.example.wanandroidapp2.R;

import java.util.ArrayList;
import java.util.List;

public class ArticleAdapter extends RecyclerView.Adapter<ArticleAdapter.ArticleViewHolder> {

    private final List<Article> articleList;



    public ArticleAdapter() {
        // 在适配器内部初始化数据
        this.articleList = new ArrayList<>();
        articleList.add(new Article("如何学习Android？", "学习Android需要掌握...."));
        articleList.add(new Article("RecycleView理解", "RecycleView是安卓用于列表的强大组件..."));
        articleList.add(new Article("Lambda表达式", "Lambda表达式可以简化代码..."));
        articleList.add(new Article("Android 2021面经分享","作者：1111111"));
        articleList.add(new Article("Android 2022面经分享","作者：2222222"));
        articleList.add(new Article("Android 2023面经分享","作者：3333333"));
        articleList.add(new Article("Android 2024面经分享","作者：7777777"));
    }

    @NonNull
    @Override
    public ArticleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_article, parent, false);
        return new ArticleViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ArticleViewHolder holder, int position) {
        Article article = articleList.get(position);
        holder.tvTitle.setText(article.getTitle());
        holder.tvContent.setText(article.getContent());
    }

    @Override
    public int getItemCount() {
        return articleList.size();
    }

    public static class ArticleViewHolder extends RecyclerView.ViewHolder {
        TextView tvTitle, tvContent;

        public ArticleViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTitle = itemView.findViewById(R.id.tvTitle);
            tvContent = itemView.findViewById(R.id.tvContent);
        }
    }


}
