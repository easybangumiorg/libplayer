package org.easybangumi.libplayer.api

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import org.easybangumi.libplayer.api.action.Action
import kotlin.concurrent.atomics.AtomicBoolean
import kotlin.concurrent.atomics.ExperimentalAtomicApi
import kotlin.reflect.KClass

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

    protected val innerScaleTypeFlow = MutableStateFlow(C.RendererScaleType.SCALE_ADAPT)
    override val scaleTypeFlow: StateFlow<C.RendererScaleType> = innerScaleTypeFlow


    @OptIn(ExperimentalAtomicApi::class)
    private val actionInit = AtomicBoolean(false)
    private val actionMap = mutableMapOf<KClass<out Action>, Action>()

    @OptIn(ExperimentalAtomicApi::class)
    override fun <A : Action> action(): A? {
        if (!actionInit.compareAndSet(expectedValue = false, newValue = true)) {
            actionMap.putAll(prepareAction())
        }
        @Suppress("UNCHECKED_CAST")
        return actionMap[Action::class] as? A
    }

    abstract fun prepareAction(): Map<KClass<out Action>, Action>


}