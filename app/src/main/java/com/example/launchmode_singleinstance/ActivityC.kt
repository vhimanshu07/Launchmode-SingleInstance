package com.example.launchmode_singleinstance

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.util.Log
import android.view.View
import android.widget.Button

class ActivityC : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c)
        val button =findViewById<Button>(R.id.buttonC)
        button.setOnClickListener {
            startActivity(Intent(this, ActivityB::class.java))
        }
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Log.e("In C","onNewIntent")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("In C","onDestroy")
    }

    override fun onCreateView(name: String, context: Context, attrs: AttributeSet): View? {
        Log.e("In C","onCreateView")
        return super.onCreateView(name, context, attrs)

    }
    override fun onPause() {
        super.onPause()
        Log.e("In C","OnPause")
    }

    override fun onResume() {
        super.onResume()
        Log.e("In C","onResume")
    }

}