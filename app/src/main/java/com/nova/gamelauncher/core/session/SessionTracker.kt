package com.nova.gamelauncher.core.session

data class GameSession(
    val packageName: String,
    val appName: String,
    val startTime: Long,
    var endTime: Long = 0,
    var durationSeconds: Long = 0
)

class SessionManager {
    private val activeSessions = mutableListOf<GameSession>()

    fun startSession(packageName: String, appName: String): GameSession {
        val session = GameSession(packageName, appName, System.currentTimeMillis())
        activeSessions.add(session)
        return session
    }

    fun stopSession(session: GameSession) {
        session.endTime = System.currentTimeMillis()
        session.durationSeconds = (session.endTime - session.startTime) / 1000
    }

    fun getHistory(): List<GameSession> = activeSessions
}
