package com.example.okysay

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NewBookViewModel : ViewModel() {
    private val _data = MutableLiveData<List<NewBookItemModel>>(emptyList())
    val data: LiveData<List<NewBookItemModel>> get() = _data
    private val myData = Datasource()

    init {
        itemCount()
    }

    private fun itemCount() {
        _data.value = myData.loadNewBookModels()

    }
}