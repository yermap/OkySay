package com.example.okysay

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.okysay.databinding.ItemBookBinding


//data class Book(
//    val image: Int,
//    val name: String,
//    val author: String,
//)

class AdapterBook(
//    private val book: List<BookItemModel>,
    private val onItemClicked: (BookItemModel) -> Unit
) : RecyclerView.Adapter<AdapterBook.ViewHolder>() {

    private val mList = mutableListOf<BookItemModel>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterBook.ViewHolder {

//        return ViewHolder(
//            ItemBookBinding.inflate(
//                LayoutInflater
//                    .from(parent.context),
//                parent, false
//            )
//        )
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_book, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: AdapterBook.ViewHolder, position: Int) {
//        holder.bind(book[position])
        val model = mList[position]

        holder.itemAuthor.text = model.author
        holder.itemTitle.text = model.name
        holder.itemImage.setImageResource(model.image)
        holder.itemView.setOnClickListener {
            onItemClicked(model)
        }
    }


    override fun getItemCount(): Int {
        return mList.size
    }

    fun setData(newData: List<BookItemModel>) {
        mList.clear()
        mList.addAll(newData)
        notifyDataSetChanged()
    }

    inner class ViewHolder(itemView: View)
        : RecyclerView.ViewHolder(itemView) {
        var itemImage: ImageView
        var itemTitle: TextView
        var itemAuthor: TextView

        init {
            itemImage = itemView.findViewById(R.id.image_book)
            itemTitle = itemView.findViewById(R.id.text_book_name)
            itemAuthor = itemView.findViewById(R.id.text_book_author)
        }

//        fun bind(book: BookItemModel) {
////            binding.imageBook.setImageResource(book.image)
////            binding.textBookAuthor.text = book.author
////            binding.textBookName.text = book.name
//            binding.root.setOnClickListener {
//                onItemClicked(book)
//            }
//        }
    }
}