package com.example.administrator.flyfish.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.example.administrator.flyfish.R;
import com.example.administrator.flyfish.School;
import com.example.administrator.flyfish.SchoolActivity;
import com.example.administrator.flyfish.SchoolAdapter;

import java.util.ArrayList;
import java.util.List;

public class Fragment_Home extends Fragment {

    private List<School> schoolList = new ArrayList<>();
    private RecyclerView recyclerView;

    private ListView listView;

    private Button btn_change;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.title,container,false);
        initSchool();
        return view;

    }

    private void initSchool() {


        School nanda = new School("南昌大学",R.drawable.ncdax);
        schoolList.add(nanda);
        School JXSD = new School("江西师范大学",R.drawable.jxsc);
        schoolList.add(JXSD);
        School HDJD = new School("华东交通大学",R.drawable.hdjd);
        schoolList.add(HDJD);
        School JXCJ = new School("江西财经大学",R.drawable.jxcj);
        schoolList.add(JXCJ);
        School NCHK = new School("南昌航空大学",R.drawable.nchk);
        schoolList.add(NCHK);
        School JXLG = new School("江西理工大学",R.drawable.jxlg);
        schoolList.add(JXLG);
        School DHLG = new School("东华理工大学",R.drawable.dhlg);
        schoolList.add(DHLG);
        School JXND = new School("江西农业大学",R.drawable.jxny);
        schoolList.add(JXND);
        School ZYYD = new School("江西中医药大学",R.drawable.jxzyy);
        schoolList.add(ZYYD);
        School YCXY = new School("宜春学院",R.drawable.ycxy);
        schoolList.add(YCXY);
        School NCLG = new School("南昌理工学院",R.drawable.nclg);
        schoolList.add(NCLG);














    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        //super.onViewCreated(view, savedInstanceState);

//        btn_change = view.findViewById(R.id.btn_school);
//        btn_change.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(getActivity(),SchoolActivity.class);
//                startActivity(intent);
//            }
//        });



        //获取RecyclerView
        recyclerView =  view.findViewById(R.id.list_view_school);
//        recyclerView.setAdapter(new SchoolAdapter(schoolList));
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        //创建Adapter
        SchoolAdapter schoolAdapter   = new SchoolAdapter(getActivity(),schoolList);
        //给RecyclerView设置Adapter
        recyclerView.setAdapter(schoolAdapter);


        schoolAdapter.setOnItemClickListener(new SchoolAdapter.OnItemClickListener() {
            @Override
            public void onClick(int position) {
                Intent intent = new Intent(getActivity(),SchoolActivity.class);
               startActivity(intent);
            }
            @Override
            public void onLongClick(int position) {
                Toast.makeText(getActivity(),"您长按点击了"+position+"行",Toast.LENGTH_SHORT).show();
            }
        });







//        recyclerView.addItemDecoration(new DividerItemDecoration(getActivity(),DividerItemDecoration.VERTICAL));

        //RecyclerView中没有item的监听事件，需要自己在适配器中写一个监听事件的接口。参数根据自定义
//        schoolAdapter.setOnItemClickListener(new SchoolAdapter.OnItemClickListener() {
//            @Override
//            public void OnItemClick(View view, School data) {
//                Toast.makeText(getActivity(),"我是item",Toast.LENGTH_SHORT).show();
//            }
//        });


    }


}
