package de.rogallab.mobile.ui.ue24_4

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class LoginViewModel : ViewModel() {

   private val _loginUiState = MutableStateFlow(LoginUiState())
   val loginUiState: StateFlow<LoginUiState> = _loginUiState.asStateFlow()

   fun handleIntent(intent: LoginIntent) {
      when (intent) {
         LoginIntent.Login -> login()
         LoginIntent.Logout -> logout()
      }
   }
   
   private fun login() {
      _loginUiState.update { currentState ->
         currentState.copy(loggedIn = true)
      } 
   }
   private fun logout() {
      _loginUiState.update { currentState ->
         currentState.copy(loggedIn = false)
      }
   }
}