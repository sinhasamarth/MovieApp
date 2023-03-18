package com.samarth.movieapp.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.samarth.movieapp.Constants
import com.samarth.movieapp.databinding.ItemPosterBinding
import com.samarth.movieapp.load

class RecommendAdapter(
    private val listOfTrailer: List<String> = Constants.recommendMoviesImages
) : RecyclerView.Adapter<RecommendAdapter.SimpleViewHolder>() {
    inner class SimpleViewHolder(val binding: ItemPosterBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SimpleViewHolder {
        val binding =
            ItemPosterBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return SimpleViewHolder(binding)
    }

    override fun getItemCount() = listOfTrailer.size

    override fun onBindViewHolder(holder: SimpleViewHolder, position: Int) {
        listOfTrailer[position].apply {
            holder.binding.root.load(this)
        }
    }
}