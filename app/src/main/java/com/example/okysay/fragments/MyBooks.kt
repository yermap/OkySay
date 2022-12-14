package com.example.okysay.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.okysay.R
import com.example.okysay.adapter.AdapterMyBooks
import com.example.okysay.databinding.FragmentMyBooksBinding
import com.example.okysay.viewmodel.MyBookViewModel

class MyBooks : Fragment() {
    private var _binding: FragmentMyBooksBinding? = null
    private val binding get() = _binding!!

    private val viewModel: MyBookViewModel by viewModels() // giving the value
    private var adapter: AdapterMyBooks? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding =  FragmentMyBooksBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(itemView: View, savedInstanceState: Bundle?) {
        super.onViewCreated(itemView, savedInstanceState)

        adapter = AdapterMyBooks { model ->
            this@MyBooks.findNavController().navigate(R.id.bookInfo) //link to bookinfo
        }
        binding.recyclerMyBooks.adapter = adapter
        binding.recyclerMyBooks.setLayoutManager(LinearLayoutManager(activity))
        viewModel.data.observe(viewLifecycleOwner) {
            newMyBook ->
            if (newMyBook != null) {
                adapter?.setData(newMyBook)
            }
        }
    }
}