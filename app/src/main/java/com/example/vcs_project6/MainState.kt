package com.example.vcs_project6

import com.example.vcs_project6.data.model.Place

sealed class MainState {
    object Loading : MainState()
    data class Success(val data: List<Place>) : MainState()
    data class Error(val message: String) : MainState()
}