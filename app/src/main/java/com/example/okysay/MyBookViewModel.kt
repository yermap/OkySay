package com.example.okysay

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyBookViewModel : ViewModel() {
    private val _data = MutableLiveData<List<MyBookitemModel>>(emptyList())
    val data: LiveData<List<MyBookitemModel>> get() = _data
    private val myData = Datasource()

    init {
        itemCount()
    }

    private fun itemCount() {
        _data.value = myData.loadMyBookItemModels()
    }
}