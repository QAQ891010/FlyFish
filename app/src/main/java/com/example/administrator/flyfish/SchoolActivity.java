package com.example.administrator.flyfish;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.administrator.flyfish.Fragment.Fragment_intro;
import com.example.administrator.flyfish.Fragment.Fragment_line;
import com.example.administrator.flyfish.Fragment.Fragment_view;

public class SchoolActivity extends AppCompatActivity {

    private Fragment_intro fragment_intro;
    private Fragment_line fragment_line;
    private Fragment_view fragment_view;


    private Button intro,school_line,school_view;
    private ImageView back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_school);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }



        //实例化Fragment
        fragment_intro = new Fragment_intro();
        fragment_line = new Fragment_line();
        fragment_view = new Fragment_view();


        getSupportFragmentManager().beginTransaction().add(R.id.Fl_school,fragment_intro).commitAllowingStateLoss();



        intro = findViewById(R.id.intro);
        intro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.Fl_school,fragment_intro).commitAllowingStateLoss();
            }
        });

        school_line = findViewById(R.id.line_school);
        school_line.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getSupportFragmentManager().beginTransaction().replace(R.id.Fl_school,fragment_line).commitAllowingStateLoss();
            }
        });

        school_view = findViewById(R.id.view_school);
        school_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.Fl_school,fragment_view).commitAllowingStateLoss();

            }
        });

        ImageView title = findViewById(R.id.back_title);
        title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SchoolActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });




    }
}
