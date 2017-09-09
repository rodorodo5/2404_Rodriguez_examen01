package com.example.rodo.examen01.models;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by rodo on 9/8/17.
 */

public class Customer implements Parcelable {

    private String cust_name;

    private String operations;

    public Customer(String cust_name, String operations) {
        this.cust_name = cust_name;
        this.operations = operations;

    }

    public Customer(Parcel in){
        cust_name = in.readString();
        operations =  in.readString();
    }



    public String getCustomers() {
        return cust_name;
    }

    public void setCustomerName(String cust_name) {
        this.cust_name = cust_name;
    }


    public String getOperations() {
        return operations;
    }

    public void setOperations(String operations) {
        this.operations = operations;
    }





    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    private String genre;

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    private String releaseDate;

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(cust_name);
        dest.writeString(operations);


    }

    public static final Parcelable.Creator CREATOR = new Parcelable.Creator(){
        public Customer createFromParcel (Parcel in){
            return new Customer (in);
        }

        public Customer[] newArray(int size){
            return new Customer[size];
        }
    };
}
