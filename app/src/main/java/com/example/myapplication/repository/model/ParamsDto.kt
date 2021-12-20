package com.example.myapplication.repository.model

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp

data class ParamsDto(
    val backgroundColor: String?,
    val textColor:String?,
    val fontSize:Int?,
)

fun ParamsDto.toParams():Params = Params(
    backgroundColor = getRbg(backgroundColor),
    textColor = getRbg(textColor),
    fontSize = fontSize?.sp
)

fun getRbg(color: String?): Color? {
    val rgb = color?.split(",")
    if(color!=null){
        return Color(
            red = rgb!![0].toInt(),
            green = rgb[1].toInt(),
            blue = rgb[2].toInt()
        )
    }
    return null
}