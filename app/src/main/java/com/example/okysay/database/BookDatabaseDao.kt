package com.example.okysay.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface BookDatabaseDao {

    @Insert
    suspend fun insert(image: BookData)

    @Update
    suspend fun update(image: BookData)

    @Query("SELECT * from bookdata WHERE bookId = :key")
    suspend fun get(key: Long): BookData?

    @Query("DELETE FROM bookdata")
    suspend fun clear()

    @Query("SELECT * FROM bookdata ORDER BY bookId DESC LIMIT 1")
    suspend fun getBook(): BookData?

    @Query("SELECT * FROM bookdata ORDER BY bookId DESC")
    fun getAllBooks(): LiveData<List<BookData>>
}