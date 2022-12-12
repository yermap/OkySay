package com.example.okysay

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.okysay.databinding.ItemMyBooksBinding


class AdapterMyBooks(
    private val onItemClicked: (MyBookitemModel) -> Unit
) : RecyclerView.Adapter<AdapterMyBooks.ViewHolder>() {

    private val mList = mutableListOf<MyBookitemModel>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterMyBooks.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_my_books, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: AdapterMyBooks.ViewHolder, position: Int) {
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

    fun setData(newMyBook: List<MyBookitemModel>) {
        mList.clear()
        mList.addAll(newMyBook)
        notifyDataSetChanged()
    }

    inner class ViewHolder(itemView: View)
        : RecyclerView.ViewHolder(itemView) {
        var itemImage: ImageView
        var itemTitle: TextView
        var itemAuthor: TextView

        init {
            itemImage = itemView.findViewById(R.id.image_my_books)
            itemTitle = itemView.findViewById(R.id.text_my_books_name)
            itemAuthor = itemView.findViewById(R.id.text_my_books_author)
        }
    }
}