package com.sum.activitylaunchmodes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class ActivityC : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView.text = "Activity C"
        Log.v("create","onCreate C")
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
        Log.v("start","onStart C")
    }

    override fun onPause() {
        super.onPause()
        Log.v("pause","onPause C")
    }

    override fun onResume() {
        super.onResume()
        Log.v("resume","onResume C")
    }

    override fun onStop() {
        super.onStop()
        Log.v("Stop","onStop C")
    }

    override fun onRestart() {
        super.onRestart()
        Log.v("restart","onRestart C")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.v("destroy","onDestroy C")
    }
}