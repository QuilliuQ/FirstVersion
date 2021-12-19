package com.example.myapplication.repository.model

data class DataDto(
    val MainScreenBox : ParamsDto,
    val AppBar:ParamsDto,
    val BottomNavigation:ParamsDto,
    val Stories:ParamsDto,
)

fun DataDto.toData():Data =
    Data(
        MainScreenBox.toParams(),
        AppBar.toParams(),
        BottomNavigation.toParams(),
        Stories.toParams()
    )