package org.easybangumi.libplayer.vlcj

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import org.easybangumi.libplayer.api.C
import org.easybangumi.libplayer.api.MediaItem
import org.easybangumi.libplayer.api.PlayerBridge
import org.easybangumi.libplayer.api.VideoSize
import org.easybangumi.libplayer.api.action.Action
import org.easybangumi.libplayer.api.renderer.Renderer
import uk.co.caprica.vlcj.factory.MediaPlayerFactory
import uk.co.caprica.vlcj.media.Media
import uk.co.caprica.vlcj.media.MediaEventListener
import uk.co.caprica.vlcj.media.MediaParsedStatus
import uk.co.caprica.vlcj.media.MediaRef
import uk.co.caprica.vlcj.media.Meta
import uk.co.caprica.vlcj.media.Picture
import uk.co.caprica.vlcj.media.TrackType
import uk.co.caprica.vlcj.player.base.MediaPlayer
import uk.co.caprica.vlcj.player.base.MediaPlayerEventListener
import uk.co.caprica.vlcj.player.base.State
import uk.co.caprica.vlcj.player.component.CallbackMediaListPlayerComponent
import uk.co.caprica.vlcj.player.embedded.videosurface.callback.BufferFormat
import uk.co.caprica.vlcj.player.embedded.videosurface.callback.BufferFormatCallback
import uk.co.caprica.vlcj.player.embedded.videosurface.callback.RenderCallback
import java.nio.ByteBuffer

/**
 * Created by heyanlin on 2025/5/27.
 */
