package com.example.vcs_project6

import android.annotation.SuppressLint
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.vcs_project6.data.model.Place
import com.example.vcs_project6.databinding.ItemPlaceBinding
import androidx.core.net.toUri

class PlaceAdapter : RecyclerView.Adapter<PlaceAdapter.ViewHolder>() {
    private val items = mutableListOf<Place>()
    @SuppressLint("NotifyDataSetChanged")
    fun submitList(data: List<Place>) {
        items.clear()
        items.addAll(data)
        notifyDataSetChanged()
    }
    inner class ViewHolder(val binding: ItemPlaceBinding)
        : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Place) {
            binding.tvName.text = item.name

            binding.img.setImageResource(item.imageUrl)
            binding.img.setOnClickListener {
                val intent = Intent(Intent.ACTION_VIEW, item.mapUrl.toUri())
                binding.root.context.startActivity(intent)
            }

            binding.btnSave.setImageResource(
                if (item.isSaved) R.drawable.ic_heart_filled
                else R.drawable.ic_heart_outline
            )

            binding.btnSave.setOnClickListener {
                item.isSaved = !item.isSaved
                notifyItemChanged(bindingAdapterPosition)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemPlaceBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(items[position])
    }
}