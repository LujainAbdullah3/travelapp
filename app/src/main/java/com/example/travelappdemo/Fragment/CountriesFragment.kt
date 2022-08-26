package com.example.travelappdemo.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.travelappdemo.*
import com.example.travelappdemo.Adapter.CountriesAdapter
import com.example.travelappdemo.Adapter.OnItemClickListener
import com.example.travelappdemo.Data.CountriesDataSource
import com.example.travelappdemo.Data.Country
import kotlinx.android.synthetic.main.fragment_countries.*



class CountriesFragment : Fragment(), OnItemClickListener {

    private val adapter = CountriesAdapter(CountriesDataSource.createCountriesList())

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_countries, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpRecyclerView()
    }

    private fun setUpRecyclerView() {
        countries_rc.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = this@CountriesFragment.adapter
        }
        adapter.setOnItemClickListener(this)
    }

    override fun onIteClick(country: Country, position: Int) {
        val bundle = bundleOf("country" to country)
        findNavController().navigate(
            R.id.action_countriesFragment_to_countryDetailsFragment,bundle)
    }
}