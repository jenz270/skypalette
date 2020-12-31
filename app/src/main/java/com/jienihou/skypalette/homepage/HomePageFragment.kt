package com.jienihou.skypalette.homepage

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.jienihou.skypalette.R
import com.jienihou.skypalette.databinding.FragmentHomePageBinding
import com.jienihou.skypalette.util.TopSpacingItemDecoration

private const val TAG = "HomePageFragment"

class HomePageFragment : Fragment() {
    //private val homePageAdapter =  HomePageAdapter()
    private lateinit var spinner : ProgressBar

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentHomePageBinding>(
            inflater, R.layout.fragment_home_page, container, false
        )

        (activity as AppCompatActivity).supportActionBar?.setDisplayShowCustomEnabled(true)
        (activity as AppCompatActivity).supportActionBar?.show()

        spinner = binding.spinner

        binding.rvHomePage.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(context)
            //adapter = homePageAdapter
            val spacingDecoration = TopSpacingItemDecoration(resources.getInteger(R.integer.list_item_padding))
            addItemDecoration(spacingDecoration)
        }

        return binding.root
    }
}