package com.example.mybasiccalculator

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            var num1 by remember { mutableStateOf("") }
            var num2 by remember { mutableStateOf("") }
            var result = 0


            Column {

                TextField(value = num1, onValueChange = {
                    num1 = it
                })
                TextField(value = num2, onValueChange = {
                    num2 = it
                })

                Row {
                    Button(onClick = {
                        result = num1.toInt() + num2.toInt()
                        Toast.makeText(applicationContext, "Result is $result", Toast.LENGTH_SHORT).show()
                    }) {
                        Text(text = "Add")
                    }
                    Button(onClick = {
                        result = num1.toInt() - num2.toInt()
                        Toast.makeText(applicationContext, "Result is $result", Toast.LENGTH_SHORT).show()
                    }) {
                        Text(text = "Sub")
                    }
                    Button(onClick = {
                        result = num1.toInt() * num2.toInt()
                        Toast.makeText(applicationContext, "Result is $result", Toast.LENGTH_SHORT).show()
                    } ) {
                        Text(text = "Mul")
                    }
                    Button(onClick = {
                        result = num1.toInt() / num2.toInt()
                        Toast.makeText(applicationContext,"Result is $result", Toast.LENGTH_SHORT).show()
                    }) {
                        Text(text = "Div")
                    }
                }

            }

        }
    }
}

