package com.mustafa.project1.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mustafa.project1.R
import com.mustafa.project1.ui.theme.DarkBlue
import com.mustafa.project1.ui.theme.LightBlue
import com.mustafa.project1.ui.theme.OvalBackground

@Composable
fun ProfileScreen(onBackClick:() -> Unit){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .verticalScroll(rememberScrollState())
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp)
                .background(DarkBlue)
        ){
            Image(
                painter = painterResource(R.drawable.arc_3),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.BottomCenter),
                contentScale = ContentScale.FillWidth
            )
            Image(
                painter = painterResource(R.drawable.user_2),
                contentDescription = null,
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .height(120.dp)
            )
            Text(
                "Profile",
                color = Color.White,
                fontSize = 30.sp,
                modifier = Modifier.align(Alignment.TopCenter)
                    .padding(top = 60.dp)
            )
            Box(modifier = Modifier
                .padding(top = 48.dp, start = 32.dp)
                .size(50.dp)
                .clip(CircleShape)
                .background(OvalBackground)
                .clickable{onBackClick()}
                .padding(8.dp)
                .align(Alignment.TopStart),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(R.drawable.back_100),
                    contentDescription = null
                )
            }
        }
        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "Alex Flores",
            fontSize = 26.sp,
            fontWeight = FontWeight.Bold,
            color = DarkBlue,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth()
        )
        Text(
            text = "alexflores@gmail.com",
            fontSize = 16.sp,
            color = Color.Gray,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))
        ProfileMenuItem(R.drawable.btn_1, title = "Notifications")
        ProfileMenuItem(R.drawable.btn_2, title = "Calender")
        ProfileMenuItem(R.drawable.btn_3, title = "Gallery")
        ProfileMenuItem(R.drawable.btn_4, title = "My Playlist")
        ProfileMenuItem(R.drawable.btn_5, title = "Share")
        ProfileMenuItem(R.drawable.btn_6, title = "Logout", false)
        Spacer(modifier = Modifier.height(80.dp))
    }
}

@Composable
fun ProfileMenuItem(
    iconRes: Int,
    title: String,
    showArrow: Boolean=true
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 32.dp, vertical = 16.dp)
            .clickable{},
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(painter = painterResource(iconRes),
            contentDescription = null,
            modifier = Modifier.height(50.dp)
        )
        Spacer(modifier = Modifier.width(16.dp))
        Text(
            title,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = DarkBlue,
            modifier = Modifier.weight(1f)
        )
        if (showArrow) Image(painter = painterResource(R.drawable.next_50),
            contentDescription = null,
            modifier = Modifier.height(50.dp)
        )
    }
}

@Composable
fun PlaceHolderScreen(name: String) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(text = name, fontSize = 24.sp, fontWeight = FontWeight.Bold, color = DarkBlue)
    }
}