package com.example.okysay.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.okysay.AdapterGenre
import com.example.okysay.Genre
import com.example.okysay.R


class Home : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val recyclerView: RecyclerView = view.findViewById(R.id.recycler_genre)
        recyclerView.adapter = AdapterGenre(genres) { genre ->
            findNavController().navigate(R.id.hits)
        }
    }

    companion object {
        private val genres = listOf(
            Genre(
                image = R.drawable.bus,
                name = "Business-books",
            ),
            Genre(
                image = R.drawable.love,
                name = "Love novels",
            ),
            Genre(
                image = R.drawable.phychologggy,
                name = "Psychology",
            ),
            Genre(
                image = R.drawable.fairy,
                name = "Fairy tales",
            ),
            Genre(
                image = R.drawable.philosofy,
                name = "Philosophy",
            ), Genre(
                image = R.drawable.manga,
                name = "Manga",
            ),
            Genre(
                image = R.drawable.dc,
                name = "Comics",
            )
        )
    }
}