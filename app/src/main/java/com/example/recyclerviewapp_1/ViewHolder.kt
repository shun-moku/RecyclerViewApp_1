package com.example.recyclerviewapp_1

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var itemTextView = itemView.findViewById<TextView>(R.id.item_text)
}
