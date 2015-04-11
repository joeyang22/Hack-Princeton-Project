package me.joeyang.hackprinceton.Data;

import android.provider.BaseColumns;

/**
 * Created by joe on 15-04-11.
 */
public final class TaskContract {
    public TaskContract() {
    }

    public static abstract class TaskEntry implements BaseColumns {
        public static final String TABLE_NAME = "task";
        public static final String COLUMN_NAME_ENTRY_ID = "taskid";
        public static final String COLUMN_NAME_TITLE = "title";
        public static final String COLUMN_NAME_DATE = "date";
        public static final String COLUMN_NAME_DONE = "done";
        public static final String COLUMN_NAME_OWNER = "owner";

    }

}