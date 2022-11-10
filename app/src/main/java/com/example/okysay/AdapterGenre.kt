package com.example.okysay

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.okysay.databinding.ItemGenreBinding


data class Genre(
    val image: Int,
    val name: String,
)

class AdapterGenre(private val genre: List<Genre>) :
    RecyclerView.Adapter<AdapterGenre.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder(
            ItemGenreBinding.inflate(
                LayoutInflater
                    .from(parent.context),
                parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(genre[position])
    }


    override fun getItemCount() = genre.size

    class ViewHolder(
        private val binding: ItemGenreBinding,
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(genre: Genre) {
            binding.imageGenre.setImageResource(genre.image)
            binding.textBookGenre.text = genre.name
        }

    }


}