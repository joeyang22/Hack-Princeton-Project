package me.joeyang.hackprinceton;

import java.util.Date;

public class Task {
    private Date finishDate = new Date();
    private boolean done = false;
    private String title;

    public Task(Date date, boolean done, String title){
        this.finishDate = date;
        this.done = done;
        this.title = title;

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
