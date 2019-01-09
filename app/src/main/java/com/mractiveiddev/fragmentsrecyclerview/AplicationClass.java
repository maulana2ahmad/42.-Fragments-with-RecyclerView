package com.mractiveiddev.fragmentsrecyclerview;

import android.app.Application;

import java.util.ArrayList;

public class AplicationClass extends Application
{
    public static ArrayList<Person> people;

    @Override
    public void onCreate() {
        super.onCreate();

        people = new ArrayList<Person>();

        people.add(new Person("Maulana Ahmad", "082210551999"));
        people.add(new Person("Ahmad", "082210551999"));
        people.add(new Person("Maulana", "082210551999"));
        people.add(new Person("Mdul", "082210551999"));
    }
}
