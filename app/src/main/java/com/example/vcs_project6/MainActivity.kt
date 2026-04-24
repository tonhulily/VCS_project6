package com.example.vcs_project6

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import com.example.vcs_project6.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val viewModel: MainViewModel by viewModels()
    private val adapter = PlaceAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(binding.root) { view, insets ->
            val systemBars = insets.getInsets(
                WindowInsetsCompat.Type.systemBars()
            )
            view.setPadding(
                systemBars.left,
                systemBars.top,
                systemBars.right,
                systemBars.bottom
            )
            insets
        }

        binding.recyclerView.layoutManager = GridLayoutManager(this, 2)
        binding.recyclerView.adapter = adapter

        binding.btnRetry.setOnClickListener {
            viewModel.loadData()
        }

        observe()
        viewModel.loadData()
    }

    private fun observe() {
        viewModel.state.observe(this) { state ->
            when (state) {
                is MainState.Loading -> {
                    binding.loading.visibility = View.VISIBLE
                    binding.errorLayout.visibility = View.GONE
                    binding.recyclerView.visibility = View.GONE
                }
                is MainState.Success -> {
                    binding.loading.visibility = View.GONE
                    binding.errorLayout.visibility = View.GONE
                    binding.recyclerView.visibility = View.VISIBLE

                    adapter.submitList(state.data)
                }
                is MainState.Error -> {
                    binding.loading.visibility = View.GONE
                    binding.errorLayout.visibility = View.VISIBLE
                    binding.recyclerView.visibility = View.GONE
                }
            }
        }
    }

    @SuppressLint("NotifyDataSetChanged")
    override fun onResume() {
        super.onResume()
        adapter.notifyDataSetChanged()
    }
}