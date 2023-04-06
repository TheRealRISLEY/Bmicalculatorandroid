package com.example.bmicalculatorrisley

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var display_bmi:TextView
    private lateinit var enter_weight:EditText
    private lateinit var enter_height:EditText
    private lateinit var button_calculate:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        display_bmi = findViewById(R.id.bmidisplay)
        enter_weight = findViewById(R.id.insertweight)
        enter_height = findViewById(R.id.insertheight)
        button_calculate = findViewById(R.id.bmibutton)


        button_calculate.setOnClickListener {
            var weight = enter_weight.text.toString().trim()
            var height = enter_height.text.toString().trim()


            if (weight.isEmpty() || height.isEmpty()){
                Toast.makeText(this, "Invalid Input", Toast.LENGTH_SHORT).show()

            }else{
                var result = weight.toDouble() / (height.toDouble() *  height.toDouble())
                display_bmi.text = result.toString()

            }



        }

    }
}