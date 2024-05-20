package andres.rangel.livescore.presentation.components

import andres.rangel.livescore.R
import andres.rangel.livescore.presentation.ui.theme.backgroundDark
import andres.rangel.livescore.presentation.ui.theme.backgroundLight
import andres.rangel.livescore.presentation.ui.theme.blueLight
import andres.rangel.livescore.presentation.ui.theme.grayLight
import andres.rangel.livescore.presentation.ui.theme.white
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.ShapeDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RegisterDialog(
    showDialog: Boolean,
    onClose: (showLogin: Boolean, showRegister: Boolean) -> Unit
) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var showPassword by remember { mutableStateOf(false) }

    if (showDialog) {
        Dialog(
            onDismissRequest = { onClose(false, false) },
            properties = DialogProperties(usePlatformDefaultWidth = false)
        ) {
            Column(
                modifier = Modifier.fillMaxSize()
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .weight(1f)
                        .clickable { onClose(false, false) }
                )
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(
                            color = backgroundLight,
                            shape = RoundedCornerShape(
                                topStart = 40.dp,
                                topEnd = 40.dp
                            )
                        )
                ) {
                    Text(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(30.dp),
                        text = "Register",
                        color = white,
                        fontWeight = FontWeight.Bold,
                        fontSize = 30.sp,
                    )
                    OutlinedTextField(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(100.dp)
                            .padding(
                                start = 30.dp,
                                end = 30.dp,
                                bottom = 15.dp
                            ),
                        value = email,
                        onValueChange = { email = it },
                        label = { Text("Email") },
                        textStyle = TextStyle(
                            color = grayLight,
                            fontSize = 16.sp
                        ),
                        leadingIcon = {
                            Icon(
                                modifier = Modifier.size(24.dp),
                                painter = painterResource(id = R.drawable.email),
                                contentDescription = "Email icon",
                                tint = grayLight
                            )
                        },
                        keyboardOptions = KeyboardOptions(
                            autoCorrect = false,
                            keyboardType = KeyboardType.Email
                        ),
                        singleLine = true,
                        shape = ShapeDefaults.Large,
                        colors = TextFieldDefaults.outlinedTextFieldColors(
                            textColor = grayLight,
                            containerColor = backgroundDark,
                            focusedBorderColor = backgroundDark,
                            unfocusedBorderColor = backgroundDark,
                            focusedLabelColor = grayLight,
                            unfocusedLabelColor = grayLight
                        )
                    )
                    OutlinedTextField(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(115.dp)
                            .padding(
                                start = 30.dp,
                                end = 30.dp,
                                bottom = 30.dp
                            ),
                        value = password,
                        onValueChange = { password = it },
                        label = { Text("Password") },
                        textStyle = TextStyle(
                            color = grayLight,
                            fontSize = 16.sp
                        ),
                        leadingIcon = {
                            Icon(
                                modifier = Modifier.size(24.dp),
                                painter = painterResource(id = R.drawable.password),
                                contentDescription = "Password icon",
                                tint = grayLight
                            )
                        },
                        trailingIcon = {
                            Icon(
                                modifier = Modifier
                                    .size(24.dp)
                                    .clickable { showPassword = !showPassword },
                                painter = painterResource(id = if (showPassword) R.drawable.show else R.drawable.hide),
                                contentDescription = "Show password icon",
                                tint = grayLight
                            )
                        },
                        visualTransformation = if (showPassword) VisualTransformation.None else PasswordVisualTransformation(),
                        keyboardOptions = KeyboardOptions(
                            autoCorrect = false,
                            keyboardType = KeyboardType.Email
                        ),
                        singleLine = true,
                        shape = ShapeDefaults.Large,
                        colors = TextFieldDefaults.outlinedTextFieldColors(
                            textColor = grayLight,
                            containerColor = backgroundDark,
                            focusedBorderColor = backgroundDark,
                            unfocusedBorderColor = backgroundDark,
                            focusedLabelColor = grayLight,
                            unfocusedLabelColor = grayLight
                        )
                    )
                    Button(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(80.dp)
                            .padding(
                                start = 30.dp,
                                end = 30.dp,
                                bottom = 20.dp
                            ),
                        onClick = { },
                        shape = ShapeDefaults.Large,
                        colors = ButtonDefaults.buttonColors(
                            containerColor = blueLight,
                            contentColor = white
                        )
                    ) {
                        Text(
                            text = "Sign up",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 40.dp)
                    ) {
                        Spacer(modifier = Modifier.weight(1f))
                        Text(
                            text = "Already have an account? ",
                            color = white,
                            fontSize = 14.sp
                        )
                        Text(
                            modifier = Modifier.clickable { onClose(true, false) },
                            text = "Sign in",
                            color = blueLight,
                            fontSize = 14.sp
                        )
                        Spacer(modifier = Modifier.weight(1f))
                    }
                }
            }
        }
    }
}