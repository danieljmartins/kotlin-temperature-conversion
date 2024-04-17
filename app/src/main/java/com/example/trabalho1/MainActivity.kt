package com.example.trabalho1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.trabalho1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.btnCalcular.setOnClickListener{

            val celcius = binding.editCelsius.text.toString().toDouble()

            val celsiusParaFahrenheit = (celcius * 9/5) + 32

            val celsiusParaKelvin = celcius + 273.15

            val kelvinParaFahrenheit = (celsiusParaKelvin - 273.15) * 9/5 + 32

            binding.conversao1.text = "$celsiusParaFahrenheit"
            binding.conversao2.text = "$celsiusParaKelvin"
            binding.conversao3.text = "$kelvinParaFahrenheit"
        }
    }
}
