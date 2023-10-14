package com.harsh.assessment_harsh

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import com.harsh.assessment_harsh.databinding.ActivityRefineBinding

class refine : AppCompatActivity() {

    lateinit var binding: ActivityRefineBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRefineBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.backButtonRefine.setOnClickListener {
            onBackPressed()
        }
        val spinner: Spinner = findViewById(R.id.dropdown_refine)
        ArrayAdapter.createFromResource(
            this,
            R.array.dropItems,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinner.adapter = adapter
        }
        val textWatcher = object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                binding.wordCounter.text = (count/250).toString()
            }

            @SuppressLint("SetTextI18n")
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                val textLength = binding.editTextRefine.length()
                binding.wordCounter.text = "$textLength/250"
            }

            override fun afterTextChanged(s: Editable?) {

            }

        }
        binding.editTextRefine.addTextChangedListener(textWatcher)


        var b1color = 1
        var b2color = 0
        var b3color = 0
        var b4color = 0
        var b5color = 0
        var b6color = 0
        var b7color = 0
        var b8color = 0
        binding.b1.setBackgroundColor(Color.parseColor("#143d59"))
        binding.b1.setTextColor(Color.parseColor("#FFFFFF"))
        binding.b1.setOnClickListener {
            b1color = changeColor(binding.b1,b1color)
        }
        binding.b2.setOnClickListener {
            b2color = changeColor(binding.b2,b2color)
        }
        binding.b3.setOnClickListener {
            b3color = changeColor(binding.b3,b3color)
        }
        binding.b4.setOnClickListener {
            b4color = changeColor(binding.b4,b4color)
        }
        binding.b5.setOnClickListener {
            b5color = changeColor(binding.b5,b5color)
        }
        binding.b6.setOnClickListener {
            b6color = changeColor(binding.b6,b6color)
        }
        binding.b7.setOnClickListener {
            b7color = changeColor(binding.b7,b7color)
        }
        binding.b8.setOnClickListener {
            b8color = changeColor(binding.b8,b8color)
        }

    }

    private fun changeColor(b: Button, bcolor: Int): Int {
        var colo = bcolor
        if(bcolor==0){
            b.setBackgroundColor(Color.parseColor("#143d59"))
            b.setTextColor(Color.parseColor("#FFFFFF"))
            colo =1
            return colo;
        }
        b.setBackgroundColor(Color.parseColor("#FFFFFF"))
        b.setTextColor(Color.parseColor("#143d59"))
        colo = 0
        return 0
    }


}

