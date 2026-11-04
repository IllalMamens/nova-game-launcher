package com.nova.gamelauncher.service

import android.app.Service
import android.content.Intent
import android.graphics.PixelFormat
import android.os.IBinder
import android.view.Gravity
import android.view.WindowManager
import android.widget.FrameLayout

class DualSidebarService : Service() {
    private lateinit var windowManager: WindowManager
    private var leftHandleView: FrameLayout? = null
    private var rightHandleView: FrameLayout? = null

    override fun onCreate() {
        super.onCreate()
        windowManager = getSystemService(WINDOW_SERVICE) as WindowManager
        setupSidebars()
    }

    private fun setupSidebars() {
        val paramsLeft = WindowManager.LayoutParams(
            24,
            400,
            WindowManager.LayoutParams.TYPE_APPLICATION_OVERLAY,
            WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE,
            PixelFormat.TRANSLUCENT
        ).apply {
            gravity = Gravity.START or Gravity.CENTER_VERTICAL
        }

        val paramsRight = WindowManager.LayoutParams(
            24,
            400,
            WindowManager.LayoutParams.TYPE_APPLICATION_OVERLAY,
            WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE,
            PixelFormat.TRANSLUCENT
        ).apply {
            gravity = Gravity.END or Gravity.CENTER_VERTICAL
        }

        leftHandleView = FrameLayout(this)
        rightHandleView = FrameLayout(this)
    }

    override fun onBind(intent: Intent?): IBinder? = null
}
