/**
 * Created by glenc on Nov 2021
 **/

package com.glencconnnect.usingroomdbjava.room_models;


import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "word_table")
public class Word {
    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "word")
    private String mWord;

    public Word(@NonNull String word){this.mWord = word;}

    public String getWord(){return this.mWord;}

}


