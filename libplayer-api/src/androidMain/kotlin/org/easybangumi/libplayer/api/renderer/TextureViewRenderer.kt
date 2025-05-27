package org.easybangumi.libplayer.api.renderer

import android.view.TextureView
import org.easybangumi.libplayer.api.PlayerBridge

/**
 * Created by heyanlin on 2025/5/27.
 */
class TextureViewRenderer(
    val textureView: TextureView
) : Renderer {

    override fun onBind(bridge: PlayerBridge) { }

    override fun onUnbind(bridge: PlayerBridge) { }
}