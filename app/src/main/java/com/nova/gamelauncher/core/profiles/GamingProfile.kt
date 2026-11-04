package com.nova.gamelauncher.core.profiles

enum class ProfileMode {
    ECO, BALANCED, PERFORMANCE
}

data class ProfileConfig(
    val mode: ProfileMode,
    val description: String,
    val ramOptimization: Boolean,
    val backgroundLimit: Int
) {
    companion object {
        fun getPreset(mode: ProfileMode): ProfileConfig = when (mode) {
            ProfileMode.ECO -> ProfileConfig(mode, "Penghematan daya maksimal", true, 2)
            ProfileMode.BALANCED -> ProfileConfig(mode, "Keseimbangan daya & performa", true, 4)
            ProfileMode.PERFORMANCE -> ProfileConfig(mode, "Responsif tinggi untuk gaming", false, 8)
        }
    }
}
