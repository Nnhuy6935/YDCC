package com.example.silen.screen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.silen.R;

import java.util.ArrayList;

public class mainUI extends Activity {
    RecyclerView recyclerView;
    ArrayList<Function> list = null;

    Intent intent;
    @Override
    public void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.main_layout);
        intent = getIntent();
        Toast.makeText(this,"dhafkahd",Toast.LENGTH_SHORT);
        recyclerView = (RecyclerView) findViewById(R.id.listFuncChoose);
        list = new ArrayList<Function>();
//        System.out.println(list.size());
        list.add(new Function("Bài học", R.drawable.lesson));
        list.add(new Function("Kiểm tra", R.drawable.test));
        list.add(new Function("Cài đặt",R.drawable.setting));
        list.add(new Function("Tin tức",R.drawable.news));
        list.add(new Function("Báo cáo",R.drawable.report));
//        System.out.println("size --- " + list.size());
        FunctionAdapter adapter  = new FunctionAdapter(getApplicationContext(),list,"vertical");
        RecyclerView.LayoutManager linearLayout = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(linearLayout);



    }
}
