package com.example.okysay.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.okysay.viewmodel.BookItemModel
import com.example.okysay.R
import com.example.okysay.database.BookData


class AdapterBook(
    private val onItemClicked: (BookItemModel) -> Unit
) : RecyclerView.Adapter<AdapterBook.ViewHolder>() {

    private val mList = mutableListOf<BookItemModel>()

    override fun onCreateViewHolder(
        parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_book, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
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

//    private fun bind(holder: ViewHolder, item: BookItemModel) {
//        val model = holder.itemView.context.resources
//        holder.itemAuthor.text = model.author
//        holder.itemTitle.text = model.name
//        holder.itemImage.setImageResource(model.image)
//        holder.itemView.setOnClickListener {
//            onItemClicked(model)
//        }
//    }


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
    }
}