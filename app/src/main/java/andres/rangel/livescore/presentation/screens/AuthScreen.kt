package andres.rangel.livescore.presentation.screens

import andres.rangel.livescore.presentation.components.LoginDialog
import andres.rangel.livescore.presentation.components.RegisterDialog
import andres.rangel.livescore.presentation.ui.theme.backgroundDark
import andres.rangel.livescore.presentation.ui.theme.backgroundLight
import andres.rangel.livescore.presentation.ui.theme.blueLight
import andres.rangel.livescore.presentation.ui.theme.grayLight
import andres.rangel.livescore.presentation.ui.theme.white
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ShapeDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import coil.compose.AsyncImage

@Composable
fun AuthScreen(navController: NavHostController) {
    var showLoginDialog by remember { mutableStateOf(false) }
    var showRegisterDialog by remember { mutableStateOf(false) }

    LoginDialog(showLoginDialog, navController) { showLogin, showRegister ->
        showLoginDialog = showLogin
        showRegisterDialog = showRegister
    }

    RegisterDialog(showRegisterDialog) { showLogin, showRegister ->
        showLoginDialog = showLogin
        showRegisterDialog = showRegister
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = backgroundDark)
            .padding(
                horizontal = 40.dp,
                vertical = 20.dp
            )
    ) {
        Box(
            modifier = Modifier
                .height(400.dp)
                .padding(bottom = 30.dp)
        ) {
            Box(
                modifier = Modifier
                    .width(320.dp)
                    .height(280.dp)
                    .background(
                        color = backgroundLight,
                        shape = RoundedCornerShape(
                            topStart = 70.dp,
                            topEnd = 70.dp,
                            bottomEnd = 70.dp
                        )
                    )
                    .align(Alignment.BottomCenter)
            )
            AsyncImage(
                modifier = Modifier
                    .height(400.dp)
                    .padding(top = 40.dp, end = 5.dp),
                model = "https://clipart.info/images/ccovers/1630349435goal-kylian-mbappe-png-paris.png",
                contentDescription = "Best Player",
                contentScale = ContentScale.Crop
            )
        }
        Text(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 20.dp),
            text = "Discover all about sport",
            color = white,
            fontSize = 38.sp,
            lineHeight = 40.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            modifier = Modifier.fillMaxWidth(),
            text = "Search millions of jobs and get the inside scoop on companies. \n" +
                    "Wait for what? Let's get start it!",
            color = grayLight,
            fontSize = 16.sp
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 50.dp)
        ) {
            Button(
                modifier = Modifier
                    .height(60.dp)
                    .weight(0.6f),
                onClick = { showLoginDialog = true },
                shape = ShapeDefaults.Large,
                colors = ButtonDefaults.buttonColors(
                    containerColor = blueLight,
                    contentColor = white
                )
            ) {
                Text(
                    text = "Sign in",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )
            }
            Button(
                modifier = Modifier
                    .height(60.dp)
                    .weight(0.4f)
                    .padding(start = 20.dp),
                onClick = { showRegisterDialog = true },
                shape = ShapeDefaults.Large,
                colors = ButtonDefaults.buttonColors(
                    containerColor = backgroundDark,
                    contentColor = white
                )
            ) {
                Text(
                    text = "Sign Up",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}