package com.example.studentdb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.billatiger.mainmenuactivity.M_NotificationClass;
import com.example.billatiger.mainmenuactivity.R;

    public class ListOfRecord extends AppCompatActivity implements View.OnClickListener {

    private Button primary,middle, SSC, Teacher, AboutDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_records);
        ///////////////////////////////////////////////////
        primary=findViewById(R.id.id_Primary);
        primary.setOnClickListener(this);
        middle = findViewById(R.id.id_MiddleStud);
        middle.setOnClickListener(this);
        SSC = findViewById(R.id.id_SSCcStud);
        SSC.setOnClickListener(this);
        Teacher = findViewById(R.id.id_Teacher);
        Teacher.setOnClickListener(this);
        AboutDB=findViewById(R.id.id_AboutDB);
        AboutDB.setOnClickListener(this);

        ////////////////////////////////////////////

    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.id_Primary:
                i = new Intent(this, ActivStudentList.class);
                i.putExtra("key", "PrimaryStudent");
                startActivity(i);
                break;
            case R.id.id_MiddleStud:
                i = new Intent(this, ActivStudentList.class);
                i.putExtra("key", "Middle");
                startActivity(i);
                break;
            case R.id.id_SSCcStud:
                i = new Intent(this, ActivStudentList.class);
                i.putExtra("key", "SSC");
                startActivity(i);
                break;
            case R.id.id_Teacher:
                i = new Intent(this, ActivStudentList.class);
                i.putExtra("key", "Teacher");
                startActivity(i);
                break;
            case R.id.id_AboutDB:
                M_NotificationClass.MakeToast(this,"This Method Implemented Soon ");
                break;



        }
    }
}
