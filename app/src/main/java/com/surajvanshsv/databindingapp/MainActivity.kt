package com.surajvanshsv.databindingapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import com.surajvanshsv.databindingapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
//        setContentView(R.layout.activity_main)

        //use data binding util to set the content view with data binding
        binding = DataBindingUtil.setContentView(
            this,R.layout.activity_main
        )


        // Accessing binding Views
        var v1 = Vehicle()
        v1.name = "BMW"
        v1.modelYear = "2024"
        binding.myVehicle = v1


        // binding click handlers
        binding.clickHandler = VehicleClickListner(this)



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}