package com.example.shoplist.domain

class DeleteItemUseCase(private val shopItemRepository: ShopItemRepository) {

    fun deleteItem(item: ShopItem){
        shopItemRepository.deleteItem(item)
    }
}