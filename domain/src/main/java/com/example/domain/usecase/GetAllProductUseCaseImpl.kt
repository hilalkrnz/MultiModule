package com.example.domain.usecase

import com.example.domain.repository.FakeStoreRepository
import com.example.domain.model.ProductItem

class GetAllProductUseCaseImpl(
    private val fakeStoreRepository: FakeStoreRepository
) : GetAllProductUseCase {
    override suspend fun getAllProductUseCase(): List<ProductItem> {
        return fakeStoreRepository.getAllProducts()
    }
}