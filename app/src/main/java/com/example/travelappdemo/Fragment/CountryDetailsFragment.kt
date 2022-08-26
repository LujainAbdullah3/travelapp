package com.example.travelappdemo.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.fragment_country_details.*
import android.content.Intent
import android.net.Uri
import com.example.travelappdemo.Data.Country
import com.example.travelappdemo.R

class CountryDetailsFragment : Fragment() {
    private lateinit var country: Country

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        country = arguments?.getParcelable("country")!!
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_country_details, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Glide.with(this).load(country.image).into(imageView2)
        textView2.text = country.name
        textView3.text = country.hot


        loction.setOnClickListener {
            val openURL = Intent(android.content.Intent.ACTION_VIEW)
            val f = country.name
            openURL.data = Uri.parse(country.uri)
            startActivity(openURL)
        }

        imageView2.setOnClickListener {
            findNavController().popBackStack()
        }

    }
}