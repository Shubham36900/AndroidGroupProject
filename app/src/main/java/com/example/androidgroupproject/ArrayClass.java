package com.example.androidgroupproject;

public class ArrayClass {


    private String longitude;
    private String latitude;
    private long id;
    private String date;
    private String url;

    public ArrayClass(String longitude, String latitude , String url, String date, long id){
        this.longitude = longitude;
        this.latitude = latitude;
        this.id = id;
        this.date = date;
        this.url =url;

    }
    public ArrayClass(String lat,String longi, String url,String date) {
        this(lat, longi , url, date,0);
    }

    public  String getLatitude() {
        return latitude;
    }

    public  String getLongitude() {
        return longitude;
    }

    public long getId() {
        return id;
    }

    public  String getDate() {
        return date;
    }

    public  String getUrl() {
        return url;
    }
    //shubham
}

