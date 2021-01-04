package com.example.birthdaygreeting

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.birthdaygreeting.R
import kotlinx.android.synthetic.main.activity_main2.*

class SecondActivity : AppCompatActivity() {
    @Override
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

       val name1 = intent.extras?.get("name")

        textView3.text = "Happy Birthday "+name1
    }
}
