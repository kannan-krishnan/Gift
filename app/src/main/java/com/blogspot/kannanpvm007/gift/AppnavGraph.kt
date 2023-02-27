package com.blogspot.kannanpvm007.gift

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.blogspot.kannanpvm007.authmodle.authNavGraph
import com.blogspot.kannanpvm007.gift_module.homeNavGraph
import com.blogspot.kannanpvm007.themelibrary.theme.route.Root
import com.blogspot.kannanpvm007.wlcome_model.welcomeNavGraph

/**
 * Created by #kannanpvm007 on  27/02/23.
 */
@Composable
fun AppnavGraph(comtrller:NavHostController)   {
    NavHost(navController = comtrller, startDestination = Root.WELCOME, route = Root.APPROOT ){
        welcomeNavGraph()
        homeNavGraph()
        authNavGraph()
    }
}