package com.example.myapplication.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.graphics.toColorInt
import com.example.myapplication.R
import com.example.myapplication.components.BadgedBox
import com.example.myapplication.repository.model.Params

@Composable
fun AppBarVV(params: Params){
    Card (backgroundColor = params.backgroundColor?: Color(56,54,77)){
        Row(
            Modifier.padding(start = 16.dp, top = 12.dp, end = 20.dp, bottom = 12.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Column {
                Text(
                    text = "Карта № 3434934",
                    color = params.textColor?: Color.White,
                    fontSize = params.fontSize?: 16.sp,
                    fontWeight = FontWeight(700)
                )
                Text(
                    text = "Андрей Кривенко",
                    color = params.textColor?: Color.White,
                    fontSize = params.fontSize?: 16.sp,
                    fontWeight = FontWeight(500)
                )
            }
            Spacer(modifier = Modifier.weight(1f))
            Image(
                modifier = Modifier.padding(end = 15.dp),
                imageVector = ImageVector.vectorResource(id = R.drawable.ic_settings),
                contentDescription = null
            )
            BadgedBox(
                borderColor = params.backgroundColor?: Color(56,54,77),
                badgeContent = {
                    Text(
                        text = "1",
                        color = params.backgroundColor?: Color(56,54,77),
                        fontSize = 10.sp,
                        fontWeight = FontWeight(700)
                    )
                }
            ) {
                Image(
                    imageVector = ImageVector.vectorResource(id = R.drawable.ic_notifications),
                    contentDescription = null
                )
            }


        }
    }
}


