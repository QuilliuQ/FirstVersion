package com.example.myapplication.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.myapplication.repository.model.Params

@Composable
fun MainScreenContent(modifier: Params) {
    Box() {
        Column(
            Modifier
                .padding(top = 70.dp, bottom = 35.dp)
                .background(Color.White, RoundedCornerShape(topStart = 30.dp, topEnd = 30.dp))
                .padding(bottom =  16.dp, top= 75.dp, start = 16.dp, end = 16.dp)

        ) {

            Spacer(modifier = Modifier.height(10.dp))
            for (i in 1..2) {
                TestStandartBanner()
                Spacer(modifier = Modifier.height(10.dp))
                TestStandartBanner2()
                Spacer(modifier = Modifier.height(10.dp))
                TestStandartBanner3()
                Spacer(modifier = Modifier.height(10.dp))

            }


        }
        TestHeedStandartBanner()
    }
}

