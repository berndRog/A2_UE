package de.rogallab.mobile.ui.ue24_1

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class NameViewModel : ViewModel() {
   private val _nameUiState: MutableStateFlow<NameUiState> =
      MutableStateFlow(NameUiState())
   val nameUiState: StateFlow<NameUiState> =
      _nameUiState.asStateFlow()

   // public function to receive intents from the UI
   fun handleIntent(intent: NameIntent) {
      when (intent) {
         is NameIntent.Save -> updateName(intent.newName)
         // Add other intent handlers here if needed
         // is NameIntent.Clear -> clearName()
      }
   }

   // Private function to update the name in the UI state
   private fun updateName(newName: String) {
      _nameUiState.update { currentState ->
         currentState.copy(name = newName)
      }
   }
}