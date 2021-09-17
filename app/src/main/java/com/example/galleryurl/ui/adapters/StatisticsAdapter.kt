package com.example.galleryurl.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.galleryurl.databinding.ItemStatisticsBinding

class StatisticsAdapter : RecyclerView.Adapter<StatisticsAdapter.StatisticsViewHolder>() {
    private val list: ArrayList<String> = ArrayList()

    fun addList(statistics: String){
        list.add(statistics)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StatisticsViewHolder {
        return StatisticsViewHolder(
            ItemStatisticsBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: StatisticsViewHolder, position: Int) {
        list[position]?.let { holder.onBind(it) }
    }

    class StatisticsViewHolder(private val binding: ItemStatisticsBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(it: String) {
            binding.itemTxtTitle.text = it
        }

    }

    override fun getItemCount(): Int {
        return list.size
    }
}