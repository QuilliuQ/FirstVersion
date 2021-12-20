package com.example.myapplication

import android.os.Build
import android.os.Bundle
import android.provider.Settings
import android.provider.Settings.Secure.getString
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.core.graphics.toColorInt
import com.example.myapplication.repository.RetrofitObj
import com.example.myapplication.repository.model.*
import com.example.myapplication.ui.theme.MyApplicationTheme
import com.example.myapplication.screen.MainScreenContent
import com.example.myapplication.screen.AppBarVV
import com.example.myapplication.screen.BottomNav
import com.example.myapplication.screen.Stories
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val id = getString(contentResolver, Settings.Secure.ANDROID_ID)
        var result = Data(
            MainScreenBox = Params(Color.White, Color.Black,16.sp),
            AppBar = Params(Color(56,54,77), Color.White,16.sp),
            BottomNavigation = Params(Color.White, Color(142,142,147),9.sp),
            Stories = Params(Color(56,54,77), Color(251,250,249),12.sp),
        )
        val resource = Resource(
            true,
            true,
            true,
            true
        )
        val hashMap =             hashMapOf(
            "player_id" to id,
            "platform" to "Android",
            "version" to Build.VERSION.RELEASE,
            "manufacturer" to Build.MANUFACTURER,
            "model" to Build.MODEL,
            "serial" to "",
            "resource" to resource
        )
        RetrofitObj.retrofit.getParams(
hashMap
        ).enqueue(
            object : Callback<ResponseData>{
                override fun onResponse(call: Call<ResponseData>, response: Response<ResponseData>) {
                    if(response.isSuccessful)
                    {
                        if(response.body() != null)
                        {
                            result = response.body()!!.item.content.toData()
                            setContent {
                                MyApplicationTheme {
                                    // A surface container using the 'background' color from the theme
                                    Surface() {
                                        Screen(result)
                                    }
                                }
                            }
                        }
                        else{
                            setContent {
                                MyApplicationTheme {
                                    // A surface container using the 'background' color from the theme
                                    Surface() {
                                        Screen(result)
                                    }
                                }
                            }
                        }
                    }
                }

                override fun onFailure(call: Call<ResponseData>, t: Throwable) {

                }

            }
        )

}

    @Composable
    fun Screen(data:Data) {
        Box(Modifier.background(Color("#38364D".toColorInt()))){
            Column(modifier = Modifier.align(Alignment.TopCenter)) {
                AppBarVV(data.AppBar)

                    Column(Modifier.verticalScroll(rememberScrollState())) {
                        Stories(data.Stories)
                        MainScreenContent(data.MainScreenBox)
                    }
                }

            BottomNav(modifier = Modifier.align(Alignment.BottomCenter),data.BottomNavigation)

        }
    }

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyApplicationTheme {

    }
}}
