package com.example.contactsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class WorkActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work);

        final List<ContactModel> work = new ArrayList<>();
        work.add(new ContactModel("danush","danush@gmail.com","+918267951346",R.drawable.contact));
        work.add(new ContactModel("namit","namit@gmail.com","+918825951346",R.drawable.contact));
        work.add(new ContactModel("tarun","tarun@gmail.com","+918267982546",R.drawable.contact));
        work.add(new ContactModel("janardhan","janardhan@gmail.com","+918285282546",R.drawable.contact));
        work.add(new ContactModel("joshwa","joshwa@gmail.com","+918815282546",R.drawable.contact));
        work.add(new ContactModel("kamal","kamal@gmail.com","+918286242546",R.drawable.contact));
        work.add(new ContactModel("virat","virat@gmail.com","+918286852546",R.drawable.contact));
        work.add(new ContactModel("ramesh","ramesh@gmail.com","+918282852546",R.drawable.contact));
        work.add(new ContactModel("suresh","suresh@gmail.com","+918285858546",R.drawable.contact));

        RecyclerView work_recyclerView = findViewById(R.id.RecyclerView3);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        work_recyclerView.setLayoutManager(layoutManager);

        ContactAdapter contactAdapter = new ContactAdapter(this,work,R.color.work_color);
        work_recyclerView.setAdapter(contactAdapter);

    }




}