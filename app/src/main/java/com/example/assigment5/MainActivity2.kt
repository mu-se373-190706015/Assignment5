package com.example.assigment5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu

import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
     val btn=findViewById<Button>(R.id.button3)as Button



        btn.setOnClickListener {
            intent= Intent(this,MainActivity::class.java)
            startActivity(intent)

        }



    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menuoption,menu)

        return true
    }

}