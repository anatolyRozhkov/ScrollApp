package com.example.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmations.adapter.ItemAdapter
import com.example.affirmations.data.Datasource


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // store returned list of affirmations in myDataset
        val myDataset = Datasource().loadAffirmations()

        // bind the RecyclerView in the main_layout
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)

        /**
         * tell the new recyclerView to use the prepared adapter
         * FIRST parameter is the context of this activity
         * SECOND parameter is the dataset
         */
        recyclerView.adapter = ItemAdapter(this, myDataset)

        // since the layout size is the same for all instances
        recyclerView.setHasFixedSize(true)
    }
}