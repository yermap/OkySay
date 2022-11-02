package com.example.okysay

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
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
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val viewpager: ViewPager2 = view.findViewById(R.id.viewpager)
        viewpager.adapter = SliderAdapter(images)
        val recyclerView: RecyclerView = view.findViewById(R.id.recycler_books)
        recyclerView.adapter = BookAdapter(images)
    }

    companion object {
        private val images: Array<Int> =
            arrayOf(R.drawable.elon_musk, R.drawable.dc, R.drawable.elon_musk)
    }
}