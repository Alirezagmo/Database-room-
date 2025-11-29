package com.example.myapplication;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "urls")
public class UrlEntity {

    @PrimaryKey(autoGenerate = true)
    public int id;

    public String musicUrl;

    public UrlEntity(String musicUrl) {
        this.musicUrl = musicUrl;
    }
}
