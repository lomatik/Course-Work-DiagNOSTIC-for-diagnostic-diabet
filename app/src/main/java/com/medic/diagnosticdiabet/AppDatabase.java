package com.medic.diagnosticdiabet;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {DatabaseDiabet.class}, version = 1, exportSchema=false)
public abstract class AppDatabase extends RoomDatabase {
    public abstract DatabaseDiabetDao DatabaseDiabetDao();
}
