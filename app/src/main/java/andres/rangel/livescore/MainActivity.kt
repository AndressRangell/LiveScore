package andres.rangel.livescore

import andres.rangel.livescore.navigation.BottomBarNavigation
import andres.rangel.livescore.presentation.ui.theme.LiveScoreTheme
import andres.rangel.livescore.presentation.ui.theme.backgroundDark
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LiveScoreTheme {
                val navController = rememberNavController()

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = backgroundDark
                ) {
                    BottomBarNavigation(navController = navController)
                }
            }
        }
    }
}