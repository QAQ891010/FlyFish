package com.example.administrator.flyfish;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.administrator.flyfish.Fragment.Fragment_Friend;
import com.example.administrator.flyfish.Fragment.Fragment_User;


public class MainActivity extends AppCompatActivity {

    private TextView TV_poi;
    private TextView TV_user;

    private Fragment_Friend fragment_friend;
    private Fragment_User fragment_user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null){
            actionBar.hide();
        }


        //实例化Fragment
        fragment_friend = new Fragment_Friend();
        fragment_user = new Fragment_User();
        


        TV_poi= findViewById(R.id.txt_poi);
        TV_poi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this,FriendActivity.class);
//
                getSupportFragmentManager().beginTransaction().replace(R.id.Fl_main,fragment_friend).commitAllowingStateLoss();
            }
        });

        TV_user = findViewById(R.id.txt_user);
        TV_user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this,UserActivity.class);
//                startActivity(intent);

                getSupportFragmentManager().beginTransaction().replace(R.id.Fl_main,fragment_user).commitAllowingStateLoss();
            }
        });





    }
}
