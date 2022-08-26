package com.example.travelappdemo.Adapter

import com.example.travelappdemo.Data.Country

interface OnItemClickListener {

    fun onIteClick(country: Country, position: Int)

}
