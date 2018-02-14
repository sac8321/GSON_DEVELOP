package com.example.jorge_pc.httprequest;

import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Created by JORGE-PC on 13/02/2018.
 */

public class Town {


    private int id;
    private City city;

    public Town(){}

    public Town(int id, City city) {
        this.id = id;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public static City parseJSON(String response){
        Gson gson = new GsonBuilder().create();
        City city = gson.fromJson(response,City.class);
        return city;
    }

}
