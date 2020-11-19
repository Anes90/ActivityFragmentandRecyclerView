package com.example.activityfragmentandrecyclerview.adapter




import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.activityfragmentandrecyclerview.R
<<<<<<< Updated upstream
=======
import com.example.activityfragmentandrecyclerview.`interface`.CellClickListener
>>>>>>> Stashed changes
import com.example.activityfragmentandrecyclerview.model.ListItemModel

class ItemAdapter(
    private val context: Context,
<<<<<<< Updated upstream
    private val dataset: List<ListItemModel>
=======
    private val dataset: List<ListItemModel>,
    private val cellClickListener: CellClickListener,
    private val toActivity: Int = R.id.action_fragmentOne_to_secondActivity,
    private val toFragment: Int = R.id.action_fragmentOne_to_fragmentTwo
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
=======
        if (position == 0) {
            holder.itemView.setOnClickListener {
                cellClickListener.onCellClickListener(toActivity)
            }
        }else {
            holder.itemView.setOnClickListener {
                cellClickListener.onCellClickListener(toFragment)
            }
        }
>>>>>>> Stashed changes
    }

    override fun getItemCount() = dataset.size
}