package de.rogallab.mobile.ui.ue24_4

sealed class LoginIntent {
   object Login : LoginIntent()
   object Logout : LoginIntent()
}