package com.example.myapplication.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.myapplication.R;
import com.example.myapplication.models.Contact;

import java.util.ArrayList;
import java.util.List;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ViewHolder> {
    private List<Contact> mContact;

    public ContactAdapter(List<Contact> mContacts) {
        this.mContact = mContacts;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        //meghubungkan item_contact.xml ke adapter
        Context context = viewGroup.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View contactView = inflater.inflate(R.layout.item_contact, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(contactView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        Contact itemContact = mContact.get(i);
        TextView textView = viewHolder.nameTextView;
        textView.setText(itemContact.getmName());

        Button buttonContact = viewHolder.messageButton;
        buttonContact.setText(itemContact.getmName());
        buttonContact.setEnabled(itemContact.isOnline());
//menghubungkan item atau missing item
    }

    @Override
    public int getItemCount() {
        return mContact.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView nameTextView;
        private Button messageButton;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nameTextView = itemView.findViewById(R.id.contact_name);

        }
    }
}
