package com.example.vcs_project6

import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.vcs_project6.data.model.Place
import com.example.vcs_project6.databinding.ItemPlaceBinding

class PlaceAdapter : RecyclerView.Adapter<PlaceAdapter.ViewHolder>() {

    private val items = mutableListOf<Place>()

    fun submitList(data: List<Place>) {
        items.clear()
        items.addAll(data)
        notifyDataSetChanged()
    }

    inner class ViewHolder(val binding: ItemPlaceBinding)
        : RecyclerView.ViewHolder(binding.root) {

        fun bind(item: Place) {
            binding.tvName.text = item.name

            Glide.with(binding.img.context)
                .load(item.imageUrl)
                .into(binding.img)

            binding.btnSave.setImageResource(
                if (item.isSaved) R.drawable.ic_heart_filled
                else R.drawable.ic_heart_outline
            )

            binding.btnSave.setOnClickListener {
                item.isSaved = !item.isSaved
                notifyItemChanged(adapterPosition)
            }

            binding.btnExplore.setOnClickListener {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(item.mapUrl))
                binding.root.context.startActivity(intent)
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