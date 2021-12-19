package com.example.myapplication.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.BottomEnd
import androidx.compose.ui.Alignment.Companion.TopStart
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.R

@Composable
fun TestHeedStandartBanner(

){
    val list:List<Color> = listOf(
        Color(25, 210, 99),
        Color(198, 237, 115)
    )
    Card(
        shape = RoundedCornerShape(12.dp),
        modifier = Modifier.fillMaxWidth(),
        backgroundColor = Color.White,
        elevation = 4.dp
    ) {
    Box(

        modifier = Modifier.background(brush = Brush.horizontalGradient(list))
        )
     {
            Text(
                text = "Каталог",
                fontWeight = FontWeight(500),
                color = Color.White,
                fontSize = 16.sp,
                modifier = Modifier
                    .align(TopStart)
                    .padding(12.dp)
            )
            Image(
                contentScale = ContentScale.FillWidth,
                painter = painterResource(id = R.drawable.header_image),
                contentDescription = null,
                modifier = Modifier.fillMaxWidth(0.5f).align(BottomEnd)
            )
        }
    }
}

@Preview(showBackground = true, backgroundColor = 0x000000)
@Composable
fun qstandprev(){

TestHeedStandartBanner()
}

