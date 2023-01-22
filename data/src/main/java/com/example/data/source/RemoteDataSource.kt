package com.example.data.source

import com.example.data.dto.ProductResponseItem

interface RemoteDataSource {

    suspend fun getAllProducts() : List<ProductResponseItem>
}