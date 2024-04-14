package com.example.silen.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.silen.R;
import com.example.silen.screen.LessonDetail;
import com.example.silen.screen.singleLessonAdapter;

import java.util.ArrayList;

public class BrankFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.report_fragment_ui, container,false);

        return view;
    }
    @Override
    public void onViewCreated(@NonNull View view, Bundle saveInstanceState){
//        int someInt  = requireArguments()
    }
}
