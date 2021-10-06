package com.example.selectionactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SelectionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val items = getData()

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        val imageView = findViewById<ImageView>(R.id.imageView)
        val textView = findViewById<TextView>(R.id.textView)

        recyclerView.layoutManager = GridLayoutManager(this, 2)

        val ocl = View.OnClickListener {
            val posit = recyclerView.getChildAdapterPosition(it)
            imageView.setImageResource(items[posit].resourceID)
            textView.text = items[posit].description

        }

        recyclerView.adapter = ImageAdapter(items, ocl)
    }
    fun getData(): Array<Item> {
        return arrayOf(Item(R.drawable.jordan_1, "Jordan 1")
            , Item(R.drawable.jordan_2,"Jordan 2")
            , Item(R.drawable.jordan_3,"Jordan 3")
            , Item(R.drawable.jordan_4,"Jordan 4")
            , Item(R.drawable.jordan_5,"Jordan 5")
            , Item(R.drawable.jordan_6,"Jordan 6")
            , Item(R.drawable.jordan_7,"Jordan 7")
            , Item(R.drawable.jordan_8,"Jordan 8")
            , Item(R.drawable.jordan_9,"Jordan 9")
            , Item(R.drawable.jordan_10,"Jordan 10"))
    }

}