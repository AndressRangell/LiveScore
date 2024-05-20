package andres.rangel.livescore.presentation.screens

import andres.rangel.livescore.presentation.components.HomeTopBar
import andres.rangel.livescore.presentation.components.LeagueHeaderCard
import andres.rangel.livescore.presentation.components.MatchCard
import andres.rangel.livescore.presentation.ui.theme.backgroundDark
import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil.compose.AsyncImage

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    navController: NavController
) {
    val scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior(rememberTopAppBarState())
    Scaffold(
        modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
        topBar = {
            HomeTopBar(scrollBehavior = scrollBehavior)
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
                    .fillMaxSize()
                    .padding(
                        horizontal = 30.dp,
                        vertical = 80.dp
                    )
            ) {
                AsyncImage(
                    modifier = Modifier
                        .height(220.dp)
                        .padding(top = 10.dp)
                        .clip(RoundedCornerShape(15.dp)),
                    model = "https://www.diez.hn/binrepository/1200x797/0c0/0d0/none/3014757/DGCX/final-champions-real-madrd-vs-dortmun_7442870_20240508145608.jpg",
                    contentDescription = "Most important match",
                    contentScale = ContentScale.Crop
                )
                Spacer(modifier = Modifier.height(30.dp))
                LeagueHeaderCard(
                    countryFlag = "https://images.emojiterra.com/google/noto-emoji/unicode-15.1/color/1024px/1f1ea-1f1f8.png",
                    leagueName = "La Liga",
                    country = "Spain"
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
                LeagueHeaderCard(
                    countryFlag = "https://png.pngtree.com/png-clipart/20221008/ourmid/pngtree-england-flag-png-image_6291242.png",
                    leagueName = "Premier League",
                    country = "England"
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
                LeagueHeaderCard(
                    countryFlag = "https://images.emojiterra.com/google/noto-emoji/unicode-15.1/color/1024px/1f1ea-1f1f8.png",
                    leagueName = "La Liga",
                    country = "Spain"
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
                LeagueHeaderCard(
                    countryFlag = "https://png.pngtree.com/png-clipart/20221008/ourmid/pngtree-england-flag-png-image_6291242.png",
                    leagueName = "Premier League",
                    country = "England"
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