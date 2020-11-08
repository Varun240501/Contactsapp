package com.example.contactsapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ContactViewholder> {

    private Context context;
    private List<ContactModel> contactModelList;
    private int colorResId;

    public ContactAdapter(Context context,List<ContactModel> list,int colorResId){
        this.context = context;
        this.contactModelList = list;
        this.colorResId = colorResId;
    }

    @NonNull
    @Override
    public ContactViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.list_item,parent,false);
        ContactViewholder contactViewholder = new ContactViewholder(view);

        return contactViewholder;
    }

    @Override
    public void onBindViewHolder(@NonNull ContactViewholder contactViewholder, int position) {
        contactViewholder.Name.setText(contactModelList.get(position).getName());
        contactViewholder.Email.setText(contactModelList.get(position).getEmail());
        contactViewholder.PhNo.setText(contactModelList.get(position).getPhno());
        contactViewholder.image.setImageResource(contactModelList.get(position).getImagResId());
        int color = ContextCompat.getColor(context, colorResId);
        contactViewholder.textContainer.setBackgroundColor(color);

    }

    @Override
    public int getItemCount() {
        return contactModelList.size();
    }

    class ContactViewholder extends RecyclerView.ViewHolder{

        TextView Name,Email,PhNo;
        ImageView image;
        View textContainer;

        public ContactViewholder(@NonNull View itemView) {
            super(itemView);
            Name = itemView.findViewById(R.id.tv1);
            Email = itemView.findViewById(R.id.tv2);
            PhNo = itemView.findViewById(R.id.tv3);
            image = itemView.findViewById(R.id.image1);
            textContainer = itemView.findViewById(R.id.text_container);
        }
    }


}
