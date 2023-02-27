package com.blogspot.kannanpvm007.gift_module

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.blogspot.kannanpvm007.gift_module.event.EventDetailsScreen
import com.blogspot.kannanpvm007.gift_module.event.EventListScreen
import com.blogspot.kannanpvm007.gift_module.gift.GiftDetailsScreen
import com.blogspot.kannanpvm007.gift_module.gift.GiftListScreen
import com.blogspot.kannanpvm007.themelibrary.theme.route.Root
import com.blogspot.kannanpvm007.themelibrary.theme.route.Route

/**
 * Created by #kannanpvm007 on  27/02/23.
 */


fun NavGraphBuilder.homeNavGraph(){
    eventGraph()
    giftGraph()
}
fun NavGraphBuilder.eventGraph(){
    navigation(startDestination = Route.Home.EVENT.LIST, route = Root.Home.EVENTS){

        composable(Route.Home.EVENT.LIST){
            EventListScreen()
        }
        composable(Route.Home.EVENT.MANAGE_EVENT){
            EventDetailsScreen()
        }
    }
}

fun NavGraphBuilder.giftGraph(){
        navigation( startDestination = Route.Home.GIFT.LIST, route = Root.Home.GIFTS){
            composable(Route.Home.GIFT.LIST){
                GiftListScreen()
            }

            composable(Route.Home.GIFT.MANAGE_GIFT){
                GiftDetailsScreen()
            }
        }
}