package andres.rangel.livescore.navigation

import andres.rangel.livescore.R

sealed class Screen(val route: String, val icon: Int? = null) {
    object Auth : Screen("Auth")
    object Home : Screen("Home", icon = R.drawable.home)
    object News : Screen("News", icon = R.drawable.explorer)
    object Standing : Screen("Standing", icon = R.drawable.standings)
    object Profile : Screen("Profile", icon = R.drawable.user)
    object MatchDetail : Screen("MatchDetail")
    object TeamDetail : Screen("TeamDetail")
    object NewsDetail : Screen("NewsDetail")
    object StandingDetail : Screen("StandingDetail")
}