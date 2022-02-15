package com.example.affirmations.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmations.R
import com.example.affirmations.model.Affirmation

/**
 * Takes data and prepares it for RecyclerView to display
 * Uses context to resolve string resources
 */
class ItemAdapter(
    private val context: Context,
    private val dataset: List<Affirmation>
    ) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    // represent a pool of views for RecyclerView to use
    // and reuse to display affirmations
    class ItemViewHolder(
        view: View) : RecyclerView.ViewHolder(view) {

        // We use textview to display text in RecyclerView
        // as we keep data in the form of strings
        val textView: TextView = view.findViewById(R.id.item_title)
        val imageView: ImageView = view.findViewById(R.id.item_image)
    }

    // creates new RecyclerViews
    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): ItemViewHolder {

        // LayoutInflater inflates an XML layout into hierarchy of view objects
        val adapterLayout = LayoutInflater.from(parent.context
        ).inflate(R.layout.list_item, parent, false)
        return ItemViewHolder(adapterLayout)
    }

    // helps update RecyclerView with new string resource
    override fun onBindViewHolder(holder: ItemViewHolder,
                                  position: Int) {

        // get item from the dataset at a given position
        val item = dataset[position]

        // display string at a given position
        holder.textView.text = context.resources.getString(item.stringResourceId)

        // display image at a given position
        holder.imageView.setImageResource(item.imageResourceId)
    }

    // returns the size of my dataset
    override fun getItemCount(): Int {
        return dataset.size
    }
}