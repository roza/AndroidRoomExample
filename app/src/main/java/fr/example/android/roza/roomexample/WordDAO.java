package fr.example.android.roza.roomexample;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import java.util.List;

/**
 * Created by roza on 20/02/18.
 */

@Dao
public interface WordDao {

    @Insert
    void insert(Word word);

    @Insert(onConflict = OnConflictStrategy.REPLACE)

    @Query("DELETE FROM word_table")
    void deleteAll();

    @Query("SELECT * from word_table ORDER BY word ASC")
    LiveData<List<Word>> getAllWords();
    //List<Word> getAllWords();

}