package com.inhatc.inflearn_kindjetpack.room.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.inhatc.inflearn_kindjetpack.databinding.TxtRowItemBinding
import com.inhatc.inflearn_kindjetpack.room.db.entity.TextEntity

class MainAdapter(private val dataSet: List<TextEntity>): RecyclerView.Adapter<MainAdapter.ViewHolder>() {
    inner class ViewHolder(val binding: TxtRowItemBinding): RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = TxtRowItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.textView.text = dataSet[position].text

    }

    override fun getItemCount(): Int {
        return dataSet.size
    }


}