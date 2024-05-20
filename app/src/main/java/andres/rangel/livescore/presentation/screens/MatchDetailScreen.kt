package andres.rangel.livescore.presentation.screens

import andres.rangel.livescore.presentation.components.CenterTopBar
import andres.rangel.livescore.presentation.components.MatchCard
import andres.rangel.livescore.presentation.ui.theme.backgroundDark
import andres.rangel.livescore.presentation.ui.theme.backgroundLight
import andres.rangel.livescore.presentation.ui.theme.variant
import andres.rangel.livescore.presentation.ui.theme.white
import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import coil.compose.AsyncImage

val column1Data = listOf("8", "22", "42", "3", "8")
val column2Data = listOf("Shooting", "Attacks", "Possession", "Yellow Cards", "Corners")
val column3Data = listOf("12", "29", "58", "5", "7")

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MatchDetailScreen(
    navController: NavHostController
) {
    Scaffold(
        topBar = {
            CenterTopBar(title = "La Liga")
        }
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(color = backgroundDark)
                .verticalScroll(rememberScrollState())
        ) {
            Column(
                modifier = Modifier
                    .padding(
                        vertical = 80.dp,
                        horizontal = 30.dp
                    )
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceAround
                ) {
                    AsyncImage(
                        modifier = Modifier
                            .size(80.dp)
                            .background(
                                color = backgroundLight,
                                shape = CircleShape
                            )
                            .padding(10.dp),
                        model = "https://seeklogo.com/images/F/fc-barcelona-rugby-logo-8F77CA5AD8-seeklogo.com.png",
                        contentDescription = "Team A"
                    )
                    Text(
                        modifier = Modifier.padding(top = 15.dp),
                        text = "2 - 0",
                        style = TextStyle(
                            color = white,
                            fontSize = 40.sp,
                            fontWeight = FontWeight.Bold
                        )
                    )
                    AsyncImage(
                        modifier = Modifier
                            .size(80.dp)
                            .background(
                                color = backgroundLight,
                                shape = CircleShape
                            )
                            .padding(10.dp),
                        model = "https://img.uefa.com/imgml/TP/teams/logos/240x240/50051.png",
                        contentDescription = "Team B"
                    )
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 15.dp),
                    horizontalArrangement = Arrangement.SpaceAround
                ) {
                    Text(
                        modifier = Modifier.width(90.dp),
                        text = "Barcelona",
                        style = TextStyle(
                            color = white,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.SemiBold
                        ),
                        textAlign = TextAlign.Center
                    )
                    Text(
                        text = "90.15",
                        style = TextStyle(
                            color = white,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.SemiBold
                        )
                    )
                    Text(
                        modifier = Modifier.width(90.dp),
                        text = "Real Madrid",
                        style = TextStyle(
                            color = white,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.SemiBold
                        ),
                        textAlign = TextAlign.Center
                    )
                }
                Row(
                    modifier = Modifier
                        .padding(
                            top = 30.dp,
                            bottom = 20.dp
                        )
                ) {
                    Box(
                        modifier = Modifier
                            .height(50.dp)
                            .weight(1f)
                            .background(
                                color = variant,
                                shape = RoundedCornerShape(30.dp)
                            ),
                        contentAlignment = Center
                    ) {
                        Text(
                            text = "Match Detail",
                            style = TextStyle(
                                color = white,
                                fontSize = 16.sp,
                                fontWeight = FontWeight.SemiBold,
                                textAlign = TextAlign.Center,
                            )
                        )
                    }
                    Box(
                        modifier = Modifier
                            .height(50.dp)
                            .weight(1f)
                            .background(
                                color = backgroundDark,
                                shape = RoundedCornerShape(30.dp)
                            ),
                        contentAlignment = Center
                    ) {
                        Text(
                            text = "Line Up",
                            style = TextStyle(
                                color = white,
                                fontSize = 16.sp,
                                fontWeight = FontWeight.SemiBold,
                                textAlign = TextAlign.Center,
                            )
                        )
                    }
                    Box(
                        modifier = Modifier
                            .height(50.dp)
                            .weight(1f)
                            .background(
                                color = backgroundDark,
                                shape = RoundedCornerShape(30.dp)
                            ),
                        contentAlignment = Center
                    ) {
                        Text(
                            text = "H2H",
                            style = TextStyle(
                                color = white,
                                fontSize = 16.sp,
                                fontWeight = FontWeight.SemiBold,
                                textAlign = TextAlign.Center,
                            )
                        )
                    }
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 10.dp),
                    horizontalArrangement = Arrangement.SpaceAround
                ) {
                    StatisticsColumn(column1Data)
                    StatisticsColumn(column2Data)
                    StatisticsColumn(column3Data)
                }
                Row(
                    modifier = Modifier.padding(vertical = 20.dp)
                ) {
                    Text(
                        modifier = Modifier.weight(1f),
                        text = "Other Match",
                        style = TextStyle(
                            color = white,
                            fontSize = 24.sp,
                            fontWeight = FontWeight.SemiBold
                        )
                    )
                    Text(
                        modifier = Modifier.padding(top = 5.dp),
                        text = "See all",
                        style = TextStyle(
                            color = white,
                            fontSize = 14.sp,
                            fontWeight = FontWeight.SemiBold
                        )
                    )
                }
                MatchCard(
                    navController = navController,
                    imageTeamA = "https://seeklogo.com/images/F/fc-barcelona-rugby-logo-8F77CA5AD8-seeklogo.com.png",
                    imageTeamB = "https://img.uefa.com/imgml/TP/teams/logos/240x240/50051.png",
                    teamA = "Barcelona",
                    teamB = "Real Madrid",
                    scoreTeamA = "2",
                    scoreTeamB = "0",
                    timer = "40'"
                )
                MatchCard(
                    navController = navController,
                    imageTeamA = "https://1.bp.blogspot.com/-wnUzmswJSQw/XsMFvMzCwFI/AAAAAAABa64/IuO6u1STUz09i6PC4NeF5tANw_0kDyu4gCK4BGAsYHg/d/Aston%2BVilla%2BFC.png",
                    imageTeamB = "https://1.bp.blogspot.com/-nUxW2Eawnig/XSvbvbExK0I/AAAAAAAARAc/LkAREnr6rHMWmCZF1vfxkfgwTcoeL95SQCLcBGAs/s320/escudo1.png",
                    teamA = "Aston Villa",
                    teamB = "Liverpool",
                    scoreTeamA = "2",
                    scoreTeamB = "3",
                    timer = "72'"
                )
                MatchCard(
                    navController = navController,
                    imageTeamA = "https://seeklogo.com/images/F/fc-barcelona-rugby-logo-8F77CA5AD8-seeklogo.com.png",
                    imageTeamB = "https://img.uefa.com/imgml/TP/teams/logos/240x240/50051.png",
                    teamA = "Barcelona",
                    teamB = "Real Madrid",
                    scoreTeamA = "2",
                    scoreTeamB = "0",
                    timer = "40'"
                )
                MatchCard(
                    navController = navController,
                    imageTeamA = "https://1.bp.blogspot.com/-wnUzmswJSQw/XsMFvMzCwFI/AAAAAAABa64/IuO6u1STUz09i6PC4NeF5tANw_0kDyu4gCK4BGAsYHg/d/Aston%2BVilla%2BFC.png",
                    imageTeamB = "https://1.bp.blogspot.com/-nUxW2Eawnig/XSvbvbExK0I/AAAAAAAARAc/LkAREnr6rHMWmCZF1vfxkfgwTcoeL95SQCLcBGAs/s320/escudo1.png",
                    teamA = "Aston Villa",
                    teamB = "Liverpool",
                    scoreTeamA = "2",
                    scoreTeamB = "3",
                    timer = "72'"
                )
            }
        }
    }
}

@Composable
fun StatisticsColumn(data: List<String>) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        data.forEach { item ->
            StatisticText(item)
        }
    }
}

@Composable
fun StatisticText(text: String) {
    Text(
        modifier = Modifier.padding(bottom = 18.dp),
        text = text,
        style = TextStyle(
            color = white,
            fontSize = 18.sp,
            fontWeight = FontWeight.SemiBold,
        )
    )
}