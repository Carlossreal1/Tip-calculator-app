package com.example.tipsapp

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tipsapp.databinding.ActivityMainBinding
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
      binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var percentage = 0
        binding.rb15.setOnCheckedChangeListener { _, isChecked ->
            println("José opcao 1 : $isChecked")
            if (isChecked){
                percentage = 10
            }
        }

        binding.rb18.setOnCheckedChangeListener { _, isChecked ->
            println("José opcao 2 : $isChecked")
            if (isChecked){
                percentage = 15
            }
        }

        binding.rb20.setOnCheckedChangeListener { _, isChecked ->
            println("José opcao 3: $isChecked")
            if (isChecked){
                percentage = 20
            }
        }


        binding.btnClean.setOnClickListener {
            println("José " + binding.tieTotal.text.toString())
            println("Brunella " + binding.tieNumPeople.text.toString())
        }


        binding.btnCalculate.setOnClickListener {
            val totalTable: Float = binding.tieTotal.text.toString().toFloat()
            val numPeople: Float = binding.tieNumPeople.text.toString().toFloat()

            val totalTemp = totalTable / numPeople
            val tips = totalTemp * percentage / 100
            val totalWithTip = totalTemp + tips

            println("José total com gorjeta " + totalWithTip)

        }
    }
}
