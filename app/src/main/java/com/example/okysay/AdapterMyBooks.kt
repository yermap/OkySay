package com.example.okysay

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.okysay.databinding.ItemMyBooksBinding


data class MyBook(
    val image: Int,
    val myBookName: String,
    val myBookAuthor: String,
)

class AdapterMyBooks(
    private val myBook: List<MyBook>,
    private val onItemClicked: (item: MyBook) -> Unit,
) :
    RecyclerView.Adapter<AdapterMyBooks.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder(
            ItemMyBooksBinding.inflate(
                LayoutInflater
                    .from(parent.context),
                parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(myBook[position])
    }


    override fun getItemCount() = myBook.size

    inner class ViewHolder(
        private val binding: ItemMyBooksBinding,
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(myBook: MyBook) {
            binding.imageMyBooks.setImageResource(myBook.image)
            binding.textMyBooksName.text = myBook.myBookName
            binding.textMyBooksAuthor.text = myBook.myBookAuthor
            binding.button.setOnClickListener {
                onItemClicked(myBook)
            }
            binding.root.setOnClickListener {
                onItemClicked(myBook)
            }
        }
    }
}