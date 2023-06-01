package com.example.data_binding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.data_binding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Inflate the layout using DataBindingUtil
        // Das Layout mit DataBindingUtil aufblasen
        val binding : ActivityMainBinding = DataBindingUtil.setContentView(this ,R.layout.activity_main)

        // Perform additional initialization tasks here
        // Führen Sie hier zusätzliche Initialisierungsaufgaben aus

binding.counting = "Counter"
        var counter =0

        binding.textView.text = counter.toString()

        binding.button.setOnClickListener {
            if (counter < 10 ){
                counter++
               binding.textView.text = counter.toString()
            }
            else {
                binding.button.visibility = View.GONE
            binding.counting = "END"

            }
        }


    }
}