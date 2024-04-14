package com.example.silen.screen;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.silen.R;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class singleLessonAdapter extends RecyclerView.Adapter<singleLessonAdapter.ViewHolder> {
    ArrayList<LessonDetail> list;
    Context context;
    public singleLessonAdapter(Context context, ArrayList<LessonDetail> list){
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public singleLessonAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        view = LayoutInflater.from(context).inflate(R.layout.lesson_item_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull singleLessonAdapter.ViewHolder holder, int position) {
        LessonDetail detail = list.get(position);
        holder.detail.setText(detail.getDetail());
        holder.lesson.setText(detail.getName());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    public class ViewHolder extends  RecyclerView.ViewHolder{
        TextView lesson;
        TextView detail;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            lesson = (TextView) itemView.findViewById(R.id.lessonTitle);
            detail = (TextView) itemView.findViewById(R.id.lessonDetail);
         }
    }
}
