package com.example.activityfragmentandrecyclerview.data

import com.example.activityfragmentandrecyclerview.R
import com.example.activityfragmentandrecyclerview.model.ListItemModel

class Datasource (){
    fun loadListItemModels(): List<ListItemModel> {
        return listOf<ListItemModel>(
            ListItemModel(R.string.title_activity),
            ListItemModel(R.string.title_fragment),
        )
    }
}