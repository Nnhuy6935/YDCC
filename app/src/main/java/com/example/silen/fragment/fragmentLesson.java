package com.example.silen.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.silen.R;

import java.util.zip.Inflater;

public class fragmentLesson extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        Toast.makeText(container.getContext(),"info",Toast.LENGTH_SHORT).show();
        System.out.println("Check");
        View view = inflater.inflate(R.layout.lesson_layout, container,false);
        return view;
    }
}