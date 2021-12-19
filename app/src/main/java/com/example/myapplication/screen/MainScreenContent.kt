package com.example.myapplication.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.myapplication.repository.model.Params

@Composable
fun MainScreenContent(modifier: Params) {
    Column(
        Modifier
            .padding(bottom = 35.dp)
            .background(Color.White, RoundedCornerShape(topStart = 30.dp, topEnd = 30.dp))
            .padding(16.dp)
           ) {
            TestHeedStandartBanner()
            Spacer(modifier = Modifier.height(10.dp))
        for (i in 1..10){
            TestStandartBanner()
            Spacer(modifier = Modifier.height(10.dp))

        }


    }
}

