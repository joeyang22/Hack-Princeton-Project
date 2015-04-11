package me.joeyang.hackprinceton;

import java.util.ArrayList;

/**
 * Created by joe on 15-04-11.
 */
public class User {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private ArrayList<Task> tasks;
    private String name;

    public User(String name){
        tasks = new ArrayList<Task>();
        this.name = name;
    }
}
