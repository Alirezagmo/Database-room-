package com.example.myapplication;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface UrlDao {

    @Insert
    void insertUrl(UrlEntity urlEntity);

    @Query("SELECT * FROM urls")
    List<UrlEntity> getAllUrls();
}
