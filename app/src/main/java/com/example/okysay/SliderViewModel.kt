package com.example.okysay

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SliderViewModel : ViewModel() {
    private val _data = MutableLiveData<List<SliderItemModel>>(emptyList())
    val data: LiveData<List<SliderItemModel>> get() = _data
    private val myData = Datasource()

    init {
        itemCount()
    }

    private fun itemCount() {
        _data.value = myData.loadSliderImageModels()
    }
}