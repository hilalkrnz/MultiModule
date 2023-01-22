package com.example.multimodule

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.domain.model.ProductItem
import com.example.domain.usecase.GetAllProductUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val getAllProductUseCase: GetAllProductUseCase
): ViewModel() {

    private val _products = MutableLiveData<List<ProductItem>>()
    val products: LiveData<List<ProductItem>> get() = _products

    init {
        getAllProducts()
    }



    fun getAllProducts(){
        viewModelScope.launch(Dispatchers.IO) {
            _products.value = getAllProductUseCase.getAllProductUseCase()
        }
    }

}