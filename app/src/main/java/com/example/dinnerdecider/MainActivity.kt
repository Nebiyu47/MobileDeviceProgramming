package com.example.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toolbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val food :MutableList<String> = mutableListOf("Hamburger", "Pizza","Mexican", "American", "Chinese")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       button.setOnClickListener{
           food.add(msg.text.toString())
       }
       generateFood()

    }
    private fun generateFood(){
        button2.setOnClickListener{
            val random=(0 until (food.size)).random()
            humburg.text=food[random]
            val random1=(0 until (food.size)).random()
            image.setImageResource(R.drawable.image)
            image.setImageResource(R.drawable.image2)
            image.setImageResource(R.drawable.image3)
            image.setImageResource(R.drawable.image4)
            image.setImageResource(R.drawable.image5)



        }
    }

}