package com.example.okysay

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView


class New : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_new, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val recyclerView: RecyclerView = view.findViewById(R.id.recycler_new_books)
        recyclerView.adapter = AdapterNewBook(newBook) {
            findNavController().navigate(R.id.newType)
        }
    }

    companion object {
        private val newBook = listOf(
            NewBook(
                image = R.drawable._666018271_49,
                name = "Наумовна.Начало",
                author = "Нина Князькова",
            ),
            NewBook(
                image = R.drawable._666018271_49,
                name = "Наумовна.Начало",
                author = "Нина Князькова",
            ),
            NewBook(
                image = R.drawable._666018271_49,
                name = "Наумовна.Начало",
                author = "Нина Князькова",
            )
        )
//        private val images: Array<Int> =
//            arrayOf(R.drawable.elon_musk, R.drawable.dc, R.drawable.elon_musk)
    }
}