package com.sum.activitylaunchmodes

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.v("create","onCreate A")
        button.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        button2.setOnClickListener{
            val intent = Intent(this,ActivityB::class.java)
            startActivity(intent)
        }
        button3.setOnClickListener{
            val intent = Intent(this,ActivityC::class.java)
            startActivity(intent)
        }
        button4.setOnClickListener{
            val intent = Intent(this,ActivityD::class.java)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.v("start","onStart A")
    }

    override fun onPause() {
        super.onPause()
        Log.v("pause","onPause A")
    }

    override fun onResume() {
        super.onResume()
        Log.v("resume","onResume A")
    }

    override fun onStop() {
        super.onStop()
        Log.v("Stop","onStop A")
    }

    override fun onRestart() {
        super.onRestart()
        Log.v("restart","onRestart A")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.v("destroy","onDestroy A")
    }

}