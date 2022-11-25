package com.example.okysay

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.viewpager2.widget.ViewPager2
import com.example.okysay.databinding.FragmentHitsBinding


class Hits : Fragment() {
    private var _binding: FragmentHitsBinding? = null
    private val binding get() = _binding!!

    private val viewModel: BookViewModel by viewModels()
    private var adapter: AdapterBook? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
//        return inflater.inflate(R.layout.fragment_hits, container, false)
        _binding = FragmentHitsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(itemView: View, savedInstanceState: Bundle?) {
        super.onViewCreated(itemView, savedInstanceState)
        val viewpager: ViewPager2 = itemView.findViewById(R.id.viewpager)
        viewpager.adapter = AdapterSlider(books.map{it.image})
//        val recyclerView: RecyclerView = itemView.findViewById(R.id.recycler_books)
//        recyclerView.adapter = AdapterBook(books) { book ->
//            findNavController().navigate(R.id.bookInfo)
//        }
        adapter = AdapterBook { model ->
            this@Hits.findNavController().navigate(R.id.bookInfo)
        }
        binding.recyclerBooks.adapter = adapter
        binding.recyclerBooks.setLayoutManager(GridLayoutManager(activity, 2))
        viewModel.data.observe(viewLifecycleOwner) {
                newCount ->
            if (newCount != null) {
                adapter?.setData(newCount)
            }
        }
    }

    companion object {
        private val books = listOf(
            BookItemModel(
                image = R.drawable.elon_musk,
                name = "Elon Musk",
                author = "Steve Jobs",
            ),
            BookItemModel(
                image = R.drawable.dc,
                name = "Elon Musk",
                author = "Steve Jobs",
            ),
            BookItemModel(
                image = R.drawable.elon_musk,
                name = "Elon Musk",
                author = "Steve Jobs",
            )
        )
    }
}