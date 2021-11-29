/**
 * Created by glenc on Nov 2021
 **/

package com.glencconnnect.usingroomdbjava.view_model;


import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.glencconnnect.usingroomdbjava.room_models.Word;
import com.glencconnnect.usingroomdbjava.room_models.WordRepository;

import java.util.List;

public class WordViewModel  extends AndroidViewModel {
    private WordRepository mRepository;
    private final LiveData<List<Word>> mAllWords;


    public WordViewModel(@NonNull Application application) {
        super(application);
        mRepository = new WordRepository(application);
        mAllWords = mRepository.getAllWords();
    }

    LiveData<List<Word>> getAllWords() {
        return mAllWords;
    }

    public void insert(Word word){
        mRepository.insert(word);
    }
}


