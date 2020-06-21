package com.example.challenge_fragmentsandrecyclerview;

public class Car {
    public Car(String make, String model, String ownername, String ownernumber) {
        this.make = make;
        this.model = model;
        this.ownername = ownername;
        this.ownernumber = ownernumber;
    }

    private String make;
    private  String model;
    private String ownername;
    private String ownernumber;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOwnername() {
        return ownername;
    }

    public void setOwnername(String ownername) {
        this.ownername = ownername;
    }

    public String getOwnernumber() {
        return ownernumber;
    }

    public void setOwnernumber(String ownernumber) {
        this.ownernumber = ownernumber;
    }


}
