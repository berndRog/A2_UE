package de.rogallab.mobile.ui.ue22_2

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import kotlin.math.roundToInt

// ---------- Stateless: ProgressInfo ----------
@Composable
fun ProgressInfo(
   value: Int,
   max: Int,
   modifier: Modifier = Modifier
) {
   val fraction = (value.coerceIn(0, max)).toFloat() / max.toFloat()

   Column(
      modifier = modifier.fillMaxWidth().padding(horizontal = 16.dp),
      verticalArrangement = Arrangement.spacedBy(8.dp)
   ) {
      // simple beam
      Box(
         Modifier
            .fillMaxWidth()
            .height(24.dp)
            .clip(RoundedCornerShape(12.dp))
            .background(MaterialTheme.colorScheme.surfaceVariant)
      ) {
         Box(
            Modifier
               .fillMaxHeight()
               .fillMaxWidth(fraction)
               .background(MaterialTheme.colorScheme.primary)
         )
      }

      Text(
         "${(fraction * 100).roundToInt()}%  ($value / $max)",
         style = MaterialTheme.typography.bodyLarge
      )
   }
}
