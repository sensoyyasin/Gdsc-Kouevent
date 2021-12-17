package com.example.hangifriendskarakterisin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var karakterText : TextView = findViewById(R.id.karakterText)
        var karakterImage : ImageView = findViewById(R.id.karakterImage)
        var karakterButton : Button = findViewById(R.id.karakterButton)

        karakterImage.setImageResource(R.drawable.friendslogo)

        karakterButton.setOnClickListener(){
            var randomSayi = (1..6).random()
            //Toast.makeText(this, "Karakter Seçiliyor!" , Toast.LENGTH_SHORT).show()

            when(randomSayi){
                1-> {karakterImage.setImageResource(R.drawable.monica);karakterText.text = "Monica" }
                2-> {karakterImage.setImageResource(R.drawable.joey);karakterText.text = "joey" }
                3-> {karakterImage.setImageResource(R.drawable.rachel);karakterText.text = "rachel" }
                4-> {karakterImage.setImageResource(R.drawable.chandler);karakterText.text = "chandler" }
                5-> {karakterImage.setImageResource(R.drawable.ross);karakterText.text = "ross" }
                6-> {karakterImage.setImageResource(R.drawable.phoebe);karakterText.text = "phoebe" }
            }
        }
    }
}