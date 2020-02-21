package com.medic.diagnosticdiabet;

import androidx.annotation.NonNull;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface DatabaseDiabetDao {
    @Query("SELECT * FROM DiabetInfo WHERE SurnamePatient= SurnamePatient")
    @NonNull
    DatabaseDiabet getByLogin(String login);

    @Query("SELECT * FROM DiabetInfo")
    List<DatabaseDiabet> getAll();

    @Insert
    void insert(DatabaseDiabet employee);

    @Update
    void update(DatabaseDiabet employee);

    @Delete
    void delete(DatabaseDiabet employee);
}
