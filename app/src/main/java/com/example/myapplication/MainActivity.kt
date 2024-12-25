package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        window.statusBarColor = ContextCompat.getColor(this, R.color.red)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val students = listOf(
            StudentData("Alya Putri", R.drawable.ic_person, "Jl. Mawar No. 1"),
            StudentData("Budi Santoso", R.drawable.ic_person, "Jl. Melati No. 2"),
            StudentData("Citra Lestari", R.drawable.ic_person, "Jl. Kenanga No. 3"),
            StudentData("Dian Pratama", R.drawable.ic_person, "Jl. Anggrek No. 4"),
            StudentData("Eka Wijaya", R.drawable.ic_person, "Jl. Cempaka No. 5"),
            StudentData("Faisal Hidayat", R.drawable.ic_person, "Jl. Kamboja No. 6"),
            StudentData("Gita Sari", R.drawable.ic_person, "Jl. Teratai No. 7"),
            StudentData("Hendra Pratama", R.drawable.ic_person, "Jl. Dahlia No. 8"),
            StudentData("Intan Purnama", R.drawable.ic_person, "Jl. Melati No. 9"),
            StudentData("Joko Widodo", R.drawable.ic_person, "Jl. Taman Sari No. 10"),
            StudentData("Krisna Saputra", R.drawable.ic_person, "Jl. Pandan No. 11"),
            StudentData("Lina Supriyadi", R.drawable.ic_person, "Jl. Pahlawan No. 12")
        )

        recyclerView.adapter = StudentAdapter(students)

        val backButton = findViewById<ImageView>(R.id.backButton)
        backButton.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
            finish()
        }
    }
}