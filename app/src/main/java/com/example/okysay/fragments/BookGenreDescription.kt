package com.example.okysay.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.okysay.R
import com.example.okysay.adapter.AdapterBookDescription
import com.example.okysay.adapter.BookDescription


class BookGenreDescription : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_book_info, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val recyclerView: RecyclerView = view.findViewById(R.id.recycler_books2)
        recyclerView.adapter = AdapterBookDescription(booksDescription)
    }

    companion object {
        private val booksDescription = listOf(
            BookDescription(
                image = R.drawable.we,
                name = "Think again",
                author = "Adam Grant",
                book_time = "7 h. 34 min."
            ),

        )
    }
}
