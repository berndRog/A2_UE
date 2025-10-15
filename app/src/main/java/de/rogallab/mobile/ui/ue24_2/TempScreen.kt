package de.rogallab.mobile.ui.ue24_2

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Remove
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme.typography
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun TempScreen(
   viewModel: TempViewModel = viewModel(),
   modifier: Modifier = Modifier
) {
   val state by viewModel.tempUiState.collectAsState()

   Column(
      modifier = modifier.fillMaxSize(),
      horizontalAlignment = Alignment.CenterHorizontally
   ) {
      Text(
         text = "Temperatur: ${state.temperature} °C",
         style = typography.bodyLarge
      )

      Row {
         Button(
            onClick = {
               viewModel.handleIntent(TempIntent.Decrease)
            }
         ) {
            Icon(
               imageVector = Icons.Default.Remove,
               contentDescription = "Decrease temperature",
               modifier  = Modifier
                  .width(60.dp),
            )
         }

         Spacer(Modifier.width(16.dp))

         Button(
            onClick = {
               viewModel.handleIntent(TempIntent.Increase)
            }
         ) {
            Icon(
               imageVector = Icons.Default.Add,
               contentDescription = "Increase temperature",
               modifier  = Modifier
                  .width(60.dp),
            )
         }
      }
   }
}


