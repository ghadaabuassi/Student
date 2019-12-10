package com.ghada.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    List<Student> studentList = new ArrayList<>();
    RecyclerView students_rv;
    StudentAdapter studentsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();

        students_rv = findViewById(R.id.students_rv);
        students_rv.setLayoutManager(new LinearLayoutManager(this));
        studentsAdapter = new StudentAdapter(this , studentList);
        students_rv.setAdapter(studentsAdapter);
    }

    private void initData() {
        studentList. add(new Student("1","Student  1" , "age 1" , "100"));
        studentList. add(new Student("2","Student  2" , "age 1" , "10"));
        studentList. add(new Student("3","Student  3" , "age 1" , "20"));
        studentList. add(new Student("4","Student  4" , "age 1" , "15"));
        studentList. add(new Student("5","Student  5" , "age 1" , "12"));
        studentList. add(new Student("6","Student  6" , "age 1" , "90"));

    }
}
