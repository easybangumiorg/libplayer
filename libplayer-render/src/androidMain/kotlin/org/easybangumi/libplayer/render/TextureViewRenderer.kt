package org.easybangumi.libplayer.render

import org.easybangumi.libplayer.api.PlayerBridge
import org.easybangumi.libplayer.api.renderer.Renderer

/**
 * Created by heyanlin on 2025/5/27.
 */
class TextureViewRenderer(
    val textureView: LPTextureView
): Renderer {

    override fun onBind(bridge: PlayerBridge) { }

    override fun onUnbind(bridge: PlayerBridge) { }



}