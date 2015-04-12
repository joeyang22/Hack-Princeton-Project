package me.joeyang.hackprinceton;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by joe on 15-04-11.
 */
public class TaskAdapter extends ArrayAdapter<Task> {
    ArrayList<Task> tasks;


    public TaskAdapter(Context context, ArrayList<Task> tasks) {
        super(context, 0, tasks);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        Task task = getItem(position);
        if (convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.task_partial, parent, false);

        }
        TextView title = (TextView) convertView.findViewById(R.id.txtTitle);
        TextView user = (TextView) convertView.findViewById(R.id.txtUser);
        TextView date = (TextView) convertView.findViewById(R.id.txtDate);
        CheckBox finished = (CheckBox) convertView.findViewById(R.id.checkComplete);

        title.setText(task.getTitle());
        user.setText(task.getUser());
        date.setText(Task.getSimpleDateFormat(task.getFinishDate()));

        finished.setChecked(task.isDone());

        return convertView;

    }
}
