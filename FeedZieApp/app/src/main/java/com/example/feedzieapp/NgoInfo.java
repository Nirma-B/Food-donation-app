package com.example.feedzieapp;
public class NgoInfo {

    private String mNgoName;
    private int mImageResourceId;
    private String mNgoInfo;


    public NgoInfo(String NgoName,String ngoInfo,int ImageResource){
        mNgoName = NgoName;
        mNgoInfo = ngoInfo;
        mImageResourceId = ImageResource;
    }



    public String getNgoName(){
        return mNgoName;
    }

    public String getNgoInfo(){
        return mNgoInfo;
    }

    public int getImageResourceId(){ return mImageResourceId; }

}
