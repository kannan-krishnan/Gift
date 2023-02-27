@file:OptIn(ExperimentalMaterial3Api::class)

package com.blogspot.kannanpvm007.gift

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.blogspot.kannanpvm007.themelibrary.theme.AppTheme

class MainActivity : ComponentActivity() {

    private lateinit var navController: NavHostController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppTheme() {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    SetUpNavGraph()
                }
            }
        }
    }

@Composable
    fun SetUpNavGraph(){
        navController= rememberNavController()
    AppnavGraph(comtrller = navController)
    }

    @Composable
    fun SetUpNavGraphOld() {
        navController = rememberNavController()
        NavHost(navController = navController, startDestination = "SplashScreen") {
            composable("HomePage") {
                HomePage()
            }
            composable("SplashScreen") {
                SplashScreen(navController)
            }

        }
    }
}


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomePage() {
    Scaffold {
        Text(
            text = "Home Page",
            modifier = Modifier.padding(16.dp),
            style = MaterialTheme.typography.headlineLarge
        )
    }

}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun SplashScreen(navController: NavHostController) {
    Scaffold {
        Column {


            Text(
                text = "SplashScreen",
                modifier = Modifier.padding(16.dp),
                style = MaterialTheme.typography.headlineMedium
            )
            Button(onClick = {
                navController.navigate("HomePage")
            }) {
                Text(text = "Home Screen")
            }
        }
    }
}