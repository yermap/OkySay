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

    fun loadNewBookModels(): List<NewBookItemModel> {
        return listOf<NewBookItemModel>(
            NewBookItemModel(R.drawable._666018271_49, "Наумовна.Начало", "Нина Князькова"),
            NewBookItemModel(R.drawable.serdse, "Северного Ликана", "Мария Ерова "),
            NewBookItemModel(R.drawable.msg_1305588499_1633, "Токсичный позитив", "Уитни Гудман "),
            NewBookItemModel(R.drawable.msg_1305588499_1634, "Мандалы женской силы", "Регина Жиляева "),
            NewBookItemModel(R.drawable.gresia, "Книга первая. Жить!", "Мария Ерова"),
            NewBookItemModel(R.drawable.povel, "Повелитель Хаоса", "Александр Светлый"),
            NewBookItemModel(R.drawable.msg_1305588499_1635, "13 осколков личности.", "Егор Горд"),
            NewBookItemModel(R.drawable.msg_1305588499_1636, "Воля к смыслу.", "В. Франкл"),


            )}
            
    fun loadHomeBookItemModels(): List<HomeBookItemModel> {
        return listOf<HomeBookItemModel>(
            HomeBookItemModel(R.drawable.bus, "Business-books"),
            HomeBookItemModel(R.drawable.love, "Love novels"),
            HomeBookItemModel(R.drawable.phychologggy, "Psychology"),
            HomeBookItemModel(R.drawable.fairy, "Fairy tales"),
            HomeBookItemModel(R.drawable.philosofy, "Philosophy"),
            HomeBookItemModel(R.drawable.manga, "Manga"),
            HomeBookItemModel(R.drawable.dc, "Comics"),
        )
    }

    fun loadMyBookItemModels(): List<MyBookitemModel> {
        return listOf<MyBookitemModel>(
            MyBookitemModel(R.drawable.never, "Кейт Феррацци", "Никогда не ешьте в одиночку"),
            MyBookitemModel(R.drawable.weeks, "Брайан Моран,Майкл Леннингтон", "12 недель в году"),
            MyBookitemModel(R.drawable.minutes, "Питер Брегман", "18 минут"),
        )
    }
}