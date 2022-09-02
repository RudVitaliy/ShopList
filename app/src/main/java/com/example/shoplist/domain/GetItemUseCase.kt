package com.example.shoplist.domain

class GetItemUseCase(private val shopItemRepository: ShopItemRepository) {

    fun getItem(id: Int): ShopItem{
        return shopItemRepository.getItem(id)
    }

}