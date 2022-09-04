package com.example.shoplist.domain

import androidx.lifecycle.LiveData

interface ShopItemRepository {

    fun editItem(item: ShopItem)

    fun deleteItem(item: ShopItem)

    fun addItem(item: ShopItem)

    fun getShopList(): LiveData<List<ShopItem>>

    fun getItem(shopItemId: Int): ShopItem
}