class VlcjCallbackPlayerBridge(
    val mediaPlayerFactory: MediaPlayerFactory,
): PlayerBridge {

    private val renderCallback: RenderCallback by lazy {
        object: RenderCallback {
            override fun lock(mediaPlayer: MediaPlayer?) {

            }

            override fun display(
                mediaPlayer: MediaPlayer?,
                nativeBuffers: Array<out ByteBuffer?>?,
                bufferFormat: BufferFormat?,
                displayWidth: Int,
                displayHeight: Int
            ) {

            }

            override fun unlock(mediaPlayer: MediaPlayer?) {

            }
        }
    }

    private val bufferFormatCallback: BufferFormatCallback by lazy {
        object: BufferFormatCallback {
            override fun getBufferFormat(
                sourceWidth: Int,
                sourceHeight: Int
            ): BufferFormat? {

            }

            override fun newFormatSize(
                bufferWidth: Int,
                bufferHeight: Int,
                displayWidth: Int,
                displayHeight: Int
            ) {

            }

            override fun allocatedBuffers(buffers: Array<out ByteBuffer?>?) {

            }
        }
    }

    private val mediaPlayerEventListener: MediaPlayerEventListener by lazy {
        object : MediaPlayerEventListener {
            override fun mediaChanged(
                mediaPlayer: MediaPlayer?,
                media: MediaRef?
            ) {
                TODO("Not yet implemented")
            }

            override fun opening(mediaPlayer: MediaPlayer?) {
                TODO("Not yet implemented")
            }

            override fun buffering(mediaPlayer: MediaPlayer?, newCache: Float) {
                TODO("Not yet implemented")
            }

            override fun playing(mediaPlayer: MediaPlayer?) {
                TODO("Not yet implemented")
            }

            override fun paused(mediaPlayer: MediaPlayer?) {
                TODO("Not yet implemented")
            }

            override fun stopped(mediaPlayer: MediaPlayer?) {
                TODO("Not yet implemented")
            }

            override fun forward(mediaPlayer: MediaPlayer?) {
                TODO("Not yet implemented")
            }

            override fun backward(mediaPlayer: MediaPlayer?) {
                TODO("Not yet implemented")
            }

            override fun finished(mediaPlayer: MediaPlayer?) {
                TODO("Not yet implemented")
            }

            override fun timeChanged(mediaPlayer: MediaPlayer?, newTime: Long) {
                TODO("Not yet implemented")
            }

            override fun positionChanged(
                mediaPlayer: MediaPlayer?,
                newPosition: Float
            ) {
                TODO("Not yet implemented")
            }

            override fun seekableChanged(
                mediaPlayer: MediaPlayer?,
                newSeekable: Int
            ) {
                TODO("Not yet implemented")
            }

            override fun pausableChanged(
                mediaPlayer: MediaPlayer?,
                newPausable: Int
            ) {
                TODO("Not yet implemented")
            }

            override fun titleChanged(mediaPlayer: MediaPlayer?, newTitle: Int) {
                TODO("Not yet implemented")
            }

            override fun snapshotTaken(
                mediaPlayer: MediaPlayer?,
                filename: String?
            ) {
                TODO("Not yet implemented")
            }

            override fun lengthChanged(
                mediaPlayer: MediaPlayer?,
                newLength: Long
            ) {
                TODO("Not yet implemented")
            }

            override fun videoOutput(mediaPlayer: MediaPlayer?, newCount: Int) {
                TODO("Not yet implemented")
            }

            override fun scrambledChanged(
                mediaPlayer: MediaPlayer?,
                newScrambled: Int
            ) {
                TODO("Not yet implemented")
            }

            override fun elementaryStreamAdded(
                mediaPlayer: MediaPlayer?,
                type: TrackType?,
                id: Int
            ) {
                TODO("Not yet implemented")
            }

            override fun elementaryStreamDeleted(
                mediaPlayer: MediaPlayer?,
                type: TrackType?,
                id: Int
            ) {
                TODO("Not yet implemented")
            }

            override fun elementaryStreamSelected(
                mediaPlayer: MediaPlayer?,
                type: TrackType?,
                id: Int
            ) {
                TODO("Not yet implemented")
            }

            override fun corked(mediaPlayer: MediaPlayer?, corked: Boolean) {
                TODO("Not yet implemented")
            }

            override fun muted(mediaPlayer: MediaPlayer?, muted: Boolean) {
                TODO("Not yet implemented")
            }

            override fun volumeChanged(mediaPlayer: MediaPlayer?, volume: Float) {
                TODO("Not yet implemented")
            }

            override fun audioDeviceChanged(
                mediaPlayer: MediaPlayer?,
                audioDevice: String?
            ) {
                TODO("Not yet implemented")
            }

            override fun chapterChanged(
                mediaPlayer: MediaPlayer?,
                newChapter: Int
            ) {
                TODO("Not yet implemented")
            }

            override fun error(mediaPlayer: MediaPlayer?) {
                TODO("Not yet implemented")
            }

            override fun mediaPlayerReady(mediaPlayer: MediaPlayer?) {
                TODO("Not yet implemented")
            }
        }
    }

    private val mediaEventListener: MediaEventListener by lazy {
        object: MediaEventListener {
            override fun mediaMetaChanged(
                media: Media?,
                metaType: Meta?
            ) {
                TODO("Not yet implemented")
            }

            override fun mediaSubItemAdded(
                media: Media?,
                newChild: MediaRef?
            ) {
                TODO("Not yet implemented")
            }

            override fun mediaDurationChanged(media: Media?, newDuration: Long) {
                TODO("Not yet implemented")
            }

            override fun mediaParsedChanged(
                media: Media?,
                newStatus: MediaParsedStatus?
            ) {
                TODO("Not yet implemented")
            }

            override fun mediaFreed(
                media: Media?,
                mediaFreed: MediaRef?
            ) {
                TODO("Not yet implemented")
            }

            override fun mediaStateChanged(
                media: Media?,
                newState: State?
            ) {
                TODO("Not yet implemented")
            }

            override fun mediaSubItemTreeAdded(
                media: Media?,
                item: MediaRef?
            ) {
                TODO("Not yet implemented")
            }

            override fun mediaThumbnailGenerated(
                media: Media?,
                picture: Picture?
            ) {
                TODO("Not yet implemented")
            }
        }
    }

    private val component: CallbackMediaListPlayerComponent by lazy {
        CallbackMediaListPlayerComponent(
            mediaPlayerFactory,
            null, null, false, null,
            renderCallback,
            bufferFormatCallback, null
        ).apply {
            mediaPlayer().events().addMediaPlayerEventListener(mediaPlayerEventListener)
            mediaPlayer().events().addMediaEventListener(mediaEventListener)
        }
    }

    private val mediaPlayer: MediaPlayer
        get() = component.mediaPlayer()


    override val impl: Any
        get() = component

    override val playStateFlow: StateFlow<C.State> = MutableStateFlow(C.State.IDLE)

    override fun prepare(mediaItem: MediaItem) {

    }

    override val playWhenReadyFlow: StateFlow<Boolean> = MutableStateFlow(false)

    override fun setPlayWhenReady(playWhenReady: Boolean) {

    }

    override val videoSizeFlow: StateFlow<VideoSize> = MutableStateFlow(C.VIDEO_SIZE_UNSET))

    override fun seekTo(positionMs: Long) {

    }

    override val positionMsFlow: StateFlow<Long> = MutableStateFlow(C.TIME_UNSET)
    override val bufferedPositionMsFlow: StateFlow<Long> = MutableStateFlow(C.TIME_UNSET)
    override val durationMsFlow: StateFlow<Long> = MutableStateFlow(C.TIME_UNSET)

    override fun setScaleType(scaleType: C.RendererScaleType) {

    }

    override val scaleTypeFlow: StateFlow<C.RendererScaleType> = MutableStateFlow(C.RendererScaleType.SCALE_DEFAULT)

    override fun addRenderer(vararg renderer: Renderer) {

    }

    override fun removeRenderer(vararg renderer: Renderer) {

    }

    override fun renderers(): List<Renderer> {

    }

    override fun <A : Action> action(): A? {

    }

    override fun close() {

    }
}