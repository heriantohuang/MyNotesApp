package com.halsh.mynotesapp.db;

import android.provider.BaseColumns;

/**
 * Created by halsh on 10/29/2017.
 */

public class DatabaseContract {
    static String TABLE_NOTE = "note";
    static final class NoteColumns implements BaseColumns {
        //Note title
        static String TITLE = "title";
        //Note description
        static String DESCRIPTION = "description";
        //Note date
        static String DATE = "date";
    }
}
