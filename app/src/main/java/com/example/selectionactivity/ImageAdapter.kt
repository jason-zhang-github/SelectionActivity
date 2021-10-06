package com.example.selectionactivity

import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
// import android.view.View.onClickListener

class ImageAdapter (val _images : Array<Item>, val _click : View.OnClickListener) : RecyclerView.Adapter<ImageAdapter.ViewHolder>()
{

    val images = _images
    val click = _click

    class ViewHolder(_view : ImageView, ocl : View.OnClickListener)
    {
        val imageView = _view.apply { setOnClickListener(ocl)}
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder
    {
        return ViewHolder(ImageView(parent.context).apply {layoutParams = ViewGroup.LayoutParams(300,300)}, click)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int)
    {
        holder.imageView.setImageResource(images[position] .resourceID)
    }

    override fun getItemCount(): Int
    {
        return images.size
    }
}