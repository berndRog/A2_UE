package de.rogallab.mobile.ui.base

import android.content.res.Configuration
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import de.rogallab.mobile.ui.MainActivity.Companion.IS_DEBUG
import de.rogallab.mobile.ui.MainActivity.Companion.IS_INFO
import de.rogallab.mobile.ui.MainActivity.Companion.IS_VERBOSE

open class BaseActivity(
   private val _tag: String
) : ComponentActivity() {


   // Activity is first created
   override fun onCreate(savedInstanceState: Bundle?) {
      super.onCreate(savedInstanceState)
      if (savedInstanceState == null)
         logInfo(_tag, "onCreate() Bundle == null")
      else
         logInfo(_tag, "onCreate() Bundle != null")
   }

   // Activity is restarted
   override fun onRestart() {
      super.onRestart()
      logInfo(_tag, "onRestart()")
   }

   // Activity is visible
   override fun onStart() {
      super.onStart()
      logInfo(_tag, "onStart()")
   }

   // Activity interacts with the user
   override fun onResume() {
      super.onResume()
      logInfo(_tag, "onResume()")
   }

   // User is leaving activity
   override fun onPause() {
      logInfo(_tag, "onPause()")
      super.onPause()
   }

   // Activity is no longer visible
   override fun onStop() {
      logInfo(_tag, "onStop()")
      super.onStop()
   }

   // Called before the activity is destroyed.
   override fun onDestroy() {
      logInfo(_tag, "onDestroy()")
      super.onDestroy()
   }

   // Save instance state: invoked when the activity may be temporarily destroyed,
   override fun onSaveInstanceState(outState: Bundle) {
      super.onSaveInstanceState(outState)
      logInfo(_tag, "onSaveInstanceState()")
   }

   override fun onRestoreInstanceState(savedInstanceState: Bundle) {
      super.onRestoreInstanceState(savedInstanceState)
      logInfo(_tag, "onRestoreInstanceState()")
   }

   override fun onConfigurationChanged(newConfig: Configuration) {
      super.onConfigurationChanged(newConfig)

      // Checks the orientation of the screen
      if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
         logInfo(_tag, "landscape")
      } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
         logInfo(_tag, "portrait")
      }
   }

   override fun onWindowFocusChanged(hasFocus: Boolean) {
      logInfo(_tag, "onWindowFocusChanged() $hasFocus")
      super.onWindowFocusChanged(hasFocus)
   }
}


fun logError(tag: String, message: String) {
   val msg = formatMessage(message)
   Log.e(tag, msg)
}
fun logInfo(tag: String, message: String) {
   val msg = formatMessage(message)
   if(IS_INFO) Log.i(tag, msg)
}
fun logDebug(tag: String, message: String) {
   val msg = formatMessage(message)
   if (IS_DEBUG) Log.d(tag, msg)
}
fun logVerbose(tag: String, message: String) {
   if (IS_VERBOSE) Log.v(tag, message)
}

private fun formatMessage(message: String) =
   String.format("%-90s %s", message, Thread.currentThread().toString())
