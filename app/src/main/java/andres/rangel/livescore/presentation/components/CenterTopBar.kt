package andres.rangel.livescore.presentation.components

import andres.rangel.livescore.R
import andres.rangel.livescore.presentation.ui.theme.backgroundDark
import andres.rangel.livescore.presentation.ui.theme.white
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CenterTopBar(
    title: String
) {
    CenterAlignedTopAppBar(
        modifier = Modifier.padding(start = 20.dp),
        title = {
            Text(
                text = title,
                maxLines = 1,
                style = TextStyle(
                    fontSize = 18.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = white
                )
            )
        },
        navigationIcon = {
            Icon(
                painter = painterResource(id = R.drawable.arrow_left),
                contentDescription = "Arrow Left"
            )
        },
        colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
            containerColor = backgroundDark,
            navigationIconContentColor = white
        )
    )
}