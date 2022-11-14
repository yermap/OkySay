package com.example.okysay

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.example.okysay.databinding.FragmentHitsBinding


class Hits : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_hits, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val viewpager: ViewPager2 = view.findViewById(R.id.viewpager)
        viewpager.adapter = AdapterSlider(books.map{it.image})
        val recyclerView: RecyclerView = view.findViewById(R.id.recycler_books)
        recyclerView.adapter = AdapterBook(books) { book ->
            findNavController().navigate(R.id.bookInfo)
        }
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
    }
}