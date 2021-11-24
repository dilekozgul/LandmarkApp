package com.dilekozgul.landmarkapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dilekozgul.landmarkapp.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val intent = intent

        //   val selectedLandmark = intent.getSerializableExtra("landmark") as Landmark
        val selectedLandmark = MySingleton.chosenLandmark


        selectedLandmark?.let {
            binding.tvLandmarkName.text = it.name
            binding.tvLandmarkCountry.text=it.country
            binding.imageView.setImageResource(it.image)
        }













    }
}