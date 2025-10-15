package de.rogallab.mobile.ui.ue24_4

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun LoginScreen(
   viewModel: LoginViewModel = viewModel(),
   modifier: Modifier
) {

   val loginUiState by viewModel.loginUiState.collectAsState()

   Column(
      modifier = modifier.fillMaxWidth(),
      verticalArrangement = Arrangement.spacedBy(16.dp, Alignment.CenterVertically),
      horizontalAlignment = Alignment.CenterHorizontally
   ) {

      Row(
         horizontalArrangement = Arrangement.spacedBy(16.dp),
         verticalAlignment = Alignment.CenterVertically
      ) {

         Button(
            onClick = {
               viewModel.handleIntent(LoginIntent.Login)
            },
            enabled = !loginUiState.loggedIn
         ) {
            Text(
               text = "Login",
               modifier = Modifier
                  .width(100.dp)
                  .wrapContentWidth(Alignment.CenterHorizontally)
            )
         }

         Button(
            onClick = {
               viewModel.handleIntent(LoginIntent.Logout)
            },
            enabled = loginUiState.loggedIn
         ) {
            Text(
               text = "Logout",
               modifier = Modifier
                  .width(100.dp)
                  .wrapContentWidth(Alignment.CenterHorizontally)
            )
         }
      }

      Text(if (loginUiState.loggedIn) "Willkommen zurück!" else "Bitte einloggen")
   }
}

