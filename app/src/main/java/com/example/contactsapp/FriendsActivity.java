package com.example.contactsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FriendsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friends);

        final List<ContactModel> friends = new ArrayList<>();
        friends.add(new ContactModel("Dinit","dinit@gmail.com","+918136458792",R.drawable.contact));
        friends.add(new ContactModel("Yashas","yashas@gmail.com","+918138548792",R.drawable.contact));
        friends.add(new ContactModel("jayshreyas","jayshreyas@gmail.com","+918136458872",R.drawable.contact));
        friends.add(new ContactModel("anirudh","anirudh@gmail.com","+918136458892",R.drawable.contact));
        friends.add(new ContactModel("abhishek","abhishek@gmail.com","+918136457792",R.drawable.contact));
        friends.add(new ContactModel("gavin","gavin@gmail.com","+918136455892",R.drawable.contact));
        friends.add(new ContactModel("hariprasad","hariprasad@gmail.com","+918136548792",R.drawable.contact));
        friends.add(new ContactModel("rohit","rohit@gmail.com","+918136458972",R.drawable.contact));
        friends.add(new ContactModel("chethan","chethan@gmail.com","+918136478792",R.drawable.contact));
        RecyclerView friends_recyclerView = findViewById(R.id.RecyclerView2);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        friends_recyclerView.setLayoutManager(layoutManager);

        ContactAdapter contactAdapter = new ContactAdapter(this,friends,R.color.friends_color);
        friends_recyclerView.setAdapter(contactAdapter);
    }
}