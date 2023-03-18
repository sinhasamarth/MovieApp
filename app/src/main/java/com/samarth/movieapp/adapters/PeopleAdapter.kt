package com.samarth.movieapp.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.samarth.movieapp.Constants
import com.samarth.movieapp.databinding.ItemRoundIconWithDescBinding
import com.samarth.movieapp.load
import com.samarth.movieapp.model.PeopleModel

class PeopleAdapter(
    private val listOfTrailer: List<PeopleModel> = Constants.castList
) : RecyclerView.Adapter<PeopleAdapter.SimpleViewHolder>() {
    inner class SimpleViewHolder(val binding: ItemRoundIconWithDescBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SimpleViewHolder {
        val binding =
            ItemRoundIconWithDescBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return SimpleViewHolder(binding)
    }

    override fun getItemCount() = listOfTrailer.size

    override fun onBindViewHolder(holder: SimpleViewHolder, position: Int) {
        listOfTrailer[position].apply {
            holder.binding.let {
                    it.imProfile.load(this.profileImageUrl)
                    it.tvTitle.text = this.name
                    it.tvDesc.text = this.desc
            }
        }
    }
}