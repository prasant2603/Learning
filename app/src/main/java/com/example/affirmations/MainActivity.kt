package com.example.affirmations

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmations.adapter.ItemAdapter
import com.example.affirmations.data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myDataset=Datasource().loafAffirmations()
        val recyclerview=findViewById<RecyclerView>(R.id.recycler_view)
        recyclerview.adapter=ItemAdapter(this,myDataset)
        recyclerview.setHasFixedSize(true)
    }
}