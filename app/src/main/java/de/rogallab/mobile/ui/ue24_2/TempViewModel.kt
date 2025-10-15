package de.rogallab.mobile.ui.ue24_2

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class TempViewModel : ViewModel() {
   private val _tempUiState = MutableStateFlow(TempUiState())
   val tempUiState: StateFlow<TempUiState> = _tempUiState.asStateFlow()

   fun handleIntent(intent: TempIntent) {
      when (intent) {
         TempIntent.Increase -> increase()
         TempIntent.Decrease -> decrease()
      }
   }

   private fun increase() {
      _tempUiState.update { currentState ->
         val temperature = currentState.temperature + 1
         currentState.copy(temperature = temperature)
      }
   }

   private fun decrease() {
      _tempUiState.update { currentState ->
         val temperature = currentState.temperature - 1
         currentState.copy(temperature = temperature)
      }
   }

}