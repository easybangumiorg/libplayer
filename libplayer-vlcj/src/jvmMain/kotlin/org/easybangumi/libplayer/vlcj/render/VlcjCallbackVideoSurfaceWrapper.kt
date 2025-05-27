package org.easybangumi.libplayer.vlcj.render

import uk.co.caprica.vlcj.player.base.MediaPlayer
import uk.co.caprica.vlcj.player.embedded.videosurface.CallbackVideoSurface
import uk.co.caprica.vlcj.player.embedded.videosurface.VideoSurfaceAdapter
import uk.co.caprica.vlcj.player.embedded.videosurface.callback.BufferFormat
import uk.co.caprica.vlcj.player.embedded.videosurface.callback.BufferFormatCallback
import uk.co.caprica.vlcj.player.embedded.videosurface.callback.RenderCallback
import java.nio.ByteBuffer

/**
 * Created by heyanlin on 2025/5/27.
 */
class VlcjCallbackVideoSurfaceWrapper {

    private val renderCallback = object: RenderCallback {
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

    private val bufferFormatCallback = object: BufferFormatCallback {
        override fun getBufferFormat(
            sourceWidth: Int,
            sourceHeight: Int
        ): BufferFormat? {
            TODO("Not yet implemented")
        }

        override fun newFormatSize(
            bufferWidth: Int,
            bufferHeight: Int,
            displayWidth: Int,
            displayHeight: Int
        ) {
            TODO("Not yet implemented")
        }

        override fun allocatedBuffers(buffers: Array<out ByteBuffer?>?) {
            TODO("Not yet implemented")
        }
    }


    private val videoSurfaceAdapter: VideoSurfaceAdapter = object: VideoSurfaceAdapter {
        override fun attach(mediaPlayer: MediaPlayer?, componentId: Long) {
            TODO("Not yet implemented")
        }
    }

    val callbackVideoSurface = CallbackVideoSurface(
        bufferFormatCallback,
        renderCallback,
        true, // lockBuffers
        videoSurfaceAdapter
    )


}