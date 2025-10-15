package de.rogallab.mobile.ui

//import de.rogallab.mobile.ui.navigation.composables.AppNavHost
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import de.rogallab.mobile.ui.base.BaseActivity
import de.rogallab.mobile.ui.theme.AppTheme
import de.rogallab.mobile.ui.ue22_1.CardScreen
import de.rogallab.mobile.ui.ue22_2.ProgressScreen
import de.rogallab.mobile.ui.ue22_3.TodoScreen

class MainActivity: BaseActivity(TAG) {

   override fun onCreate(savedInstanceState: Bundle?) {
      super.onCreate(savedInstanceState)
      enableEdgeToEdge()
      setContent {
         AppTheme {
            Scaffold(
               containerColor = MaterialTheme.colorScheme.background,
               contentWindowInsets = WindowInsets.safeDrawing,
               modifier = Modifier
                  .fillMaxSize()
                  .padding(horizontal = 16.dp, vertical = 8.dp)
            ) { innerPadding ->

               val scrollState = rememberScrollState()

               Column(
                  modifier = Modifier
                     .padding(innerPadding)
                     .fillMaxSize()
                     .verticalScroll(scrollState),
                  verticalArrangement = Arrangement.spacedBy(32.dp)
               ) {
                  CardScreen(name = "Bernd Rogalla")

                  //ProgressScreen()

                  // TodoScreen(title = "Einkaufen gehen")

                  //RememberVsSaveableScreen()

                  //CharCounterScreen()
               }
            }
         }
      }
   }

   companion object {
      private const val TAG = "<-MainActivity"
      const val IS_INFO = true
      const val IS_DEBUG = true
      const val IS_VERBOSE = true
   }

}

//region ue22_1 CardScreen Preview
@Preview(showBackground = true)
@Composable
private fun CardScreenPreviewLight() {
   AppTheme {
      Scaffold(contentWindowInsets = WindowInsets.safeDrawing) { p ->
         CardScreen(name = "Bernd Rogalla", modifier = Modifier.padding(p))
      }
   }
}

@Preview(showBackground = true)
@Composable
private fun CardScreenPreviewDark() {
   AppTheme(darkTheme = true) {
      Scaffold(contentWindowInsets = WindowInsets.safeDrawing) { p ->
         CardScreen(name = "Bernd Rogalla", modifier = Modifier.padding(p))
      }
   }
}
//endregion

//region ue22_2 ProgressScreen Preview
@Preview(showBackground = true)
@Composable
private fun ProgressScreenPreviewLight() {
   AppTheme {
      ProgressScreen()
      Scaffold(contentWindowInsets = WindowInsets.safeDrawing) { p ->
         ProgressScreen(modifier = Modifier.padding(p))
      }
   }
}

@Preview(showBackground = true)
@Composable
private fun ProgressScreenPreviewDark() {
   AppTheme(darkTheme = true) {
      Scaffold(contentWindowInsets = WindowInsets.safeDrawing) { p ->
         ProgressScreen(modifier = Modifier.padding(p))
      }
   }
}
//endregion

//region ue22_3 TodoScreen Preview
@Preview(showBackground = true)
@Composable
private fun ToDoScreenPreviewLight() {
   AppTheme {
      ProgressScreen()
      Scaffold(contentWindowInsets = WindowInsets.safeDrawing) { p ->
         TodoScreen(
            title = "Einkaufen gehen",
            modifier = Modifier.padding(p)
         )
      }
   }
}
@Preview(showBackground = true)
@Composable
private fun TodoScreenPreviewDark() {
   AppTheme(darkTheme = true) {
      Scaffold(contentWindowInsets = WindowInsets.safeDrawing) { p ->
         TodoScreen(
            title = "Einkaufen gehen",
            modifier = Modifier.padding(p)
         )
      }
   }
}
//endregion