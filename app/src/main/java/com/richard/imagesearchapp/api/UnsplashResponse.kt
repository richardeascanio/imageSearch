package com.richard.imagesearchapp.api

import com.richard.imagesearchapp.data.Photo

data class UnsplashResponse(
    val results: List<Photo>
)