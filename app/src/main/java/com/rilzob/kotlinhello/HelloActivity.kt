package com.rilzob.kotlinhello

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk27.coroutines.onClick

class HelloActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_hello)

//        val colorTable = listOf("#ff0000", "#00ff00", "#0000ff", "#ffff00", "#00ffff", "#ff00ff")
//        val label = findViewById<TextView>(R.id.label)
//        label.setOnClickListener{ view ->
//            val randomIndex = (Math.random() * colorTable.size).toInt()
//            view.setBackgroundColor(Color.parseColor(colorTable[randomIndex]))
//        }

        val colorTable = listOf("#ff0000", "#00ff00", "#0000ff", "#ffff00", "#00ffff", "#ff00ff")

        verticalLayout {
            padding = dip(20)
            val name = editText()
            name.lparams(width = matchParent){
                topMargin = dip(20)
                bottomMargin = dip(30)
            }
            button("Say Hello") {
                this.onClick {
                    val randomIndex = (Math.random() * colorTable.size).toInt()
                    setBackgroundColor(Color.parseColor(colorTable[randomIndex]))
                    toast("Hello, ${name.text}! with color ${colorTable[randomIndex]}")
                }
            }
        }
    }
}
