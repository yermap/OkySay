package com.example.okysay

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.okysay.databinding.ItemBookDescriptionBinding
import kotlinx.coroutines.NonDisposableHandle.parent


class AdapterBookDescription(
    private val onItemClicked: (BookInfoItemModel) -> Unit
) : RecyclerView.Adapter<AdapterBookDescription.ViewHolder>() {

    private val mList = mutableListOf<BookInfoItemModel>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterBookDescription.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_book_description, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: AdapterBookDescription.ViewHolder, position: Int) {
        val model = mList[position]

        holder.itemText.text = model.name
        holder.itemView.setOnClickListener {
            onItemClicked(model)
        }
    }

    override fun getItemCount(): Int {
        return mList.size
    }

    fun setData(bookDesc: List<BookInfoItemModel>) {
        mList.clear()
        mList.addAll(bookDesc)
        notifyDataSetChanged()
    }

    inner class ViewHolder(itemView: View)
        : RecyclerView.ViewHolder(itemView) {
        var itemText: TextView

        init {
            itemText = itemView.findViewById(R.id.neverEat)
        }
    }
}