package de.rogallab.mobile.ui.ue24_3

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun ShopScreen(
   viewModel: ShopViewModel = viewModel(),
   modifier: Modifier = Modifier
) {
   val shopUiState by viewModel.shopUiState.collectAsState()
   var input by remember { mutableStateOf("") }

   Column(
      modifier = modifier,
      verticalArrangement = Arrangement.spacedBy(8.dp)
   ){
      OutlinedTextField(
         modifier = Modifier.fillMaxWidth(),
         value = input,
         onValueChange = { input = it },
         label = { Text("Item") }
      )
      Row(
         modifier = Modifier.fillMaxWidth(),
         horizontalArrangement = Arrangement.Center,
         verticalAlignment = Alignment.CenterVertically
      ) {
         Button(
            onClick = {
               viewModel.handleIntent(ShopIntent.AddItem(input))
               input = ""
            }
         ) {
            Text(
               text = "Hinzufügen",
               modifier = Modifier
                  .width(120.dp)
                  .wrapContentWidth(Alignment.CenterHorizontally)
            )
         }
         Spacer(Modifier.width(8.dp))
         Button(
            onClick = {
               viewModel.handleIntent(ShopIntent.ClearList)
            }
         ) {
            Text(
               text = "Leeren",
               modifier = Modifier
                  .width(120.dp)
                  .wrapContentWidth(Alignment.CenterHorizontally)
            )
         }
      }
      LazyColumn {
         itemsIndexed(shopUiState.items) { index, item ->
            Text("${index + 1}. $item")
         }
      }
   }
}
