package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Adapter;

import com.example.myapplication.Adapter.ContactAdapter;
import com.example.myapplication.models.Contact;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Contact> contacts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rv = (RecyclerView) findViewById(R.id.rvContacts);
        contacts = Contact.createContactList(10);
        ContactAdapter contactAdapter = new ContactAdapter(contacts);
        rv.setAdapter(contactAdapter);
        rv.setLayoutManager(new LinearLayoutManager(this));
    }
}
