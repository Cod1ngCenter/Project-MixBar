package com.example.project_mixbar.ui.screens

import android.graphics.drawable.Icon
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.SegmentedButtonDefaults.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun LoginScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0XFF1b1e2a)),
    )


        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 132.dp, bottom = 58.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        )
        {
            Box(
                modifier = Modifier
                    .width(129.dp)
                    .height(129.dp)
                    .background(Color(0XFFE63027))
                    .padding(top = 132.dp)
            )
            {}
            Spacer(modifier = Modifier.height(30.dp))

            Text(
                text = "Nome do app",
                color = Color.White,
                fontSize = 30.sp,

            )
            Spacer(modifier = Modifier.height(48.dp))

            Box(
                modifier = Modifier
                    .width(336.dp)
                    .height(428.dp)
                    .background(Color(0xFF1E2438))
                    .border(
                        width = 1.dp,
                        color = Color(0xFF8D91A8),
                        shape = RoundedCornerShape(15.dp),
                    )
            )
            {
                Column(
                    modifier = Modifier
                        .padding(horizontal = 42.dp)
                        .padding(top = 29.dp),

                ) {
                    Text(
                        text = "E-mail",
                        color = Color(0xFFB7B4B4),
                    )
                    Spacer(modifier = Modifier.height(12.dp))
                    var email by remember { mutableStateOf("") }
                    var senha by remember { mutableStateOf("") }
                    OutlinedTextField(
                        value = email,
                        onValueChange = {email = it},
                        placeholder = {Text(
                            text = "voce@email.com",
                            color = Color(0xFF6D6D6D),
                            fontSize = 16.sp,
                        ) },

                        shape = RoundedCornerShape(10.dp),

                        modifier = Modifier
                            .fillMaxWidth(),

                        colors = OutlinedTextFieldDefaults.colors(
                            unfocusedBorderColor = Color(0XFF525252),
                            unfocusedContainerColor = Color(0xFF3A3A3A)
                        )
                    )
                    Spacer(modifier = Modifier.height(33.dp))
                    Text(
                        text = "Senha",
                        color = Color(0xFFB7B4B4),
                    )
                    Spacer(modifier = Modifier.height(12.dp))
                    OutlinedTextField(
                        value = senha,
                        onValueChange = {senha = it},
                        placeholder = {Text(
                            text = "****",
                            color = Color(0xFF6D6D6D),
                            fontSize = 16.sp,
                        ) },

                        shape = RoundedCornerShape(10.dp),

                        modifier = Modifier
                            .fillMaxWidth(),

                        colors = OutlinedTextFieldDefaults.colors(
                            unfocusedBorderColor = Color(0XFF525252),
                            unfocusedContainerColor = Color(0xFF3A3A3A)
                        )
                    )
                    Spacer(modifier = Modifier.height(30.dp))

                    Button(
                        onClick = {
                            print("text")
                        },
                        modifier = Modifier
                            .height(48.dp)
                            .fillMaxWidth(),

                        shape = RoundedCornerShape(10.dp),
                        border = BorderStroke(1.dp, Color(0xff525252)),

                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xff1E2438)
                        )
                        )
                    {
                        Text(
                            text = "Entrar",
                            color = Color(0xffb7b4b4)
                        )
                    }
                    Spacer(modifier = Modifier.height(19.dp))

                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color(0xffB7B4B4))
                            .height(3.dp)
                    )
                    Spacer(modifier = Modifier.height(19.dp))

                    Button(
                        onClick = {
                            print("text")
                        },
                        modifier = Modifier
                            .height(48.dp)
                            .fillMaxWidth(),

                        shape = RoundedCornerShape(10.dp),
                        border = BorderStroke(1.dp, Color(0xff525252)),

                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xff1E2438)
                        )
                    )
                    {
                        Icon(
                            imageVector = Icons.Default.AccountCircle,
                            contentDescription = "LOGIN",

                        )

                        Text(
                            text = "Entrar com Google",
                            color = Color(0xffb7b4b4)
                        )
                    }
                }

            }





        }

}

annotation class Icon


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LoginPreview() {
    LoginScreen()
}