package com.example.okysay

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView


class bookInfo : Fragment() {

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
                image = R.drawable.elon_musk,
                name = "Elon Musk",
                author = "Steve Jobs",
                book_time = "4 h. 18 min."
            ),
        )
    }
}