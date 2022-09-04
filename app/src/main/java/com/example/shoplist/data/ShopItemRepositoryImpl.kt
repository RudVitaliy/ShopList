package com.example.shoplist.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.shoplist.domain.ShopItem
import com.example.shoplist.domain.ShopItemRepository

object ShopItemRepositoryImpl: ShopItemRepository{

    private val listOfItems = mutableListOf<ShopItem>()

    private var autoIncrementId = 0

    private val shopListLiveData = MutableLiveData<List<ShopItem>>()


    init {
        for (i in 0 until 10){
            val item = ShopItem("Item $i", i, true)
            addItem(item)
        }
    }

    override fun editItem(item: ShopItem) {
        val oldItem = getItem(item.id)
        listOfItems.remove(oldItem)
        addItem(item)
    }

    override fun deleteItem(item: ShopItem) {
        listOfItems.remove(item)
        updateList()
    }

    override fun addItem(item: ShopItem) {
        if (item.id == ShopItem.UNDEFINED_ID){
            item.id = autoIncrementId++
        }
        listOfItems.add(item)
        updateList()
    }

    override fun getShopList(): LiveData<List<ShopItem>> {
        return shopListLiveData
    }

    override fun getItem(shopItemId: Int): ShopItem {
        return listOfItems.find {
            it.id == shopItemId
        } ?: throw RuntimeException("Item with id:$shopItemId is not found")
    }

    private fun updateList() {
        shopListLiveData.value = listOfItems.toList()
    }

}