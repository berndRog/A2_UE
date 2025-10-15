package de.rogallab.mobile.ui.ue22_2

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme.typography
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// Stateless Composable Stepper
@Composable
fun Stepper(
   value: Int,
   onDecrement: () -> Unit,
   onIncrement: () -> Unit,
) {

   Row(
      verticalAlignment = Alignment.CenterVertically,
      horizontalArrangement = Arrangement.Center,
      modifier = Modifier.fillMaxWidth()
   ) {
      Button(
         onClick = onDecrement,
         enabled = value >= 1,
         modifier = Modifier.padding(end = 24.dp)
      ) {
         Text(
            text = "-",
            textAlign = TextAlign.Center,
            modifier = Modifier.size(width = 64.dp, height = 32.dp),
            fontSize = 24.sp
         )
      }

      Text(
         text = "$value/10",
         fontSize = 24.sp,
         modifier = Modifier.size(width = 72.dp, height = 24.dp)
      )


      Button(
         onClick = onIncrement,
         enabled = value <= 9,
         modifier = Modifier.padding(start = 24.dp)
      ) {
         Text(
            text = "+",
            textAlign = TextAlign.Center,
            modifier = Modifier.size(width = 64.dp, height = 32.dp),
            fontSize = 24.sp
         )
      }

   }
}