package org.easybangumi.libplayer.api

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

/**
 * Created by heyanlin on 2025/5/27.
 */
abstract class AbsPlayerBridge : PlayerBridge {

    protected val innerPlayStateFlow = MutableStateFlow(C.State.IDLE)
    override val playStateFlow: StateFlow<C.State> = innerPlayStateFlow

    protected val innerPlayWhenReadyFlow = MutableStateFlow(false)
    override val playWhenReadyFlow: StateFlow<Boolean> = innerPlayWhenReadyFlow

    protected val innerVideoSizeFlow = MutableStateFlow(C.VIDEO_SIZE_UNSET)
    override val videoSizeFlow: StateFlow<VideoSize> = innerVideoSizeFlow

    protected val innerPositionMsFlow = MutableStateFlow(C.TIME_UNSET)
    override val positionMsFlow: StateFlow<Long> = innerPositionMsFlow

    protected val innerBufferedPositionMsFlow = MutableStateFlow(C.TIME_UNSET)
    override val bufferedPositionMsFlow: StateFlow<Long> = innerBufferedPositionMsFlow

    protected val innerDurationMsFlow = MutableStateFlow(C.TIME_UNSET)
    override val durationMsFlow: StateFlow<Long> = innerDurationMsFlow

    protected val innerScaleTypeFlow = MutableStateFlow(C.RendererScaleType.SCALE_DEFAULT)
    override val scaleTypeFlow: StateFlow<C.RendererScaleType> = innerScaleTypeFlow




}