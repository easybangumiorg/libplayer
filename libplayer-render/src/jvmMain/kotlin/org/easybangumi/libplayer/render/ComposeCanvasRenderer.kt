package org.easybangumi.libplayer.render

import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.graphics.ImageBitmap
import org.easybangumi.libplayer.api.PlayerBridge
import org.easybangumi.libplayer.api.renderer.Renderer

/**
 * Created by heyanlin on 2025/5/27.
 */
class ComposeCanvasRenderer(): Renderer {

    val composeBitmap = mutableStateOf<ImageBitmap?>(null)

    override fun onBind(bridge: PlayerBridge) { }

    override fun onUnbind(bridge: PlayerBridge) { }


}