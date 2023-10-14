package com.harsh.assessment_harsh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.harsh.assessment_harsh.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.refineButton.setOnClickListener {
            val intent = Intent(this, refine::class.java)
            startActivity(intent)
        }
    }

}
