package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class RecyclerViewPersonAdapter(private val personList: List<Person>) : RecyclerView.Adapter<RecyclerViewPersonAdapter.PersonViewHolder>() {

    class PersonViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private lateinit var imageView: ImageView
        private lateinit var textView: TextView
        private lateinit var textView2: TextView

        init {
            imageView = itemView.findViewById(R.id.imageView)
            textView = itemView.findViewById(R.id.textView)
            textView2 = itemView.findViewById(R.id.textView2)
        }

        fun setData(person: Person) {

            textView.text = person.name
            textView2 .text = person.description

            Glide.with(itemView)
                .load(person.imageUrl)
                .into(imageView)

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_person, parent, false)
        return PersonViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {
        holder.setData(personList.get(position))

    }

    override fun getItemCount(): Int {
        return personList.size
    }

}