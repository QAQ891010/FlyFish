package com.example.administrator.flyfish.Fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.administrator.flyfish.R;
import com.example.administrator.flyfish.School;
import com.example.administrator.flyfish.SchoolAdapter;

import java.util.ArrayList;
import java.util.List;

public class Fragment_Home extends Fragment {

    private List<School> schoolList = new ArrayList<>();
    private RecyclerView recyclerView;

    private Button btn_change;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.title,container,false);


        initSchool();
        recyclerView = view.findViewById(R.id.recycler_view);
        SchoolAdapter adapter = new SchoolAdapter(schoolList);
        recyclerView.setAdapter(adapter);
        return view;

    }

    private void initSchool() {


        School nanda = new School("江西师范大学",R.drawable.ncdax);
        schoolList.add(nanda);







    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

//        btn_change = view.findViewById(R.id.btn_school);
//        btn_change.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(getActivity(),SchoolActivity.class);
//                startActivity(intent);
//            }
//        });
    }
}
