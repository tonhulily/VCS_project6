package com.example.vcs_project6.data.model

data class Place(
    val id: Int,
    val name: String,
    val imageUrl: Int,
    val mapUrl: String,
    val shortDescription: String,
    val fullDescription: String,
    val bestTime: String,
    val duration: String,
    val ticketPrice: String,
    var isSaved: Boolean = false
)