package com.example.personalinfonote;

import androidx.room.Dao;
import androidx.room.Insert;

@Dao
public interface PersonDao {

    @Insert
    void addPerson(Person person);
}
