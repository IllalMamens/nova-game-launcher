package com.nova.gamelauncher

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.nova.gamelauncher.ui.dashboard.DashboardScreen
import com.nova.gamelauncher.ui.theme.NovaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NovaTheme {
                DashboardScreen()
            }
        }
    }
}
