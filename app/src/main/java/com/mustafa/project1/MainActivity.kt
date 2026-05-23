package com.mustafa.project1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import android.graphics.Color
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.mustafa.project1.ui.navigation.AppNavigation

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge(
            statusBarStyle = SystemBarStyle.dark(
                Color.TRANSPARENT
            )
        )
        setContent {
            AppNavigation()
        }
    }
}


@Preview
@Composable
fun AppPreview() {
    AppNavigation()
}