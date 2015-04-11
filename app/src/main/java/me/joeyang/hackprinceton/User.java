package me.joeyang.hackprinceton;

import java.util.ArrayList;

/**
 * Created by joe on 15-04-11.
 */
public class User {

    private ArrayList<Task> tasks;
    private String name;

    public User(String name){
        tasks = new ArrayList<Task>();
        this.name = name;
    }
}
