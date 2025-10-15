package de.rogallab.mobile.ui.ue23_2

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun RowWithWeights(
   modifier: Modifier = Modifier
) {
   Row(
      modifier = modifier
         .fillMaxWidth()
         .height(100.dp) // Beispielhöhe, kann angepasst werden
   ) {
      // Linke Box – 1/3 der Breite
      Box(
         modifier = Modifier
            .weight(1f)          // 1 Teil
            .fillMaxHeight()     // gleiche Höhe wie rechte Box
            .background(Color.Red),
         contentAlignment = Alignment.Center
      ) {
         Text("1/3")
      }

      // Rechte Box – 2/3 der Breite
      Box(
         modifier = Modifier
            .weight(2f)          // 2 Teile
            .fillMaxHeight()     // gleiche Höhe wie linke Box
            .background(Color.Green),
         contentAlignment = Alignment.Center
      ) {
         Text("2/3")
      }
   }
}
