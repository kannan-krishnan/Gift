package com.blogspot.kannanpvm007.wlcome_model.splash

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

/**
 * Created by #kannanpvm007 on  27/02/23.
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SplashScreen() {
    Scaffold(modifier = Modifier.fillMaxSize()) {
        LazyColumn(contentPadding = it){
            item { 
                Text(text = "Welcome Splash Screen", style = MaterialTheme.typography.headlineLarge)
            }
        }

        
    }
}