package com.example.okysay

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import kotlin.time.Duration.Companion.minutes


class MyBooks : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_my_books, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val recyclerView: RecyclerView = view.findViewById(R.id.recycler_my_books)
        recyclerView.adapter = AdapterMyBooks(myBooks) { myBook ->
            findNavController().navigate(R.id.bookInfo)
        }
    }

    companion object {
        private val myBooks = listOf(
            MyBook(
                image = R.drawable.never,
                myBookName = "Кейт Феррацци",
                myBookAuthor = "Никогда не ешьте в одиночку",
            ),
            MyBook(
                image = R.drawable.weeks,
                myBookName = "Брайан Моран,Майкл Леннингтон",
                myBookAuthor = "12 недель в году",
            ),
            MyBook(
                image = R.drawable.minutes,
                myBookName = "Питер Брегман",
                myBookAuthor = "18 минут",
            ),
        )
    }
}