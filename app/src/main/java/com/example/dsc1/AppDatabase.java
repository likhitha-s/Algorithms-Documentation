package com.example.dsc1;

import android.content.Context;
import android.util.Log;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {TaskEntry.class}, version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {

    private static final String LOG_TAG=AppDatabase.class.getSimpleName();
    private static final Object LOCK=new Object();
    private static final String DATABASE_NAME="Algorithms Documentation";
    private static AppDatabase sInstance;

    public static AppDatabase getInstance(Context context){

        if(sInstance==null){

            synchronized (LOCK){

                Log.d(LOG_TAG, "creating new db instance");
                sInstance = Room.databaseBuilder(context.getApplicationContext(),AppDatabase.class,AppDatabase.DATABASE_NAME).build();
            }
        }

        Log.d(LOG_TAG, "getting the db instance");
        return sInstance;
    }

    public abstract TaskDAO taskDao();
}
