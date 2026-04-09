package com.example.vcs_project6.data.model

data class Place(
    val id: Int,
    val name: String,
    val imageUrl: Int,
    val mapUrl: String,
    var isSaved: Boolean = false
)