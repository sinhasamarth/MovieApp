package com.samarth.movieapp

import android.graphics.Color
import android.view.View
import android.widget.ImageView
import android.widget.ImageView.ScaleType
import com.bumptech.glide.Glide
import com.samarth.movieapp.databinding.ItemTcWithBgBinding
import com.samarth.movieapp.model.TagsModel

fun ImageView.load(url: String, scaleType: ScaleType = ScaleType.CENTER_CROP) {


    Glide.with(this)
        .load(url)
        .override(this.height, this.width)
        .error(android.R.drawable.stat_notify_error)
        .into(this)
    this.scaleType = scaleType
}

fun String.getColor(): Int {
    return Color.parseColor(this)
}

fun ItemTcWithBgBinding.initData(model: TagsModel) {
    this.apply {
        tvTag.text = model.name
        cv.setCardBackgroundColor(model.color.getColor())
    }
}

fun View.visibleIt() {
    this.visibility = View.VISIBLE
}

fun View.gone() {
    this.visibility = View.GONE
}