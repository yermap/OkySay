package com.example.okysay

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeBookViewModel : ViewModel() {
    private val _data = MutableLiveData<List<HomeBookItemModel>>(emptyList())
    val data: LiveData<List<HomeBookItemModel>> get() = _data
    private val myData = Datasource()

    init {
        itemCount()
    }

    private fun itemCount() {
        _data.value = myData.loadHomeBookItemModels()

    }
}