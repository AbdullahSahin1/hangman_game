package com.example.myapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var falseCount=0
    private var gameOverFlag=true
    private lateinit var word:String
    private lateinit var targetWord:String
    private lateinit var indexes:MutableList<Int>
    private var randomNumber=0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}