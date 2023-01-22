package com.example.domain.repository

import com.example.domain.model.ProductItem

interface FakeStoreRepository {

    suspend fun getAllProducts() : List<ProductItem>
}