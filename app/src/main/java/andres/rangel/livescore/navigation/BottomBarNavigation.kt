package andres.rangel.livescore.navigation

import andres.rangel.livescore.R
import andres.rangel.livescore.presentation.screens.AuthScreen
import andres.rangel.livescore.presentation.screens.HomeScreen
import andres.rangel.livescore.presentation.screens.MatchDetailScreen
import andres.rangel.livescore.presentation.screens.NewsScreen
import andres.rangel.livescore.presentation.screens.ProfileScreen
import andres.rangel.livescore.presentation.screens.StandingsScreen
import andres.rangel.livescore.presentation.ui.theme.backgroundLight
import andres.rangel.livescore.presentation.ui.theme.blueLight
import andres.rangel.livescore.presentation.ui.theme.grayLight
import andres.rangel.livescore.presentation.ui.theme.white
import android.annotation.SuppressLint
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.ShapeDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState

val bottomBarItems = listOf(
    Screen.Home,
    Screen.News,
    Screen.Standing,
    Screen.Profile
)

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BottomBarNavigation(navController: NavHostController) {
    Scaffold(
        bottomBar = {
            val navBackStackEntry = navController.currentBackStackEntryAsState()
            val currentDestination = navBackStackEntry.value?.destination
            val secondaryScreens = listOf(
                Screen.MatchDetail.route
            )
            if (currentDestination?.route in bottomBarItems.map { it.route } + secondaryScreens) {
                BottomNavigation(
                    modifier = Modifier
                        .height(80.dp),
                    backgroundColor = backgroundLight,
                    elevation = 8.dp
                ) {
                    bottomBarItems.forEach { screen ->
                        val isSelected =
                            if (currentDestination?.route == Screen.MatchDetail.route) {
                                screen.route == Screen.Home.route
                            } else {
                                currentDestination?.hierarchy?.any { it.route == screen.route } == true
                            }
                        BottomNavigationItem(
                            modifier = Modifier.fillMaxSize(),
                            selected = isSelected,
                            onClick = {
                                navController.navigate(screen.route) {
                                    popUpTo(navController.graph.findStartDestination().id) {
                                        saveState = true
                                    }
                                    launchSingleTop = true
                                    restoreState = true
                                }
                            },
                            icon = {
                                if (isSelected) {
                                    Icon(
                                        modifier = Modifier
                                            .size(6.dp)
                                            .border(
                                                border = BorderStroke(3.dp, blueLight),
                                                shape = ShapeDefaults.Small
                                            ),
                                        painter = painterResource(id = R.drawable.topline),
                                        tint = blueLight,
                                        contentDescription = "Screen icon"
                                    )
                                } else {
                                    Icon(
                                        modifier = Modifier.size(25.dp),
                                        painter = painterResource(id = screen.icon!!),
                                        tint = grayLight,
                                        contentDescription = "Screen icon"
                                    )
                                }
                            },
                            label = {
                                Text(
                                    text = screen.route,
                                    style = TextStyle(
                                        color = blueLight,
                                        fontSize = 15.sp
                                    )
                                )
                            },
                            alwaysShowLabel = false,
                            selectedContentColor = white,
                            unselectedContentColor = white
                        )
                    }
                }
            }
        }
    ) {
        NavHost(
            navController = navController,
            startDestination = Screen.Home.route
        ) {
            composable(Screen.Auth.route) {
                AuthScreen(navController)
            }
            composable(Screen.Home.route) {
                HomeScreen(navController)
            }
            composable(Screen.News.route) {
                NewsScreen()
            }
            composable(Screen.Standing.route) {
                StandingsScreen()
            }
            composable(Screen.Profile.route) {
                ProfileScreen()
            }
            composable(Screen.MatchDetail.route) {
                MatchDetailScreen(navController)
            }
        }
    }
}