package com.tuanha.test

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.tuanha.mylibrary.Library1Activity
import com.tuanha.mylibrary2.Library2
import com.tuanha.mylibrary2.Library2Activity
import com.tuanha.mylibrary3.Library3
import com.tuanha.mylibrary3.Library3Activity
import com.tuanha.mylibrary3.Library3Source
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Library2.init("token from app to library 1")

        Library3.init(object : Library3Source {

            override fun getToken(): String {
                return "token: ${UUID.randomUUID().toString()}"
            }

            override fun getBaseUrl(): String {
                return "base url"
            }

            override fun decode(data: String): String {
                return "decode $data"
            }
        })

        findViewById<View>(R.id.btn1).setOnClickListener {
            startActivity(Intent(this, Library1Activity::class.java))
        }

        findViewById<View>(R.id.btn2).setOnClickListener {
            startActivity(Intent(this, Library2Activity::class.java))
        }

        findViewById<View>(R.id.btn3).setOnClickListener {
            startActivity(Intent(this, Library3Activity::class.java))
        }
    }
}