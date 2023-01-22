package com.example.data.network

import com.example.data.dto.ProductResponseItem
import retrofit2.http.GET

interface FakesStoreApi {

    @GET("products")
    fun getAllProducts() : List<ProductResponseItem>
}