package com.example.myapplication.screen

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.example.myapplication.repository.model.Params

@Composable
fun Stories(stories: Params) {
    LazyRow(contentPadding = PaddingValues(vertical = 15.dp, horizontal = 8.dp)){
        items (10){
            Story(stories)
        }
    }
}

