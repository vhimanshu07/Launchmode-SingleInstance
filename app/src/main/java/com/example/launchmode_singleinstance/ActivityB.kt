package com.example.launchmode_singleinstance

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.util.Log
import android.view.View
import android.widget.Button

class ActivityB : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)
        val button =findViewById<Button>(R.id.buttonB)
        button.setOnClickListener {
            startActivity(Intent(this, ActivityC::class.java))
        }
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Log.e("In B","onNewIntent")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("In B","onDestroy")
    }

    override fun onCreateView(name: String, context: Context, attrs: AttributeSet): View? {
        Log.e("In B","onCreateView")
        return super.onCreateView(name, context, attrs)

    }
    override fun onPause() {
        super.onPause()
        Log.e("In B","OnPause")
    }

    override fun onResume() {
        super.onResume()
        Log.e("In B","onResume")
    }
}