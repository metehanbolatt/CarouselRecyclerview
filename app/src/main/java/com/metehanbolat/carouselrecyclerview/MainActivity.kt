package com.metehanbolat.carouselrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.jackandphantom.carouselrecyclerview.CarouselLayoutManager
import com.metehanbolat.carouselrecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val movieList = ArrayList<MovieModel>()
        movieList.add(MovieModel(R.drawable.batman, "Batman"))
        movieList.add(MovieModel(R.drawable.a_2012, "2012"))
        movieList.add(MovieModel(R.drawable.dune, "Dune"))
        movieList.add(MovieModel(R.drawable.knowing, "Knowing"))
        movieList.add(MovieModel(R.drawable.lastnightinsoho, "Last Night In Soho"))
        movieList.add(MovieModel(R.drawable.licorice, "Licorice Pizza"))
        movieList.add(MovieModel(R.drawable.moonfall, "Moonfall"))
        movieList.add(MovieModel(R.drawable.nightmarealley, "Nightmare Alley"))

        val adapter = MovieAdapter(movieList)

        binding.apply {
            carouselRecyclerview.adapter = adapter
            carouselRecyclerview.set3DItem(true)
            carouselRecyclerview.setAlpha(true)
            carouselRecyclerview.setInfinite(true)

            val carouselLayoutManager = carouselRecyclerview.getCarouselLayoutManager()
            val currentlyCenterPosition = carouselRecyclerview.getSelectedPosition()

            /*
            carouselRecyclerview.setItemSelectListener(object : CarouselLayoutManager.OnSelected {
                override fun onItemSelected(position: Int) {
                    Toast.makeText(this@MainActivity, movieList[position].name, Toast.LENGTH_SHORT).show()
                }
            })

             */

        }
    }
}