package com.hasan.coroutinesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.*
import kotlin.concurrent.timer

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var second = 0

        while (true) {
            CoroutineScope(Dispatchers.IO).launch {
                val answer = doNetwork()

                withContext(Dispatchers.Main) {
                    Log.v("PATIKA", answer)
                }
            }
            second+=1
            Log.v("SECOUND",second.toString())
        }
    }

    suspend fun doNetwork():String{
        delay(2000L)
        return "Network Answer Called"
    }
}