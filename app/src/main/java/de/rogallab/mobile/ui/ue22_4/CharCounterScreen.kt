package de.rogallab.mobile.ui.ue22_4

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import de.rogallab.mobile.ui.base.logDebug

private const val MAX_LEN = 20

@Composable
fun CharCounterScreen(
   modifier: Modifier = Modifier,
   onSave: (String) -> Unit = {}
) {
   var text by rememberSaveable { mutableStateOf("") }
   val isValid = text.isNotBlank() && text.length <= MAX_LEN

   Column(
      modifier = modifier.fillMaxWidth(),
      verticalArrangement = Arrangement.spacedBy(12.dp)
   ) {
      TextField(
         value = text,
         onValueChange = { input ->
            text = input // input.take(MAX_LEN)
            logDebug("CharCounterScreen","text=$text, length=${text.length} , isValid=$isValid")
         },
         label = { Text("Name") },
         singleLine = true,
         supportingText = { Text("${text.length}/$MAX_LEN") },
         modifier = Modifier.fillMaxWidth()
      )

      Button(
         onClick = { onSave(text) },
         enabled = isValid
      ) { Text("Save") }
   }
}

