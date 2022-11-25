package com.example.okysay

class Datasource {

    fun loadBookItemModels(): List<BookItemModel> {
        return listOf<BookItemModel>(
            BookItemModel(R.drawable.elon_musk, "Elon Musk", "Steve Jobs"),
            BookItemModel(R.drawable.dc, "Jeff Bezos", "Mark Zuckerberg"),

        )
    }

    fun loadSliderImageModels(): List<SliderItemModel> {
        return listOf<SliderItemModel>(
            SliderItemModel(R.drawable.elon_musk),
            SliderItemModel(R.drawable.dc),
            SliderItemModel(R.drawable.elon_musk),
        )
    }
}