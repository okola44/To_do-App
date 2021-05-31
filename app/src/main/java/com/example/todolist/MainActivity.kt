package com.example.todolist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var addTask = findViewById<EditText>(R.id.etTask)
        var Add1 = findViewById<TextView>(R.id.tvAdd1)
        var Add2 = findViewById<TextView>(R.id.tvAdd2)
        var Add3 = findViewById<TextView>(R.id.tvAdd3)
        var Add4 = findViewById<TextView>(R.id.tvAdd4)
        var btnAdd = findViewById<Button>(R.id.btnAddTask)


        btnAdd.setOnClickListener {
            var Intent=Intent(baseContext,MainActivity2::class.java)
        }




        btnAdd.setOnClickListener {
            Add1.setText(addTask.text.toString())


            btnAdd.setOnClickListener {
                Add2.setText(addTask.text.toString())

                btnAdd.setOnClickListener {
                    Add3.setText(addTask.text.toString())


                    btnAdd.setOnClickListener {
                        Add4.setText(addTask.text.toString())

                    }
                }
            }
        }
    }

}