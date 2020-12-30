package com.jienihou.skypalette.splashscreen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.jienihou.skypalette.R
import com.jienihou.skypalette.databinding.FragmentSplashScreenBinding

class SplashScreenFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentSplashScreenBinding>(
            inflater, R.layout.fragment_splash_screen, container, false
        )

        (activity as AppCompatActivity).supportActionBar?.setCustomView(R.layout.action_bar)
        (activity as AppCompatActivity).supportActionBar?.hide()

        binding.appStart.setOnClickListener {
            findNavController().navigate(R.id.action_splash_fragment_to_home_fragment)
        }
        return binding.root
    }
}