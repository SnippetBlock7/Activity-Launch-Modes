package com.sum.activitylaunchmodes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class ActivityD : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView.text = "Activity D"
        Log.v("create","onCreate D")
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
        Log.v("start","onStart D")
    }

    override fun onPause() {
        super.onPause()
        Log.v("pause","onPause D")
    }

    override fun onResume() {
        super.onResume()
        Log.v("resume","onResume D")
    }

    override fun onStop() {
        super.onStop()
        Log.v("Stop","onStop D")
    }

    override fun onRestart() {
        super.onRestart()
        Log.v("restart","onRestart D")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.v("destroy","onDestroy D")
    }
}