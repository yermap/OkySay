package com.example.okysay

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.okysay.databinding.ItemBookBinding


data class Book(
    val image: Int,
    val name: String,
    val author: String,
)

class AdapterBook(private val books: List<Book>) :
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
        holder.bind(books[position])
    }


    override fun getItemCount() = books.size

    class ViewHolder(
        private val binding: ItemBookBinding,
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(book: Book) {
            binding.imageBook.setImageResource(book.image)
            binding.textBookAuthor.text = book.author
            binding.textBookName.text = book.name
        }

    }


}