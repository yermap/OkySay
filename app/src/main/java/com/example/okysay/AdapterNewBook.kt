package com.example.okysay

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.okysay.databinding.ItemNewBookBinding


data class NewBook(
    val image: Int,
    val name: String,
    val author: String,
)

class AdapterNewBook(private val newBooks: List<NewBook>) :
    RecyclerView.Adapter<AdapterNewBook.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder(
            ItemNewBookBinding.inflate(
                LayoutInflater
                    .from(parent.context),
                parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(newBooks[position])
    }


    override fun getItemCount() = newBooks.size

    class ViewHolder(
        private val binding: ItemNewBookBinding,
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(newBook: NewBook) {
            binding.imageNewBook.setImageResource(newBook.image)
            binding.textNewBookAuthor.text = newBook.author
            binding.textNewBookName.text = newBook.name
        }

    }


}