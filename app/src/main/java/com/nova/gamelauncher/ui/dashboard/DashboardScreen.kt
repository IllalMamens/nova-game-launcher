package com.nova.gamelauncher.ui.dashboard

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nova.gamelauncher.ui.theme.*

@Composable
fun DashboardScreen(
    ramUsedMb: Int = 1850,
    ramTotalMb: Int = 3000,
    batteryTemp: Float = 36.5f,
    activeProfile: String = "BALANCED"
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(CyberBg)
            .padding(16.dp)
    ) {
        Text(
            text = "NOVA GAME LAUNCHER",
            color = CyberNeonCyan,
            fontSize = 22.sp,
            style = MaterialTheme.typography.titleLarge
        )
        Text(
            text = "SYSTEM DASHBOARD // MI A2 LITE",
            color = CyberTextSecondary,
            fontSize = 12.sp,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        Card(
            colors = CardDefaults.cardColors(containerColor = CyberCard),
            shape = RoundedCornerShape(8.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 6.dp)
        ) {
            Column(modifier = Modifier.padding(16.dp)) {
                Text(text = "RAM USAGE", color = CyberTextSecondary, fontSize = 12.sp)
                Text(text = "$ramUsedMb MB / $ramTotalMb MB", color = CyberNeonCyan, fontSize = 18.sp)
                LinearProgressIndicator(
                    progress = ramUsedMb.toFloat() / ramTotalMb.toFloat(),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 8.dp),
                    color = CyberNeonCyan,
                    trackColor = CyberBg
                )
            }
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 6.dp),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            Card(
                colors = CardDefaults.cardColors(containerColor = CyberCard),
                modifier = Modifier.weight(1f)
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text(text = "BATTERY TEMP", color = CyberTextSecondary, fontSize = 12.sp)
                    Text(text = "$batteryTemp °C", color = CyberNeonYellow, fontSize = 18.sp)
                }
            }
            Card(
                colors = CardDefaults.cardColors(containerColor = CyberCard),
                modifier = Modifier.weight(1f)
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text(text = "PROFILE", color = CyberTextSecondary, fontSize = 12.sp)
                    Text(text = activeProfile, color = CyberNeonPink, fontSize = 18.sp)
                }
            }
        }
    }
}
