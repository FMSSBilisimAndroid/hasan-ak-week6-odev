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
        
        //infinite loop created.
        while (true) {
            //the operation takes place on the IO thread.
            CoroutineScope(Dispatchers.IO).launch {
                val answer = doNetwork()
                //Observing on MainThread 
                withContext(Dispatchers.Main) {
                    Log.v("PATIKA", answer)
                }
            }
            //The secound variable increments by one each time the loop returns.
            second+=1
            Log.v("SECOUND",second.toString())
        }
    }
    //this function is used by coroutinescope and its task returns the specified string with 2 seconds delay. 
    suspend fun doNetwork():String{
        delay(2000L)
        return "Network Answer Called"
    }
}
