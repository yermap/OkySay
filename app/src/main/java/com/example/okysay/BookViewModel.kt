package com.example.okysay

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class BookViewModel : ViewModel() {
    private val _data = MutableLiveData<List<BookItemModel>>(emptyList())
    val data: LiveData<List<BookItemModel>> get() = _data


    init {
        itemCount()
    }

    private fun itemCount() {
        for (i in 1..20) {
            _data.value = _data.value?.plus((
                    BookItemModel(
                        R.drawable.elon_musk, "Steve Jobs", "Elon Musk" + i,
                        )
                    )
            ) as ArrayList<BookItemModel>?
        }
    }
}