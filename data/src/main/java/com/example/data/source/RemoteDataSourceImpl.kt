package com.example.data.source

import com.example.data.network.FakesStoreApi
import com.example.data.dto.ProductResponseItem

class RemoteDataSourceImpl(
    private val api: FakesStoreApi
) : RemoteDataSource {

    override suspend fun getAllProducts(): List<ProductResponseItem> {
        return api.getAllProducts()
    }
}