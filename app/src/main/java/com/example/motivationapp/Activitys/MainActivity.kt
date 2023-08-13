package com.example.motivationapp.Activitys

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.core.content.ContextCompat
import com.example.motivationapp.Data.Mock
import com.example.motivationapp.Infra.MotivationConstants
import com.example.motivationapp.R
import com.example.motivationapp.SecurityPreferences
import com.example.motivationapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityMainBinding
    private var filter: Int = MotivationConstants.PHRASEFILTER.ALL

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupUI()
        setupListeners()
    }

    override fun onClick(view: View) {
        when (view.id) {
            R.id.button_new_phrase -> handleNextPhrase()
            R.id.image_all_inclusive, R.id.image_sunny, R.id.image_happy -> handleFilter(view.id)
        }
        showImage()
    }

    private fun setupUI() {
        val name = SecurityPreferences(this).getString(SecurityPreferences.KEY.USER_NAME)
        binding.textUserName.text = getString(R.string.hello_message, name)
        handleNextPhrase()
        showImage()
    }

    private fun showImage(){
        if (Mock().getPhrase(filter).category ==  MotivationConstants.PHRASEFILTER.HAPPY){
            binding.imageMain.setImageResource(R.drawable.ic_happy)
        }else if (Mock().getPhrase(filter).category ==  MotivationConstants.PHRASEFILTER.SUNNY){
            binding.imageMain.setImageResource(R.drawable.ic_sunny)
        }
    }

    private fun setupListeners() {
        binding.buttonNewPhrase.setOnClickListener(this)
        binding.imageHappy.setOnClickListener(this)
        binding.imageSunny.setOnClickListener(this)
        binding.imageAllInclusive.setOnClickListener(this)
    }


    private fun handleFilter(id: Int) {
        resetFilterUI()
        val filterMap = mapOf(
            R.id.image_all_inclusive to MotivationConstants.PHRASEFILTER.ALL,
            R.id.image_sunny to MotivationConstants.PHRASEFILTER.SUNNY,
            R.id.image_happy to MotivationConstants.PHRASEFILTER.HAPPY
        )

        filterMap[id]?.let { selectedFilter ->
            filter = selectedFilter
            val imageView = findViewById<ImageView>(id)
            imageView.setColorFilter(ContextCompat.getColor(this, R.color.white))
        }
    }

    private fun resetFilterUI() {
        binding.imageAllInclusive.setColorFilter(ContextCompat.getColor(this, R.color.dark_purple))
        binding.imageSunny.setColorFilter(ContextCompat.getColor(this, R.color.dark_purple))
        binding.imageHappy.setColorFilter(ContextCompat.getColor(this, R.color.dark_purple))
    }


    private fun handleNextPhrase() {
        binding.textPhrase.text = Mock().getPhrase(filter).description
    }
}