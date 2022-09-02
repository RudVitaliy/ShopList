package com.example.shoplist.domain

class AddItemUseCase(private val shopItemRepository: ShopItemRepository) {

    fun addItem(item: ShopItem) {
        shopItemRepository.addItem(item)
    }
}