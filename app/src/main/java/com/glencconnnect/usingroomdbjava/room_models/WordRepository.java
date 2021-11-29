/**
 * Created by glenc on Nov 2021
 **/

package com.glencconnnect.usingroomdbjava.room_models;


import android.app.Application;

import androidx.lifecycle.LiveData;

import java.util.List;

public class WordRepository {
    private WordDao mWordDao;
    private LiveData<List<Word>> mAllWords;

    public WordRepository(Application application){
        WordRoomDatabase db = WordRoomDatabase.getDatabase(application);
        mWordDao = db.wordDao();
        mAllWords = mWordDao.getAlphabetizedWords();
    }

    public LiveData<List<Word>> getAllWords(){
        return mAllWords;
    }

    public void insert(Word word){
        WordRoomDatabase.databaseWriterService.execute(()->{
            mWordDao.insert(word);
        });
    }
}



