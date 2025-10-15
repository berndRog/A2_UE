package de.rogallab.mobile.ui.ue24_1

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun NameScreen(
   viewModel: NameViewModel = viewModel(),
   modifier: Modifier = Modifier
) {
   val nameUiState by viewModel.nameUiState.collectAsState()
   var input by remember { mutableStateOf("") }

   Column(
      modifier = modifier,
      verticalArrangement = Arrangement.spacedBy(8.dp)
   ) {
      OutlinedTextField(
         modifier = Modifier.fillMaxWidth(),
         value = input,
         onValueChange = { input = it },
         label = { Text("Name") }
      )
      Button(
         onClick = {
            viewModel.handleIntent(NameIntent.Save(input))

      }) {
         Text("Speichern")
      }
      Text("Gespeicherter Name: ${nameUiState.name}")
   }
}

