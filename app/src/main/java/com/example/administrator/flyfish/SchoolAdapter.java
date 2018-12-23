package com.example.administrator.flyfish;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class SchoolAdapter extends RecyclerView.Adapter<SchoolAdapter.ViewHolder> {

    private List<School> mSchoolList;

    static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView schoolImage;
        TextView schoolName;

        public ViewHolder(View view){
            super(view);
            schoolImage = view.findViewById(R.id.school_image);
            schoolName = view.findViewById(R.id.school_name);
        }
    }

    public SchoolAdapter(List<School> schoolList){
        mSchoolList =  schoolList;
    }


    @NonNull
    @Override
    public SchoolAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.school_item,parent,false);
        ViewHolder holder = new ViewHolder(view);


        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull SchoolAdapter.ViewHolder holder, int position) {

        School school = mSchoolList.get(position);
        holder.schoolImage.setImageResource(school.getImageId());
        holder.schoolName.setText(school.getName());
    }

    @Override
    public int getItemCount() {

        return 11;
    }
}
