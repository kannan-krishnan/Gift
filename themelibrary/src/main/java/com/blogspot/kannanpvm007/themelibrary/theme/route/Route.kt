package com.blogspot.kannanpvm007.themelibrary.theme.route

/**
 * Created by #kannanpvm007 on  27/02/23.
 */

object Route {
    object Control {
        const val Back = "back"
    }
    object Welcome {
        const val SPLASH = "splash"
        const val FEATURE = "feature"
        const val TNC = "termscondition"
    }

    object Home {
        object EVENT {
            const val LIST = "events"
            const val SORTSCREEN="sortscreen"
            const val EVENT_EMPTY_SCREEN ="eventemptyscreen"
            const val ABOUT="adoutscreen"
            const val CONTACT_US = "contact_us"
            const val MANAGE_EVENT= "manageEvent"
        }

        object GIFT {
            object Argument {
                const val eventId= "eventId"
                const val guestId = "guestId"
                const val query = "query"
            }
            const val LIST = "guest?${Argument.query}={${Argument.query}}"
            const val MANAGE_GIFT = "guest"

        }

    }

    object Auth {
        const val REGISTER = "register"

        object Login {
            const val LOGIN = "login"
            const val FORGET_PASSWORD = "forgetpassword"
        }
    }

}

/** To hold the nav graph roots */
object Root {
    const val APPROOT = "approot"
    const val WELCOME = "welcomeroot"
    const val HOME = "homeroot"
    const val AUTH = "authroot"
    const val DRIVE = "driveRoot"

    object Home {
        const val EVENTS = "eventsroot"
        const val GIFTS = "giftroot"
    }
    object Drive {
        const val INTRO = "drive_intro"
    }

    object Auth {
        const val LOGIN = "loginroot"
    }
}