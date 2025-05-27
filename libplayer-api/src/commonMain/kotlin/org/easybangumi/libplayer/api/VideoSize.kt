package org.easybangumi.libplayer.api

/**
 * Created by heyanlin on 2025/5/27.
 */
data class VideoSize (
    val width: Int = C.PIXEL_UNSET,
    val height: Int = C.PIXEL_UNSET,
    // 宽 to 高
    val ratio: Pair<Int, Int> = C.RATIO_UNSET
)