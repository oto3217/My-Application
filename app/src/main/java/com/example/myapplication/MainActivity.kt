package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = RecyclerViewPersonAdapter(getPersons())
    }

    private fun getPersons() {


        val personList = ArrayList<Person>()

        personList.add(
            Person(
                id = 1,
                imageUrl = "https://www.carpixel.net/w/189db232ad78e665e509b6e2471232c9/bmw-3-series-wallpaper-hd-26227.jpg",
                name = "Guka",
                description = "Guka Plexanovi"
            )
        )

        personList.add(
            Person(
                id = 2,
                imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSzTOOL4cSXOsy-bpqF71fe84VxnVjdG8Ioqw&usqp=CAU",
                name = "Faziko",
                description = "Gulnazi Kochlamazashvili"
            )
        )


        personList.add(
            Person(
                id = 3,
                imageUrl = "https://www.crushpixel.com/big-static11/preview4/british-shorthair-cat-696526.jpg",
                name = "Oto",
                description = "Oto Bakashvili"
            )
        )

        personList.add(
            Person(
                id = 4,
                imageUrl = "https://prod.pictures.autoscout24.net/listing-images/6f715564-21ef-4937-9775-3cf08cabbc2f_54691f76-9443-46aa-8a5f-833f2708659f.jpg/420x315.jpg",
                name = "Gela",
                description = "Gela Gnolidze"
            )
        )

    }
}