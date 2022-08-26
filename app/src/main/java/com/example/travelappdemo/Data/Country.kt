package com.example.travelappdemo.Data

import android.net.Uri
import android.os.Parcelable
import android.widget.Button
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Country(
    val name: String,
    val city: String,
    val image: Int,
    val hot: String,
    val uri: String
):Parcelable



