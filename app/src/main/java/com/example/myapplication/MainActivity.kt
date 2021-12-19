package com.example.myapplication

import android.content.Context
import android.os.Build
import android.os.Bundle
import android.provider.Settings
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
import android.telephony.TelephonyManager




class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val id = Settings.Secure.getString(contentResolver, Settings.Secure.ANDROID_ID)


//        val uid = getSystemService(Context.TELEPHONY_SERVICE) as TelephonyManager
//        val uuid = uid.deviceId
        Toast.makeText(this, id, Toast.LENGTH_SHORT).show()
        var result : Data? = Data(
            MainScreenBox = Params(Color.White, Color.Black,16.sp),
            AppBar = Params(Color(56,54,77), Color.White,16.sp),
            BottomNavigation = Params(Color.White, Color(142,142,147),9.sp),
            Stories = Params(Color(56,54,77), Color(251,250,249),12.sp),
        )
        val hashMap =             hashMapOf(
            "player_id" to id,
            "platform" to "Android",
            "version" to Build.VERSION.RELEASE,
            "manufacturer" to Build.MANUFACTURER,
            "model" to Build.MODEL,
            "serial" to "",
        )
        RetrofitObj.retrofit.getParams(
hashMap
        ).enqueue(
            object : Callback<DataDto>{
                override fun onResponse(call: Call<DataDto>, response: Response<DataDto>) {
                    if(response.isSuccessful)
                    {
                        if(response.body() != null)
                        {
                            result = response.body()!!.toData()
                        }
                    }
                }

                override fun onFailure(call: Call<DataDto>, t: Throwable) {

                }

            }
        )
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface() {
                    result?.let { Screen(it) }
            }
        }
    }
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
