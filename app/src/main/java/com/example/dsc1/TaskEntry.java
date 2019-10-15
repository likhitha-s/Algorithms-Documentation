package com.example.dsc1;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity (tableName = "task")
public class TaskEntry {

    @PrimaryKey (autoGenerate = true)
    private int id;
    private String name;
    private String description;
    private String algorithm;
}
