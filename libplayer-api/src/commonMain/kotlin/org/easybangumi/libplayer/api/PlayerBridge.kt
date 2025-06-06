package org.easybangumi.libplayer.api

import kotlinx.coroutines.flow.StateFlow
import org.easybangumi.libplayer.api.action.Action

/**
 * 播放器桥接接口，用于在 Common 层中与播放器进行交互
 * 各平台需要自己实现
 * Created by heyanlin on 2025/5/27.
 */
interface PlayerBridge: AutoCloseable {

    interface Factory {
        fun create(): PlayerBridge
    }

    val impl: Any

    val playStateFlow: StateFlow<C.State>

    fun prepare(mediaItem: MediaItem)

    val playWhenReadyFlow: StateFlow<Boolean>
    fun setPlayWhenReady(playWhenReady: Boolean)

    val videoSizeFlow: StateFlow<VideoSize>

    // Playback control
    fun seekTo(positionMs: Long)

    val positionMsFlow: StateFlow<Long>
    val bufferedPositionMsFlow: StateFlow<Long>
    val durationMsFlow: StateFlow<Long>

    // Renderer containers
    fun setScaleType(scaleType: C.RendererScaleType)
    val scaleTypeFlow: StateFlow<C.RendererScaleType>

    fun <A: Action> action(): A?

}

inline fun <A: Action, R> PlayerBridge.action(check: Boolean = true, block: A.()->Unit,) {
    val action = action<A>()
    if (action == null) {
        if (check) {
            throw IllegalStateException("Action is null")
        }
        return
    }
    return action.block()
}