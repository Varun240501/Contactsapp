package com.example.contactsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

        final List<ContactModel> family = new ArrayList<>();
        family.add(new ContactModel("Deepak","deepak@gmail.com","+919485897621",R.drawable.contact));
        family.add(new ContactModel("Prajwal","prajwal@gmail.com","+919484897621",R.drawable.contact));
        family.add(new ContactModel("Meghraj","meghraj@gmail.com","+919454697621",R.drawable.contact));
        family.add(new ContactModel("Puneeth","puneeth@gmail.com,","+919484234621",R.drawable.contact));
        family.add(new ContactModel("Prithvi", "prithvi@gmail.com","+919487897621",R.drawable.contact));
        family.add(new ContactModel("Kiran","kiran@gmail.com","+919484896781",R.drawable.contact));
        family.add(new ContactModel("Sumanth","sumanth@gmail.com","+919497297621",R.drawable.contact));
        family.add(new ContactModel("Naresh","naresh@gmail.com","+919452147621",R.drawable.contact));
        family.add(new ContactModel("Darshan","darshan@gmail.com","+919488961621",R.drawable.contact));
        family.add(new ContactModel("Tarun","tarun@gmail.com","+919484597821",R.drawable.contact));
        family.add(new ContactModel("Shreyas","shreyas@gmail.com","+919469777621",R.drawable.contact));

        RecyclerView family_recyclerView = findViewById(R.id.RecyclerView1);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        family_recyclerView.setLayoutManager(layoutManager);

        ContactAdapter contactAdapter = new ContactAdapter(this,family,R.color.family_color);
        family_recyclerView.setAdapter(contactAdapter);
    }


}