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

    fun loadBookInfoItemModels(): List<BookInfoItemModel> {
        return listOf<BookInfoItemModel>(
            BookInfoItemModel("\"Книга, написанная Кейтом рассказывает читателю, как расширить круг общения в современном мире. Автор поднимает проблему сознательной замкнутости, которая мешает человеку реализоваться.По мнению Феррацци, добиться большого успеха можно совместными усилиями. Проявляя интерес к другим, человек получит поддержку в ответ. Книга придется по вкусу тем, кто ищет способы развить коммуникативные навыки и применить их для достижения собственных целей.\n" +
                    "\n" + "Содержание:\n" +
                    "-Важен каждый человек\n" +
                    "-Брать меньше, отдавать больше\n" +
                    "-Вижу цель, не вижу препятствий\n" +
                    "-Стучитесь — и вам откроют\n" +
                    "-Поиск нужных контактов\n" +
                    "-Никогда не ешьте в одиночку\n" +
                    "-Организовывайте конференции\n" +
                    "-Перевоплощение знакомых в друзей\n" +
                    "-Коммуникация с общительными людьми\n" +
                    "-Создание себя, как бренда\n" +
                    "\n" + "\n" +
                    "Год издания:    Объем:    Время прочтения:\n" +
                    "2009          432 стр.    28 часов\n" +
                    "\n" + "\n" + "\n")
        )
    }
}