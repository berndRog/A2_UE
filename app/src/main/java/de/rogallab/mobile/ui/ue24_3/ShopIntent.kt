package de.rogallab.mobile.ui.ue24_3

sealed class ShopIntent {
   data class AddItem(val item: String) : ShopIntent()
   object ClearList : ShopIntent()
}
