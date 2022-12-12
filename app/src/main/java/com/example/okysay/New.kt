package com.example.okysay

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.example.okysay.databinding.FragmentNewBinding


class New : Fragment() {
    private var _binding: FragmentNewBinding? = null
    private val binding get() = _binding!!

    private val viewModel: NewBookViewModel by viewModels()
    private var adapter: AdapterNewBook? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentNewBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(itemView: View, savedInstanceState: Bundle?) {
        super.onViewCreated(itemView, savedInstanceState)

        adapter = AdapterNewBook { model ->
            this@New.findNavController().navigate(R.id.newType)
        }
        binding.recyclerNewBooks.adapter = adapter
        binding.recyclerNewBooks.setLayoutManager(GridLayoutManager(activity, 2))
        viewModel.data.observe(viewLifecycleOwner) {
                newBook ->
            if (newBook != null) {
                adapter?.setData(newBook)
            }
        }
    }
}