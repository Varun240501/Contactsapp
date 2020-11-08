package com.example.contactsapp;

public class ContactModel {

    String name,email,phno;
    int imagResId;

    public  ContactModel(String mName,String mEmail,String mPhno,int mImagresId){
        this.name = mName;
        this.email = mEmail;
        this.phno = mPhno;
        this.imagResId = mImagresId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhno() {
        return phno;
    }

    public void setPhno(String phno) {
        this.phno = phno;
    }

    public int getImagResId() {
        return imagResId;
    }

    public void setImagResId(int imagResId) {
        this.imagResId = imagResId;
    }
}
