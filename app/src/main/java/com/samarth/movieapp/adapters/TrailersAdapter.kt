package com.samarth.movieapp.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.samarth.movieapp.databinding.ItemTrailerBinding
import com.samarth.movieapp.load
import com.samarth.movieapp.model.TrailerModels

class TrailersAdapter(
    private val listOfTrailer: List<TrailerModels>
) : RecyclerView.Adapter<TrailersAdapter.SimpleViewHolder>() {
    inner class SimpleViewHolder(val binding: ItemTrailerBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SimpleViewHolder {
        val binding = ItemTrailerBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return SimpleViewHolder(binding)
    }

    override fun getItemCount() = listOfTrailer.size

    override fun onBindViewHolder(holder: SimpleViewHolder, position: Int) {
        listOfTrailer[position].apply {
            holder.binding.let {
                it.imBanner.load(this.thumbnailImageUrl)
                it.tvDesc.text = this.bottomText
            }
        }
    }
}