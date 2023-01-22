package com.example.data

import com.example.data.dto.ProductResponseItem
import com.example.domain.model.ProductItem

fun ProductResponseItem.toProductItem() : ProductItem {
    return ProductItem(
        category
    )

}