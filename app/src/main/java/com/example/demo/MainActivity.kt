package com.example.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button2.setOnClickListener {

            if(editText2.text.toString().equals("Harsh") && editText4.text.toString().equals("abc"))
                Toast.makeText(this, "Successfull...", Toast.LENGTH_SHORT).show();

            else
                Toast.makeText(this,"Unsuccessfull...", Toast.LENGTH_SHORT).show();
        }

    }
}
