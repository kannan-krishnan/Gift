package com.blogspot.kannanpvm007.wlcome_model

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.blogspot.kannanpvm007.themelibrary.theme.route.Root
import com.blogspot.kannanpvm007.themelibrary.theme.route.Route
import com.blogspot.kannanpvm007.wlcome_model.feature.FeatureScreen
import com.blogspot.kannanpvm007.wlcome_model.splash.SplashScreen
import com.blogspot.kannanpvm007.wlcome_model.tac.TermsScreen

/**
 * Created by #kannanpvm007 on  27/02/23.
 */

fun NavGraphBuilder.welcomeNavGraph() {
    navigation(startDestination = Route.Welcome.SPLASH, route = Root.WELCOME) {
        composable(Route.Welcome.SPLASH) {
            SplashScreen()
        }
        composable(Route.Welcome.FEATURE) {
            FeatureScreen()
        }
        composable(Route.Welcome.TNC) {
            TermsScreen()
        }
    }
}