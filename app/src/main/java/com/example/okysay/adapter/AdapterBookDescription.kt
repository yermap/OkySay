package com.example.okysay.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.okysay.databinding.ItemBookDescriptionBinding


data class BookDescription(
    val image: Int,
    val name: String,
    val author: String,
    val book_time: String,
)

class AdapterBookDescription(
    private val bookDescription: List<BookDescription>,
) :
    RecyclerView.Adapter<AdapterBookDescription.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder(
            ItemBookDescriptionBinding.inflate(
                LayoutInflater
                    .from(parent.context),
                parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(bookDescription[position])
    }


    override fun getItemCount() = bookDescription.size

    inner class ViewHolder(
        private val binding: ItemBookDescriptionBinding,
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(bookDescription: BookDescription) {
            binding.imageBook2.setImageResource(bookDescription.image)
            binding.textBookAuthor2.text = bookDescription.author
            binding.textBookName2.text = bookDescription.name
            binding.textBookTime.text = bookDescription.book_time
        }
    }
}