package com.inhatc.inflearn_kindjetpack.retrofit.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.inhatc.inflearn_kindjetpack.R
import com.inhatc.inflearn_kindjetpack.databinding.TextRowItemBinding
import com.inhatc.inflearn_kindjetpack.retrofit.model.Post

class CustomAdapter(private val dataSet: List<Post>) :
    RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    inner class ViewHolder(val binding: TextRowItemBinding): RecyclerView.ViewHolder(binding.root){
//        val textView: TextView = binding.textView

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = TextRowItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.textView.text = dataSet[position].title
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }


}