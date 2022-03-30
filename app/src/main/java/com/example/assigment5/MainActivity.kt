package com.example.assigment5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonAddImage=findViewById<Button>(R.id.button)as Button
        val buttonNextPage= findViewById<Button>(R.id.button2) as Button
        val imagePhoto=findViewById<View>(R.id.imageView) as ImageView
        val list=findViewById(R.id.list) as ListView
        val names= arrayOf("Furkan Yaman","Ahmet kök","Faik Yula","Ahmet Conta","Raif Orbay")
        val  arrayAdapter:ArrayAdapter<String> =ArrayAdapter(this,android.R.layout.simple_list_item_1,names)
        list.adapter=arrayAdapter

        buttonAddImage.setOnClickListener {
          imagePhoto.setBackgroundResource(R.drawable.spiderman)


       }
        // Intent activity
        buttonNextPage.setOnClickListener {
            val   intent= Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }

       list.setOnItemClickListener { adapterView, view, i, l ->
           Toast.makeText(this,"Item Selected"+ names[i],Toast.LENGTH_SHORT).show()

       }


    }


}