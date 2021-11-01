package com.ort.usanote.entities

class Cart {
    private var productItemList : MutableList<ProductItem> = mutableListOf()

    init {
        var url = "https://edu-delitech2.odoo.com/web/image/product.template/1/image_1024?unique=fb5c381"

        productItemList.add(ProductItem(Product("Keyboard", "Keyboard description", 200.0, url), 2))
        productItemList.add(ProductItem(Product("Mouse", "Mouse description", 90.0, url), 5))
        productItemList.add(ProductItem(Product("Microchip", "Microchip description", 170.0, url), 1))
        productItemList.add(ProductItem(Product("Screen", "Screen description", 900.0, url), 3))
        productItemList.add(ProductItem(Product("Headphones", "Headphones description", 940.0, url), 2))
        productItemList.add(ProductItem(Product("Keyboard", "Keyboard description", 230.0, url), 1))
        productItemList.add(ProductItem(Product("Screen", "Screen description", 250.0, url), 5))
    }

    fun getProductItems () : MutableList<ProductItem> {
        return productItemList
    }

    fun deleteProductItem(pos: Int) {
        productItemList.removeAt(pos)
    }
}