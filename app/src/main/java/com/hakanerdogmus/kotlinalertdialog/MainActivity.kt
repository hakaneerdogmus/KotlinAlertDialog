package com.hakanerdogmus.kotlinalertdialog

import android.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.hakanerdogmus.kotlinalertdialog.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        //Context

        //Activity Context ==> this -- this@ActivtyMain
        //App Context ==> applicationContext








        Toast.makeText(applicationContext, "Welcome", Toast.LENGTH_LONG).show()
        
        
    }


    fun save (view : View){
        val alert = AlertDialog.Builder(this)
        alert.setTitle("Save")
        alert.setMessage("Are You Sure?")

        //onclick listener
        alert.setPositiveButton("Yes"){dialog, which ->
            Toast.makeText(applicationContext,"Saved",Toast.LENGTH_LONG).show()
        }
        //onclick listener
        alert.setNegativeButton("No") {dialog, which ->
            Toast.makeText(applicationContext, "Not Saved", Toast.LENGTH_LONG).show()
        }
        alert.show()

    }


}