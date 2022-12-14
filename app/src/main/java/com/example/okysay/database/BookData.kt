package com.example.okysay.database

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class BookData(
    @PrimaryKey val bookId: Int,
    @NonNull @ColumnInfo(name = "book_image") val bookImage: Int,
    @NonNull @ColumnInfo(name = "text_name") val textName: String,
    @NonNull @ColumnInfo(name = "text_author") val textAuthor: String,
)
