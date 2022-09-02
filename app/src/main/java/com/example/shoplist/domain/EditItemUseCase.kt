package com.example.shoplist.domain

class EditItemUseCase(private val shopItemRepository: ShopItemRepository) {

    fun editItem(item: ShopItem) {
        shopItemRepository.editItem(item)
    }
}