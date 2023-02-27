package com.blogspot.kannanpvm007.authmodle

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.blogspot.kannanpvm007.authmodle.ui.forgot.ForgetPasswordScreen
import com.blogspot.kannanpvm007.authmodle.ui.login.LoginScreen
import com.blogspot.kannanpvm007.authmodle.ui.register.RegisterScreen
import com.blogspot.kannanpvm007.themelibrary.theme.route.Root
import com.blogspot.kannanpvm007.themelibrary.theme.route.Route

/**
 * Created by #kannanpvm007 on  27/02/23.
 */

fun NavGraphBuilder.authNavGraph(){

    navigation(startDestination = Route.Auth.Login.LOGIN,route=Root.AUTH){
        composable(Route.Auth.REGISTER){
            RegisterScreen()
        }
        loginNavGraph()

    }
}

fun NavGraphBuilder.loginNavGraph() {

    navigation(startDestination = Route.Auth.Login.LOGIN, route = Root.Auth.LOGIN) {

        composable(Route.Auth.Login.LOGIN) {
            LoginScreen()
        }
        composable(Route.Auth.Login.FORGET_PASSWORD) {
            ForgetPasswordScreen()
        }
    }
}