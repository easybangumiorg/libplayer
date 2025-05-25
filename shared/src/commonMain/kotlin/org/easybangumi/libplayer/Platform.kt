package org.easybangumi.libplayer

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform