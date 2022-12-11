package com.example.okysay.viewmodel

import android.app.Application
import androidx.lifecycle.*
import com.example.okysay.Datasource
import com.example.okysay.R
import com.example.okysay.database.BookData
import com.example.okysay.database.BookDatabaseDao
import com.example.okysay.formatBooks
import kotlinx.coroutines.launch

class BookViewModel(
    val database: BookDatabaseDao,
    application: Application) : AndroidViewModel(application) {

    init {

        loadInitialBooks()
    }
        private val _data = MutableLiveData<List<BookItemModel>>(emptyList())
        val data: LiveData<List<BookItemModel>> get() = _data
        private val myData = Datasource()

        private val books = database.getAllBooks()
        val booksString = Transformations.map(books) { books ->
            formatBooks(books, application.resources)
        }

        private var book = MutableLiveData<BookData?>()
        private suspend fun getBookFromDatabase(): BookData? {
            var book = database.getBook()
            if (book?.textName != book?.textAuthor) {
                book = null
            }
            return book
        }

    fun loadInitialBooks() {
        viewModelScope.launch {
            val newBook = BookData(1, R.drawable.dc, "Elon Musk", "Steve Jobs")
            insert(newBook)
            book.value = getBookFromDatabase()
        }
    }


    private suspend fun insert(book: BookData) {
        database.insert(book)
    }

            init {
//            itemCount()
                initializeBook()
            }

            //        private fun itemCount() {
//            _data.value = myData.loadBookItemModels()
//        }
            private fun initializeBook() {
                viewModelScope.launch {
                    book.value = getBookFromDatabase()
                }
            }
}