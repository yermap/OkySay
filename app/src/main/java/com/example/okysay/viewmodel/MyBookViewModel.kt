package com.example.okysay.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.okysay.Datasource

class MyBookViewModel : ViewModel() {
    private val _data = MutableLiveData<List<MyBookitemModel>>(emptyList())
    val data: LiveData<List<MyBookitemModel>> get() = _data
    private val myData = Datasource() // переменная для данных

    init {
        itemCount()
    }

    private fun itemCount() {
        _data.value = myData.loadMyBookItemModels() // данныйды шыгаруга указание
    }
}