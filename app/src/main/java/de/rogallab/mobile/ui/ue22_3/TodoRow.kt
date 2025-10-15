package de.rogallab.mobile.ui.ue22_3

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Checkbox
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp

// ---------- Stateless Composable ----------
@Composable
fun TodoRow(
   title: String,
   done: Boolean,
   onToggle: (Boolean) -> Unit,
   modifier: Modifier = Modifier
) {
   Row(
      modifier = modifier
         .fillMaxWidth()
         .padding(vertical = 8.dp),
      verticalAlignment = Alignment.CenterVertically,
      horizontalArrangement = Arrangement.spacedBy(12.dp)
   ) {
      Checkbox(
         checked = done,
         onCheckedChange = onToggle // gibt nur weiter
      )
      Text(
         text = title,
         style = MaterialTheme.typography.bodyLarge,
         textDecoration = if (done) TextDecoration.LineThrough else TextDecoration.None
      )
      Spacer(Modifier.weight(1f))
   }
}
