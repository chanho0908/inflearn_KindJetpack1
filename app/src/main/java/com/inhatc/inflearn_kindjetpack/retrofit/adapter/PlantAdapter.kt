package com.inhatc.inflearn_kindjetpack.retrofit.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.inhatc.inflearn_kindjetpack.databinding.PlantRowItemBinding
import com.inhatc.inflearn_kindjetpack.retrofit.model.Plant

class PlantAdapter(val context: Context, val dataSet: List<Plant>): RecyclerView.Adapter<PlantAdapter.ViewHolder>() {
    inner class ViewHolder(val binding: PlantRowItemBinding): RecyclerView.ViewHolder(binding.root){
        val textView = binding.textArea
        val imageView = binding.imageArea
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = PlantRowItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.textArea.text = dataSet[position].name
        Glide.with(context)
            .load(dataSet[position].imageUrl)
            .into(holder.imageView)
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }


}