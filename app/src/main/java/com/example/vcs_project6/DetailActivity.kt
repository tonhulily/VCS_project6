package com.example.vcs_project6

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.vcs_project6.data.repository.PlaceRepository
import com.example.vcs_project6.databinding.ActivityDetailBinding
import androidx.core.net.toUri
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.vcs_project6.data.model.Place

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding
    private val repo = PlaceRepository()
    private var currentPlace: Place? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(binding.btnBack) { view, insets ->
            val statusBar = insets.getInsets(
                WindowInsetsCompat.Type.statusBars()
            )

            view.translationY = statusBar.top.toFloat()
            insets
        }

        ViewCompat.setOnApplyWindowInsetsListener(binding.btnFavorite) { view, insets ->
            val statusBar = insets.getInsets(
                WindowInsetsCompat.Type.statusBars()
            )
            view.translationY = statusBar.top.toFloat()
            insets
        }

        val placeId = intent.getIntExtra("placeId", -1)

        val place = repo.fetchPlacesSync().find { it.id == placeId }

        currentPlace = place
        updateHeartIcon()

        place?.let { placeData ->
            binding.imgDetail.setImageResource(placeData.imageUrl)
            binding.tvTitle.text = placeData.name
            binding.tvSubtitle.text = placeData.shortDescription
            binding.tvDescription.text = placeData.fullDescription
            binding.tvBestTime.text = placeData.bestTime
            binding.tvDuration.text = placeData.duration
            binding.tvTicket.text = placeData.ticketPrice

            binding.btnMap.setOnClickListener {
                val intent = Intent(
                    Intent.ACTION_VIEW,
                    placeData.mapUrl.toUri()
                )
                startActivity(intent)
            }
        }

        binding.btnBack.setOnClickListener {
            finish()
        }

        binding.btnFavorite.setOnClickListener {
            currentPlace?.let {
                it.isSaved = !it.isSaved
                updateHeartIcon()
            }
        }
    }
    private fun updateHeartIcon() {
        currentPlace?.let {
            if (it.isSaved) {
                binding.btnFavorite.setImageResource(R.drawable.ic_heart_filled)
            } else {
                binding.btnFavorite.setImageResource(R.drawable.ic_heart_outline)
            }
        }
    }

}