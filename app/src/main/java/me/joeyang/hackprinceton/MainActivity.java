package me.joeyang.hackprinceton;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Date;


public class MainActivity extends ActionBarActivity {

    TextView mWelcome;
    ListView mTasks;
    ArrayList<Task> tasks = new ArrayList<Task>();
    private User mainUser;
    private TaskAdapter mTaskAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String name = getIntent().getStringExtra("name");
        mainUser = new User(name);
        setContentView(R.layout.activity_main);
        mWelcome = (TextView) findViewById(R.id.welcome_text);
        mWelcome.setText("Hello, "+mainUser.getName());
        Task task = new Task(new Date(), true, "Do the thing", "Aileen");
        tasks.add(task);
        mTaskAdapter = new TaskAdapter(this, tasks);

        mTasks = (ListView) findViewById(R.id.lvTasks);

        mTasks.setAdapter(mTaskAdapter);



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
