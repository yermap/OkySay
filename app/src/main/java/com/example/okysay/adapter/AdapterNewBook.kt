package com.example.okysay.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.okysay.viewmodel.NewBookItemModel
import com.example.okysay.R


class AdapterNewBook(
    private val onItemClicked: (NewBookItemModel) -> Unit
) : RecyclerView.Adapter<AdapterNewBook.ViewHolder>() {

    private val mList = mutableListOf<NewBookItemModel>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_new_book, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val model = mList[position]

        holder.itemAuthor.text = model.author
        holder.itemTitle.text = model.name
        holder.itemImage.setImageResource(model.image)
        holder.itemButton.setOnClickListener{
            onItemClicked(model)
        }
        holder.itemView.setOnClickListener {
            onItemClicked(model)
        }
    }


    override fun getItemCount(): Int {
        return mList.size
    }

    fun setData(newData: List<NewBookItemModel>) {
        mList.clear()
        mList.addAll(newData)
        notifyDataSetChanged()
    }

    inner class ViewHolder(itemView: View)
        : RecyclerView.ViewHolder(itemView) {
        var itemImage: ImageView
        var itemTitle: TextView
        var itemAuthor: TextView
        var itemButton: Button

        init {
            itemImage = itemView.findViewById(R.id.image_new_book)
            itemTitle = itemView.findViewById(R.id.text_new_book_name)
            itemAuthor = itemView.findViewById(R.id.text_new_book_author)
            itemButton = itemView.findViewById(R.id.button)
        }
    }
}