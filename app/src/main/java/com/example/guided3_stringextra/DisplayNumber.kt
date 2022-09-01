package com.example.guided3_stringextra

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DisplayNumber : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_display_number)

        val intent: Intent = intent
        val message: String? = intent.getStringExtra("inputanAngka")

        //Membuat Text View
        val textView = TextView(this)
        textView.setTextSize(40F)
        textView.setText("Anda yang anda inputkan adalah "+message)

        setContentView(textView)
    }
}