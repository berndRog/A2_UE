package de.rogallab.mobile.ui.ue22_1

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun CardScreen(
   name: String,
   modifier: Modifier = Modifier
) {
   Card(
      modifier = modifier.fillMaxWidth() ,
      shape = RoundedCornerShape(16.dp)
   ) {
      Text(
         text = "Hallo ${name.trim().ifEmpty { "Welt" }}",
         modifier = Modifier.padding(16.dp),
         style = MaterialTheme.typography.bodyLarge
      )
   }
}


