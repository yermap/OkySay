package com.example.okysay

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import java.nio.file.Files.size

class AdapterSlider(
    private val onItemClicked: (SliderItemModel) -> Unit
) : RecyclerView.Adapter<AdapterSlider.ImageViewHolder>() {

    private val mList = mutableListOf<SliderItemModel>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterSlider.ImageViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_slider_image, parent, false)
        return ImageViewHolder(v)
    }

    override fun onBindViewHolder(holder: AdapterSlider.ImageViewHolder, position: Int) {
        val model = mList[position]

        holder.itemImage.setImageResource(model.image_slider)
        holder.itemView.setOnClickListener {
            onItemClicked(model)
        }
    }

    override fun getItemCount(): Int {
        return mList.size
    }

    fun setData(newData: List<SliderItemModel>) {
        mList.clear()
        mList.addAll(newData)
        notifyDataSetChanged()
    }

    inner class ImageViewHolder(itemView: View)
        : RecyclerView.ViewHolder(itemView) {
        var itemImage: ImageView

        init {
            itemImage = itemView.findViewById(R.id.slider_image)
        }
    }
}