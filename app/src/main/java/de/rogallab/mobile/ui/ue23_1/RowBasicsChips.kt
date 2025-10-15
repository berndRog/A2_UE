package de.rogallab.mobile.ui.ue23_1

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.AssistChip
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun RowBasicsChips(
   modifier: Modifier = Modifier
) {
   Row(
      modifier = modifier
         .fillMaxWidth()                  // Zeile füllt die gesamte Breite
         .height(64.dp),          // Beispielhöhe, optional
      verticalAlignment = Alignment.CenterVertically
   ) {
      // Chip links
      AssistChip(
         onClick = {},
         label = { Text("Links") }
      )

      Spacer(modifier = Modifier.weight(1f))  // Abstand füllt auf

      // Chip mittig
      AssistChip(
         onClick = {},
         label = { Text("Mitte") }
      )

      Spacer(modifier = Modifier.weight(1f))  // Abstand füllt auf

      // Chip rechts
      AssistChip(
         onClick = {},
         label = { Text("Rechts") }
      )
   }
}