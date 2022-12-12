package com.example.okysay

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.okysay.databinding.FragmentBookInfoBinding
import com.example.okysay.databinding.FragmentMyBooksBinding


class bookInfo : Fragment() {
    private var _binding: FragmentBookInfoBinding? = null
    private val binding get() = _binding!!

    private val viewModel: BookInfoViewModel by viewModels() // giving the value
    private var adapter: AdapterBookDescription? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding =  FragmentBookInfoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(itemView: View, savedInstanceState: Bundle?) {
        super.onViewCreated(itemView, savedInstanceState)
        adapter = AdapterBookDescription { model ->
            this@bookInfo.findNavController().navigate(R.id.bookInfo)
        }
        binding.recyclerBooksInfo.adapter = adapter
        binding.recyclerBooksInfo.setLayoutManager(LinearLayoutManager(activity))
        viewModel.data.observe(viewLifecycleOwner) {
            bookInfo ->
            if (bookInfo != null) {
                adapter?.setData(bookInfo)
            }
        }
    }
}