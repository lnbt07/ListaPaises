package com.example.listapaises.adapter

import android.content.Context
import android.service.autofill.Dataset
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.listapaises.R
import com.example.listapaises.model.Pais

class ItemAdapter (private val context: Context, private val dataset: List<Pais>): RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    class ItemViewHolder (private val view: View): RecyclerView.ViewHolder(view){
        val tvNomePaisItem: TextView = view.findViewById(R.id.tvNomePaisItem)
        val ivBandeiraPaisItem: ImageView = view.findViewById(R.id.ivBandeiraPaisItem)
    }

    //função utilizada pelo LayouManager pra criar views para cada item da lista
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)
        return ItemViewHolder(adapterLayout)
    }
    //função utilizada pelo LayouManager para aplicar dados do nosso dataset as views da nossa lista
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.ivBandeiraPaisItem.setImageResource(item.imageResourceId)
        holder.tvNomePaisItem.text = context.resources.getString(item.stringResourceId)
    }

    //função utilizada pelo LayouManager para descobrir o tamanho da lista
    override fun getItemCount() = dataset.size
}