package de.rogallab.mobile.ui.ue22_3

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

// ---------- Stateful Container ----------
@Composable
fun TodoScreen(
   title: String,
   modifier: Modifier = Modifier
) {
   var done by rememberSaveable { mutableStateOf(false) }

   Card(
      modifier = modifier.fillMaxWidth(),
      shape = RoundedCornerShape(16.dp)
   ) {
      TodoRow(
         title = title,
         done = done,
         onToggle = { checked -> done = checked }
      )
   }
}

