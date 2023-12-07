package com.example.mdan6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mdan6.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.plusBtn.setOnClickListener {
            val firstNummber = binding.firstNumberedt.text.toString().toInt()
            val secondNummber = binding.secondNumbertxt.text.toString().toInt()
            binding.resultTv.text = "${firstNummber+secondNummber}"
        }
        binding.minusBtn.setOnClickListener {
            val firstNummber = binding.firstNumberedt.text.toString().toInt()
            val secondNummber = binding.secondNumbertxt.text.toString().toInt()
            binding.resultTv.text = "${firstNummber-secondNummber}"
        }
        binding.multiply.setOnClickListener {
            val firstNummber = binding.firstNumberedt.text.toString().toInt()
            val secondNummber = binding.secondNumbertxt.text.toString().toInt()
            binding.resultTv.text = "${firstNummber*secondNummber}"
        }
        binding.devide.setOnClickListener {
            val firstNummber = binding.firstNumberedt.text.toString().toInt()
            val secondNummber = binding.secondNumbertxt.text.toString().toInt()
            binding.resultTv.text = "${firstNummber/secondNummber}"
        }
    }
}