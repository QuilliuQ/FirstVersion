package com.example.myapplication.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.graphics.toColorInt
import com.example.myapplication.R
import com.example.myapplication.repository.model.Params

@Composable
fun BottomNav(modifier: Modifier = Modifier, params: Params){
    BottomNavigation(elevation = 4.dp,modifier = modifier) {
        BottomNavigationItem(
            modifier = Modifier.background(params.backgroundColor?: Color.White),
            selected = false,
            onClick = {},
            label = {
                Text(
                    text = "Моя карта",
                    fontSize = params.fontSize ?: 9.sp,
                    color = params.textColor ?: Color(142, 142, 147)
                )
            },
            icon = {
                Image(
                    imageVector = ImageVector.vectorResource(id = R.drawable.ic_card),
                    contentDescription = null
                )
            }
        )
        BottomNavigationItem(modifier = Modifier.background(params.backgroundColor?: Color.White),selected = false, onClick = {}, label = { Text(
            text = "Каталог",
            fontSize = params.fontSize ?: 9.sp,
            color = params.textColor ?: Color(142, 142, 147)
        )},icon = {
            Image(imageVector = ImageVector.vectorResource(id = R.drawable.ic_food), contentDescription = null)} )
        BottomNavigationItem(modifier = Modifier.background(params.backgroundColor?: Color.White),selected = false, onClick = {}, label = { Text(
            text = "Магазины",
            fontSize = params.fontSize ?: 9.sp,
            color = params.textColor ?: Color(142, 142, 147)
        )},icon = {
            Image(imageVector = ImageVector.vectorResource(id = R.drawable.ic_magazine), contentDescription = null)} )
        BottomNavigationItem(modifier = Modifier.background(params.backgroundColor?: Color.White),selected = true, onClick = {}, label = { Text(
            text = "Профиль",
            fontSize = params.fontSize ?: 9.sp,
            color = params.textColor ?: Color(142, 142, 147)
        )},icon = {
            Image(imageVector = ImageVector.vectorResource(id = R.drawable.ic_profile), contentDescription = null)} )
        BottomNavigationItem(modifier = Modifier.background(params.backgroundColor?: Color.White),selected = true, onClick = {}, label = { Text(
            text = "Поддержка",
            fontSize = params.fontSize ?: 9.sp,
            color = params.textColor ?: Color(142, 142, 147)
        )},icon = {
            Image(imageVector = ImageVector.vectorResource(id = R.drawable.ic_support), contentDescription = null)} )
    }
}
