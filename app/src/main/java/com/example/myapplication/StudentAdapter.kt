package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class StudentAdapter(private val students: List<StudentData>) : RecyclerView.Adapter<StudentAdapter.StudentViewHolder>() {

    class StudentViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val profilePicture: ImageView = itemView.findViewById(R.id.profilePicture)
        val name: TextView = itemView.findViewById(R.id.name)
        val address: TextView = itemView.findViewById(R.id.address)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_student, parent, false)
        return StudentViewHolder(view)
    }

    override fun onBindViewHolder(holder: StudentViewHolder, position: Int) {
        val student = students[position]
        holder.profilePicture.setImageResource(student.profilePicture)
        holder.name.text = student.name
        holder.address.text = student.address
    }

    override fun getItemCount() = students.size
}