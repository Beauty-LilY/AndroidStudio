package com.example.wanandroidapp2.ArticleAdapter;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wanandroidapp2.Article;
import com.example.wanandroidapp2.R;

import java.util.List;

public class Articleadapter extends RecyclerView.Adapter<Articleadapter.ArticleViewHolder> {

    private List<Article> articleList;

    // 构造方法，传入文章数据列表
    public Articleadapter(List<Article> articleList) {
        this.articleList = articleList;
    }

    // 创建 ViewHolder，并绑定 item_article.xml 布局
    @NonNull
    @Override
    public ArticleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_article, parent, false);
        return new ArticleViewHolder(view);
    }

    // 绑定数据到 ViewHolder
    @Override
    public void onBindViewHolder(@NonNull ArticleViewHolder holder, int position) {
        Article article = articleList.get(position);
        Log.d("RecycleView","绑定数据"+article.getTitle());
        holder.titleTextView.setText(article.getTitle());
        holder.contentTextView.setText(article.getContent());
    }

    // 返回列表项的数量
    @Override
    public int getItemCount() {
        return articleList.size();
    }

    // ViewHolder 内部类
    static class ArticleViewHolder extends RecyclerView.ViewHolder {
        TextView titleTextView, contentTextView;

        public ArticleViewHolder(@NonNull View itemView) {
            super(itemView);
            titleTextView = itemView.findViewById(R.id.tvTitle);
            contentTextView = itemView.findViewById(R.id.tvContent);
        }
    }
}
