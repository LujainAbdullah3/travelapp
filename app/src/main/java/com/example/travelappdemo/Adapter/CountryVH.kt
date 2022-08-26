package com.example.travelappdemo.Adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.travelappdemo.Data.Country
import kotlinx.android.synthetic.main.item_country.view.*

class CountryVH(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val rootView = itemView.item_country_rootView
    private val name = itemView.item_country_nameTV
    private val city = itemView.item_country_cityTV
    private val imageView = itemView.item_country_imageView

    fun bind(country: Country, onItemClickListener: OnItemClickListener) {
        name.text = country.name
        city.text = country.city

        Glide.with(itemView).load(country.image).into(imageView)

        rootView.setOnClickListener {
            onItemClickListener.onIteClick(country, adapterPosition)

        }
    }

}