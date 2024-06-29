package com.example.feedzieapp;
import android.widget.EditText;

import com.google.firebase.firestore.IgnoreExtraProperties;

@IgnoreExtraProperties
public class model {
    String name,type,description,userid,category;

    public model(EditText mFullName, EditText mFoodItem, String s, EditText mDescription, EditText mPhone) {
        // Empty constructor for Firestore deserialization
    }
    public model() {

    }


    public model(String name, String type, String description, String userid) {
        this.name = name;
        this.type = type;
        this.description = description;
        this.userid = userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {return  category; }
    public String getDocumentId() {
        return userid;
    }
}
