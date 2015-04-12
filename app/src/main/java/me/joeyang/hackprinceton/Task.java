package me.joeyang.hackprinceton;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Task {

    private Date finishDate = new Date();
    private boolean done = false;
    private String title;
    private String user;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Task(Date date, boolean done, String title, String user){
        this.finishDate = date;
        this.done = done;
        this.title = title;
        this.user = user;

    }

    public static String getSimpleDateFormat (Date date){
        return new SimpleDateFormat("yyyyMMdd_HHmmss").format(date);
    }
    public Date getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(Date finishDate) {
        this.finishDate = finishDate;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
