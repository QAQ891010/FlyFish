package com.example.administrator.flyfish;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class SchoolAdapter extends RecyclerView.Adapter<SchoolAdapter.ViewHolder> {

    private final Context context;
    private List<School> mSchoolList;
    private OnItemClickListener mOnItemClickListener;

    static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView schoolImage;
        TextView schoolName;

        public ViewHolder(View view){
            super(view);
            schoolImage = view.findViewById(R.id.school_image);
            schoolName = view.findViewById(R.id.school_name);


            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {





                }
            });

        }
    }

    public SchoolAdapter(Context context, List<School> schoolList){
        this.context = context;//上下文
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
    public void onBindViewHolder(@NonNull SchoolAdapter.ViewHolder holder, final int position) {

        School school = mSchoolList.get(position);
        holder.schoolImage.setImageResource(school.getImageId());
        holder.schoolName.setText(school.getName());

        if( mOnItemClickListener!= null){
            holder.itemView.setOnClickListener( new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mOnItemClickListener.onClick(position);
                }
            });
           holder. itemView.setOnLongClickListener( new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    mOnItemClickListener.onLongClick(position);
                    return false;
                }
            });
        }

    }

    @Override
    public int getItemCount() {

        return 11;
    }


    /**
     * 设置item的监听事件的接口
     */
//    public interface OnItemClickListener {
//        /**
//         * 接口中的点击每一项的实现方法，参数自己定义
//         *
//         * @param view 点击的item的视图
//         * @param data 点击的item的数据
//         */
//        public void OnItemClick(View view, School data);
//    }
//
//    //需要外部访问，所以需要设置set方法，方便调用
//    private OnItemClickListener onItemClickListener;
//
//    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
//        this.onItemClickListener = onItemClickListener;
//    }
    public interface OnItemClickListener{
        void onClick(int position);
        void onLongClick( int position);
    }
    public  void setOnItemClickListener(OnItemClickListener onItemClickListener ){
        this.mOnItemClickListener=onItemClickListener;
    }



}
