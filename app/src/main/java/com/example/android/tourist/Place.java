package com.example.android.tourist;

public class Place {

    private int mImageResourceId;
    private String mPlaceName;
    private String mPlaceSummary;

    private int mPlaceImage1;
    private int mPlaceImage2;
    private int mPlaceImage3;
    private String mPlaceDescription;

    private double mLat;
    private double mLng;

    private String mAddress;
    private String mPhoneNo;


    public Place(int id, String placeName, String placeSummary, int placeImage1, int placeImage2,
                 int placeImage3, String placeDescription, double lat, double lng, String address, String phoneNo){
        mImageResourceId = id;
        mPlaceName = placeName;
        mPlaceSummary = placeSummary;
        mPlaceImage1 = placeImage1;
        mPlaceImage2 = placeImage2;
        mPlaceImage3 = placeImage3;
        mPlaceDescription = placeDescription;
        mLat = lat;
        mLng = lng;
        mAddress = address;
        mPhoneNo = phoneNo;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public String getPlaceName() {
        return mPlaceName;
    }

    public String getPlaceSummary(){
        return mPlaceSummary;
    }

    public int getPlaceImage1() {
        return mPlaceImage1;
    }

    public int getPlaceImage2() {
        return mPlaceImage2;
    }

    public int getPlaceImage3() {
        return mPlaceImage3;
    }

    public String getPlaceDescription() {
        return mPlaceDescription;
    }

    public double getLattitude() {
        return mLat;
    }

    public double getLongitude() {
        return mLng;
    }

    public String getAddress() {
        return mAddress;
    }

    public String getPhoneNo() {
        return mPhoneNo;
    }
}

