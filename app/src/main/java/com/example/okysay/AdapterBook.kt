package com.example.okysay

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.okysay.databinding.ItemBookBinding


class AdapterBook(private val images: Array<Int>) :
    RecyclerView.Adapter<AdapterBook.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder(
            ItemBookBinding.inflate(
                LayoutInflater
                    .from(parent.context),
                parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(images[position])
    }


    override fun getItemCount() = images.size

    class ViewHolder(private val binding: ItemBookBinding,
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(imageResource: Int) {
            binding.imageBook.setImageResource(imageResource)
        }
    }


}