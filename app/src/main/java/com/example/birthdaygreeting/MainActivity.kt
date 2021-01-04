package com.example.birthdaygreeting

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun nextactivity(view: View) {
           if(entername.editableText.toString().isEmpty()){

               Toast.makeText(this,"Enter Name First",Toast.LENGTH_LONG).show()

            }
        else{

             val intent =  Intent(this,SecondActivity::class.java)
               intent.putExtra("name",entername.editableText.toString())
                startActivity(intent)

        }
    }
}