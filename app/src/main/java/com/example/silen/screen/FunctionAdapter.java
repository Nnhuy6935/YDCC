package com.example.silen.screen;

import static androidx.core.content.ContextCompat.startActivity;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.silen.R;

import java.util.ArrayList;

public class FunctionAdapter extends RecyclerView.Adapter<FunctionAdapter.ViewHolder> {
    private Context context;
    ArrayList<Function> listFunc;
    String note;
    String before ="";
    public FunctionAdapter(Context context, ArrayList<Function> list, String note){
        this.context = context;
        this.listFunc = list;
        this.note = note;
    }

    @NonNull
    @Override
    public FunctionAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        if(note.equals("vertical"))
            view = LayoutInflater.from(context).inflate(R.layout.function_adapter_ui,parent,false);
        else
            view = LayoutInflater.from(context).inflate(R.layout.mini_function_adapter_ui,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FunctionAdapter.ViewHolder holder, int position) {
        Function function = listFunc.get(position);
        holder.title.setText(function.getTitle());
        holder.icon.setImageResource(function.getIcon());
    }

    @Override
    public int getItemCount() {
        return listFunc.size();
    }
    class ViewHolder extends RecyclerView.ViewHolder{
        ImageView icon;
        TextView title;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            icon = (ImageView) itemView.findViewById(R.id.functionIcon);
            title = (TextView) itemView.findViewById(R.id.txtTitle);
            if(note.equals("vertical")) {
                icon.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(context, content.class);
                        Bundle bundle = new Bundle();
                        bundle.putString("Title",title.getText().toString());
                        intent.putExtras(bundle);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
                        context.getApplicationContext().startActivity(intent);
                    }
                });
            }
            else{
                icon.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String til = title.getText().toString();
                        if(til.equals("Bài học"))
                            icon.setImageResource(R.drawable.lesson_choose);
                        else if(til.equals("Kiểm tra"))
                            icon.setImageResource(R.drawable.test_choose);
                        else if(til.equals("Cài đặt"))
                            icon.setImageResource(R.drawable.setting_choose);
                        else if(til.equals("Báo cáo"))
                            icon.setImageResource(R.drawable.report_choose);
                        else icon.setImageResource(R.drawable.news_choose);





                    }
                });

            }
        }

    }
}
