package de.rogallab.mobile.ui.ue24_3

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class ShopViewModel : ViewModel() {

   private val _shopUiState = MutableStateFlow(ShopUiState())
   val shopUiState: StateFlow<ShopUiState> = _shopUiState.asStateFlow()

   fun handleIntent(intent: ShopIntent) {
      when (intent) {
         is ShopIntent.AddItem -> addItem(intent.item)
         ShopIntent.ClearList -> clearList()
      }
   }

   fun addItem(item: String) {
      if (item.isBlank())  return
      _shopUiState.update { currentState ->
         currentState.copy(items = currentState.items + item)
      }
   }

   fun clearList() {
      _shopUiState.update { currentState ->
         currentState.copy(items = emptyList())
      }
   }
}
