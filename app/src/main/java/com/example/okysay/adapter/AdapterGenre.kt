package com.example.okysay.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.okysay.R
import com.example.okysay.databinding.ItemGenreBinding
import com.example.okysay.viewmodel.HomeBookItemModel


class AdapterGenre(
    private val onItemClicked: (HomeBookItemModel) -> Unit
) : RecyclerView.Adapter<AdapterGenre.ViewHolder>() {

    private val mList = mutableListOf<HomeBookItemModel>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterGenre.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_genre, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: AdapterGenre.ViewHolder, position: Int) {
        val model = mList[position]

        holder.itemTitle.text = model.name
        holder.itemImage.setImageResource(model.image)
        holder.itemView.setOnClickListener {
            onItemClicked(model)
        }
    }


    override fun getItemCount(): Int {
        return mList.size
    }

    fun setData(newData: List<HomeBookItemModel>) {
        mList.clear()
        mList.addAll(newData)
        notifyDataSetChanged()
    }

    inner class ViewHolder(itemView: View)
        : RecyclerView.ViewHolder(itemView) {
        var itemImage: ImageView
        var itemTitle: TextView

        init {
            itemImage = itemView.findViewById(R.id.image_genre)
            itemTitle = itemView.findViewById(R.id.text_book_genre)
        }
    }
}