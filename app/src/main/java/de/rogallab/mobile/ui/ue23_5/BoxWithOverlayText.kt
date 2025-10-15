package de.rogallab.mobile.ui.ue23_5

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun BoxWithOverlayText(
   modifier: Modifier = Modifier
) {
   Box(
      modifier = modifier
         .fillMaxWidth()
         .height(150.dp)
         .background(Color.Blue),
      contentAlignment = Alignment.Center
   ) {
      Text(
         text = "Overlay",
         color = Color.White,
         style = MaterialTheme.typography.titleLarge
      )
   }
}
