package andres.rangel.livescore.presentation.components

import andres.rangel.livescore.R
import andres.rangel.livescore.presentation.ui.theme.grayLight
import andres.rangel.livescore.presentation.ui.theme.white
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage

@Composable
fun LeagueHeaderCard(
    countryFlag: String,
    leagueName: String,
    country: String,
) {
    Column {
        Row(
            modifier = Modifier.padding(bottom = 15.dp)
        ) {
            AsyncImage(
                modifier = Modifier
                    .height(40.dp)
                    .width(24.dp)
                    .clip(CircleShape),
                model = countryFlag,
                contentDescription = "country flag"
            )
            Column(
                modifier = Modifier
                    .padding(start = 15.dp)
                    .weight(1f)
            ) {
                Text(
                    text = leagueName,
                    style = TextStyle(
                        fontSize = 16.sp,
                        color = white,
                        fontWeight = FontWeight.SemiBold
                    )
                )
                Text(
                    modifier = Modifier.padding(top = 5.dp),
                    text = country,
                    style = TextStyle(
                        fontSize = 14.sp,
                        color = grayLight
                    )
                )
            }
            Icon(
                modifier = Modifier
                    .height(40.dp)
                    .width(15.dp),
                painter = painterResource(id = R.drawable.arrow_right),
                tint = white,
                contentDescription = "Arrow right"
            )
        }
    }
}