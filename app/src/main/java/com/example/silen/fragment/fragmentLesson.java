package com.example.silen.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.silen.R;
import com.example.silen.screen.LessonDetail;
import com.example.silen.screen.singleLessonAdapter;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.zip.Inflater;

public class fragmentLesson extends Fragment {
    RecyclerView recyclerView;
    ArrayList<LessonDetail> list = null;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.lesson_layout, container,false);
        recyclerView = (RecyclerView) view.findViewById(R.id.listContent);
        list = new ArrayList<LessonDetail>();
        for(int i = 0; i < 10; ++i)
            list.add(new LessonDetail("Bài 1: Nội dung bài...","Nội dung..."));
        singleLessonAdapter singleLessonAdapter = new singleLessonAdapter(this.getContext(),list);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this.getContext(),LinearLayoutManager.VERTICAL,false);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(singleLessonAdapter);
        return view;
    }
    @Override
    public void onViewCreated(@NonNull View view, Bundle saveInstanceState){
//        int someInt  = requireArguments()
    }
}