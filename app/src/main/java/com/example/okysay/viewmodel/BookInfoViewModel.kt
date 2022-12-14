package com.example.okysay.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.okysay.Datasource

class BookInfoViewModel : ViewModel() {
    private val _data = MutableLiveData<List<BookInfoItemModel>>(emptyList())
    val data: LiveData<List<BookInfoItemModel>> get() = _data
    private val myData = Datasource() // переменная для данных

    init {
        itemCount()
    }

    private fun itemCount() {
        _data.value = myData.loadBookInfoItemModels() // данныйды шыгаруга указание
    }
}