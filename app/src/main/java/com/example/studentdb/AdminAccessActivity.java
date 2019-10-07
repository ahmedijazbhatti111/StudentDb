package com.example.studentdb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.widget.Button;

public class AdminAccessActivity extends AppCompatActivity {

    private CardView insertBtn,deleteBtn,searchBtn,updateBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_access);


        insertBtn = findViewById(R.id.insertBtn);
        deleteBtn = findViewById(R.id.deleteBtn);
        searchBtn = findViewById(R.id.searchBtn);
        updateBtn = findViewById(R.id.updateBtn);
    }
}
