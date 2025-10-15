package de.rogallab.mobile.ui.ue22_2

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import de.rogallab.mobile.ui.base.logDebug
import de.rogallab.mobile.ui.theme.AppTheme
import kotlin.math.max
import kotlin.math.min

// ---------- Stateful Container ----------
@Composable
fun ProgressScreen(
   modifier: Modifier = Modifier
) {
   var tag = "<-ProgressScreen"

   val state: MutableState<Int> =
      remember { mutableIntStateOf(0) }
   var value = state.value

   Column(
      modifier = modifier.fillMaxWidth(),
      verticalArrangement = Arrangement.spacedBy(16.dp)
   ) {
      Stepper(
         value = state.value,
         onDecrement = {
            value = max(--value, 0)
            state.value = value
            logDebug(tag,"${state.value}")
         },
         onIncrement = {
            value = min(++value, 10)
            state.value = value
            logDebug(tag, "${state.value}")
         }
      )

      ProgressInfo(
         value = value,                // zeigt denselben Wert
         max = 10
      )
   }
}

@Preview(showBackground = true, name = "Light")
@Composable
private fun ProgressScreenPreviewLight() {
   AppTheme { ProgressScreen() }
}