package com.example.activityfragmentandrecyclerview.adapter




import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.activityfragmentandrecyclerview.R
import com.example.activityfragmentandrecyclerview.model.ListItemModel

class ItemAdapter(
    private val context: Context,
    private val dataset: List<ListItemModel>
) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {
    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val textViewTitle: TextView = view.findViewById(R.id.item_title)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textViewTitle.text =  context.resources.getString(item.stringTitleResourceId)
    }

    override fun getItemCount() = dataset.size
}