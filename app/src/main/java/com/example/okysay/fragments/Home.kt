package com.example.okysay.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.example.okysay.R
import com.example.okysay.adapter.AdapterGenre
import com.example.okysay.databinding.FragmentHomeBinding
import com.example.okysay.viewmodel.HomeBookViewModel


class Home : Fragment() {
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    private val viewModel: HomeBookViewModel by viewModels()
    private var adapter: AdapterGenre? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(itemView: View, savedInstanceState: Bundle?) {
        super.onViewCreated(itemView, savedInstanceState)
        adapter = AdapterGenre { model ->
            this@Home.findNavController().navigate(R.id.bookGenreDescription)
        }
        binding.recyclerGenre.adapter = adapter
        binding.recyclerGenre.setLayoutManager(GridLayoutManager(activity, 1))
        viewModel.data.observe(viewLifecycleOwner) {
                newGenre ->
            if (newGenre != null) {
                adapter?.setData(newGenre)
            }
        }
    }


}