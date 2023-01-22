package com.example.data.repository

import com.example.data.source.RemoteDataSource
import com.example.data.toProductItem
import com.example.domain.repository.FakeStoreRepository
import com.example.domain.model.ProductItem

class FakeStoreRepositoryImpl(
    private val remoteDataSource: RemoteDataSource
): FakeStoreRepository {

    override suspend fun getAllProducts(): List<ProductItem> {
        return remoteDataSource.getAllProducts().map {
            it.toProductItem()
        }
    }
}