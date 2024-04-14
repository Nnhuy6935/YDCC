package com.example.silen.screen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.silen.R;

import java.util.ArrayList;

public class content extends Activity {
    Intent intent;
    RecyclerView recyclerView;
    ArrayList<Function> list = null;
    @Override
    public void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.content_layout);
        intent = getIntent();
        Bundle data = intent.getExtras();
        String til = data.getString("Title");
        System.out.println(til + "-------");
        recyclerView = (RecyclerView) findViewById(R.id.navigation);
        list = new ArrayList<Function>();
        if(til.equals("Bài học"))
            list.add(new Function("Bài học", R.drawable.lesson_choose));
        else
            list.add(new Function("Bài học",R.drawable.lesson));
        if(til.equals("Kiểm tra"))
            list.add(new Function("Kiểm tra",R.drawable.test_choose));
        else
            list.add(new Function("Kiểm tra", R.drawable.test));
        if(til.equals("Cài đặt"))
            list.add(new Function("Cài đặt",R.drawable.setting_choose));
        else
            list.add(new Function("Cài đặt",R.drawable.setting));
        if(til.equals("Tin tức"))
            list.add(new Function("Tin tức",R.drawable.news_choose));
        else
            list.add(new Function("Tin tức",R.drawable.news));
        if(til.equals("Báo cáo"))
            list.add(new Function("Báo cáo",R.drawable.report_choose));
        else
            list.add(new Function("Báo cáo",R.drawable.report));
        FunctionAdapter adapter = new FunctionAdapter(this.getApplicationContext(),list,"Horizontal");
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);

    }
}
