package asha.binar.latihanchaptertiga_recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import asha.binar.latihanchaptertiga_recycleview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: BookAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)

        var listBook = arrayListOf(
            MyData(1, R.drawable.buku_satu, "Bumi", "Tere Liye"),
            MyData(2, R.drawable.buku_dua, "Sebuah Usaha Melupakan", "Boy Candra"),
            MyData(3, R.drawable.deathly, "Harry Potter Deathly Hallows", "J K Rowling"),
            MyData(3, R.drawable.prisoner, "Harry Potter Prisoner of Azkaban", "J K Rowling"),
            MyData(3, R.drawable.half_blood, "Harry Potter and the Half Blood Prince", "J K Rowling"),
            MyData(3, R.drawable.phoenix, "Harry Potter and the Order Phoenix", "J K Rowling"),

        )

        val adapter = BookAdapter(listBook)

//        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        val layoutManager = GridLayoutManager(this, 2)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        recyclerView.layoutManager = layoutManager

        recyclerView.adapter = adapter
    }
}