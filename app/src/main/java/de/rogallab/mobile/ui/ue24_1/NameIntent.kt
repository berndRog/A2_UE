package de.rogallab.mobile.ui.ue24_1

sealed class NameIntent {
   data class Save(val newName: String) : NameIntent()
}