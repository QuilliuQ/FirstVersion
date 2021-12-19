package com.example.myapplication.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.graphics.toColorInt
import com.example.myapplication.R


@Composable
fun TestStandartBanner(

){
    Card(
        shape = RoundedCornerShape(12.dp),
        backgroundColor = Color.White,
        elevation = 4.dp
        )
     {
        Column(

            modifier = Modifier.padding(10.dp)
        ) {
            Row() {
                Image(
                    painter = painterResource(id = R.drawable.icon_heart),
                    contentDescription = null,
                    Modifier.size(28.dp)
                )

                Text(
                    lineHeight = 19.sp,
                    text = "Любимый продукт",
                    fontWeight = FontWeight(600),
                    color = Color("#1A1A1A".toColorInt()),
                    fontSize = 16.sp,
                    modifier = Modifier.padding(start = 8.dp).align(CenterVertically)
                )
                Spacer(modifier = Modifier.weight(1f))
                ClickableText(
                    text = AnnotatedString("Детали"),
                    modifier = Modifier.padding(end = 10.dp).align(CenterVertically),
                    onClick = {},
                    style = TextStyle(color = Color("#36BA5F".toColorInt()))
                )


            }
            Text(
                lineHeight = 19.sp,
                text = "Вы ничего не покупали 2 дня",
                fontWeight = FontWeight(600),
                color = Color("#1A1A1A".toColorInt()),
                fontSize = 16.sp,
                modifier = Modifier.padding(top = 10.dp)
            )
            Text(
                text = "Вы ничего не купили а могли бы",
                fontSize = 12.sp,
                fontWeight = FontWeight(600),
                color = Color("#949494".toColorInt())
            )
        }
    }
}

