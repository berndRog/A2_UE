package de.rogallab.mobile.ui.ue23_3

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp

@Composable
fun PriceWithBaseline(
   modifier: Modifier = Modifier
) {
   Row(
      modifier = modifier
         .fillMaxWidth(),
      //verticalAlignment = Alignment.Bottom // nur Fallback
   ) {
      Text(
         text = "199",
         fontSize = 36.sp,
         modifier = Modifier.alignByBaseline()
      )
      Text(
         text = " €",
         fontSize = 24.sp,
         modifier = Modifier.alignByBaseline()
      )

   }
}
