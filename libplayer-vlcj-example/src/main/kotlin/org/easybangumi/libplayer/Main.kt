package org.easybangumi.libplayer

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import org.easybangumi.libplayer.api.MediaItem
import org.easybangumi.libplayer.vlcj.VlcjPlayerFrame
import org.easybangumi.libplayer.vlcj.VlcjPlayerBridge
import uk.co.caprica.vlcj.factory.MediaPlayerFactory

/**
 * Created by heyanlin on 2025/5/29.
 */
fun main() {
    val url = "http://vjs.zencdn.net/v/oceans.mp4"

    val bridge = VlcjPlayerBridge(MediaPlayerFactory(), null)
    bridge.prepare(MediaItem(uri = url))
    bridge.setPlayWhenReady(true)
    application {
        Window(
            onCloseRequest = ::exitApplication,
            title = "libplayer-vlcj-example",
        ) {
            VlcjPlayerFrame(
                modifier = Modifier.fillMaxSize(),
                bridge = bridge,
            )
        }
    }
}