package de.rogallab.mobile.ui.ue23_7

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScaffoldWithTopAppBar() {
   Scaffold(
      topBar = {
         TopAppBar(
            title = { Text("Meine App") },

            navigationIcon = {
               IconButton(onClick = { /* TODO */ }) {
                  Icon(Icons.Default.Menu, contentDescription = "Menu")
               }
            },
            actions = {
               IconButton(onClick = { /* TODO */ }) {
                  Icon(Icons.Default.Search, contentDescription = "Search")
               }
            }
         )
      }
   ) { innerPadding ->
      // Inhalt
      Column(
         modifier = Modifier
            .padding(innerPadding)
            .fillMaxSize(),
         horizontalAlignment = Alignment.CenterHorizontally
      ) {
         Text(
            text = "Hallo Scaffold!",
            modifier = Modifier.padding(top = 32.dp))
      }
   }
}
