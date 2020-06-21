package com.example.challenge_fragmentsandrecyclerview;

import android.app.Application;

import java.util.ArrayList;

public class ApplicationClass extends Application
{
public  static ArrayList<Car> cars;
    @Override
    public void onCreate() {
        super.onCreate();

        cars=new ArrayList<Car>();
        cars.add(new Car("volkswagen","Polo","Vithika ","23487856374"));
        cars.add(new Car("nissan","ewrwe","Vartika","3454655465"));
        cars.add(new Car("mercedes","erwtet","Harsh","345465765"));
        cars.add(new Car("volkswagen","Polo","Ajay","434546546567"));
        cars.add(new Car("nissan","Nayara","Ruchi","32453546"));
        cars.add(new Car("volkswagen","Polo","Vithika ","23487856374"));
        cars.add(new Car("nissan","ewrwe","Vartika","3454655465"));
        cars.add(new Car("mercedes","erwtet","Harsh","345465765"));
        cars.add(new Car("volkswagen","Polo","Ajay","434546546567"));
        cars.add(new Car("nissan","Nayara","Ruchi","32453546"));



    }
}
