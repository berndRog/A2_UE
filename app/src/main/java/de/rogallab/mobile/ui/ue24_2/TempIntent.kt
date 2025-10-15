package de.rogallab.mobile.ui.ue24_2

sealed class TempIntent {
   object Increase : TempIntent()
   object Decrease : TempIntent()
}