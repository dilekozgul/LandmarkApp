package com.dilekozgul.landmarkapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.dilekozgul.landmarkapp.databinding.ActivityDetailBinding
import com.dilekozgul.landmarkapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    lateinit var landmarkList:ArrayList<Landmark>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        landmarkList= ArrayList<Landmark>()


        var pisa=Landmark("Pisa","Italy",R.drawable.pisa)
        var eiffel = Landmark("Eiffel", "France",R.drawable.eiffel)
        var colesseum = Landmark("Colesseum", "Italy",R.drawable.colesseum)
        var londonBridge = Landmark("LondonBridge", "UK",R.drawable.londonbridge)

        landmarkList.add(pisa)
        landmarkList.add(eiffel)
        landmarkList.add(colesseum)
        landmarkList.add(londonBridge)


        binding.recyclerview.layoutManager= LinearLayoutManager(this)
        val landmarkAdapter = LandmarkAdapter(landmarkList)
        binding.recyclerview.adapter=landmarkAdapter

    }
}