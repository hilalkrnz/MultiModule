package com.example.domain.usecase

import com.example.domain.model.ProductItem

interface GetAllProductUseCase {

    suspend fun getAllProductUseCase(): List<ProductItem>
}