package com.example.shoplist.domain

interface ShopItemRepository {

    fun editItem(item: ShopItem)

    fun deleteItem(item: ShopItem)

    fun addItem(item: ShopItem)

    fun getShopList(): List<ShopItem>

    fun getItem(shopItemId: Int): ShopItem
}