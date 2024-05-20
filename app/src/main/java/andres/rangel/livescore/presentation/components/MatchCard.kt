package andres.rangel.livescore.presentation.components

import andres.rangel.livescore.navigation.Screen
import andres.rangel.livescore.presentation.ui.theme.grayDark
import andres.rangel.livescore.presentation.ui.theme.grayLight2
import andres.rangel.livescore.presentation.ui.theme.white
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.AsyncImage

@Composable
fun MatchCard(
    navController: NavController,
    imageTeamA: String,
    imageTeamB: String,
    teamA: String,
    teamB: String,
    scoreTeamA: String,
    scoreTeamB: String,
    timer: String
) {
    Box(
        modifier = Modifier
            .padding(bottom = 20.dp)
            .clickable { navController.navigate(Screen.MatchDetail.route) }
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(75.dp)
                .background(
                    color = grayLight2,
                    shape = RoundedCornerShape(15.dp)
                )
        ) {
            AsyncImage(
                modifier = Modifier
                    .fillMaxHeight()
                    .width(50.dp)
                    .padding(start = 20.dp),
                model = imageTeamA,
                contentDescription = "Team A"
            )
            AsyncImage(
                modifier = Modifier
                    .fillMaxHeight()
                    .width(40.dp)
                    .padding(start = 5.dp),
                model = imageTeamB,
                contentDescription = "Team B"
            )
            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(top = 20.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = teamA,
                    style = TextStyle(
                        fontSize = 14.sp,
                        color = white,
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.SemiBold
                    )
                )
                Text(
                    modifier = Modifier.padding(top = 5.dp),
                    text = scoreTeamA,
                    style = TextStyle(
                        fontSize = 14.sp,
                        color = white,
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.SemiBold
                    )
                )
            }
            Column(
                modifier = Modifier.padding(top = 20.dp)
            ) {
                Text(
                    text = "Vs",
                    style = TextStyle(
                        fontSize = 14.sp,
                        color = white,
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.SemiBold
                    )
                )
                Text(
                    modifier = Modifier.padding(top = 5.dp),
                    text = " - ",
                    style = TextStyle(
                        fontSize = 14.sp,
                        color = white,
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Bold
                    )
                )
            }
            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(top = 20.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = teamB,
                    style = TextStyle(
                        fontSize = 14.sp,
                        color = white,
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.SemiBold
                    )
                )
                Text(
                    modifier = Modifier.padding(top = 5.dp),
                    text = scoreTeamB,
                    style = TextStyle(
                        fontSize = 14.sp,
                        color = white,
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.SemiBold
                    )
                )
            }
            Box(
                modifier = Modifier
                    .fillMaxHeight()
                    .width(45.dp)
                    .background(
                        color = grayDark,
                        shape = RoundedCornerShape(
                            topEnd = 15.dp,
                            bottomEnd = 15.dp
                        )
                    ),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = timer,
                    style = TextStyle(
                        fontSize = 14.sp,
                        color = white,
                        fontWeight = FontWeight.SemiBold
                    )
                )
            }
        }
    }
}