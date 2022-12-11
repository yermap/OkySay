package com.example.okysay

import android.content.res.Resources
import android.text.Spanned
import com.example.okysay.database.BookData
import com.example.okysay.viewmodel.BookItemModel

//
//fun convertImageToString(quality: Int, resources: Resources) : String {}
//    var qualityString =

//fun formatBooks(books: List<BookData>, resources: Resources) : Spanned {
//    val sb = StringBuilder()
//}

fun formatBooks(books: List<BookData>, resources: Resources): List<BookItemModel> {
    return listOf<BookItemModel>(
        BookItemModel(R.drawable.elon_musk, "Elon Musk", "Steve Jobs"),
        BookItemModel(R.drawable.dc, "Jeff Bezos", "Mark Zuckerberg"),

        )
}