package com.example.okysay

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2


class Hits : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_hits, container, false)
//        val bookInfo: Button = view.findViewById(R.id.image_book)
//
//        bookInfo.setOnClickListener {
//            val fragment = bookInfo()
//            val transaction = fragmentManager?.beginTransaction()
//            transaction?.replace(R.id.image_book, fragment)?.commit()
//        }
//        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val viewpager: ViewPager2 = view.findViewById(R.id.viewpager)
        viewpager.adapter = AdapterSlider(books.map{it.image})
        val recyclerView: RecyclerView = view.findViewById(R.id.recycler_books)
        recyclerView.adapter = AdapterBook(books)
    }

    companion object {
        private val books = listOf(
            Book(
                image = R.drawable.elon_musk,
                name = "Elon Musk",
                author = "Steve Jobs",
            ),
            Book(
                image = R.drawable.dc,
                name = "Elon Musk",
                author = "Steve Jobs",
            ),
            Book(
                image = R.drawable.elon_musk,
                name = "Elon Musk",
                author = "Steve Jobs",
            )
        )
//        private val images: Array<Int> =
//            arrayOf(R.drawable.elon_musk, R.drawable.dc, R.drawable.elon_musk)
    }
}