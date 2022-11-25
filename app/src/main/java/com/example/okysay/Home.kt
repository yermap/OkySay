package com.example.okysay

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView


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
                image = R.drawable.dc,
                name = "Elon Musk",
            ),
            Genre(
                image = R.drawable.dc,
                name = "Elon Musk",
            ),
            Genre(
                image = R.drawable.dc,
                name = "Elon Musk",
            ),
            Genre(
                image = R.drawable.dc,
                name = "Elon Musk",
            ),
            Genre(
                image = R.drawable.dc,
                name = "Elon Musk",
            ), Genre(
                image = R.drawable.dc,
                name = "Elon Musk",
            ),
            Genre(
                image = R.drawable.dc,
                name = "Elon Musk",
            )
        )
    }
}