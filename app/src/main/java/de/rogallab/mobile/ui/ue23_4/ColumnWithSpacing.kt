package de.rogallab.mobile.ui.ue23_4

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ColumnWithSpacing(
   modifier: Modifier = Modifier
) {
   Column(
      modifier = modifier.fillMaxWidth(),
      horizontalAlignment = Alignment.CenterHorizontally
   ) {
      Text("Text 1")

      Spacer(modifier = Modifier.height(16.dp))

      Text("Text 2")

      Spacer(modifier = Modifier.height(16.dp))

      Text("Text 3")
   }
}
