package andres.rangel.livescore.presentation.components

import andres.rangel.livescore.R
import andres.rangel.livescore.presentation.ui.theme.backgroundDark
import andres.rangel.livescore.presentation.ui.theme.white
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeTopBar(scrollBehavior: TopAppBarScrollBehavior) {
    TopAppBar(
        modifier = Modifier.height(90.dp),
        title = {
            Text(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(
                        horizontal = 15.dp,
                        vertical = 30.dp
                    ),
                text = "LiveScore",
                fontSize = 25.sp,
                maxLines = 1
            )
        },
        actions = {
            IconButton(
                modifier = Modifier
                    .size(60.dp)
                    .padding(top = 35.dp, end = 15.dp),
                onClick = { }
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.search),
                    contentDescription = "Search Icon"
                )
            }
            IconButton(
                modifier = Modifier
                    .size(60.dp)
                    .padding(top = 35.dp, end = 20.dp),
                onClick = { }
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.notification),
                    contentDescription = "Notification Icon"
                )
            }
        },
        colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
            containerColor = backgroundDark,
            actionIconContentColor = white,
            titleContentColor = white
        ),
        scrollBehavior = scrollBehavior
    )
}