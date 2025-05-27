package org.easybangumi.libplayer.compose

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView
import org.easybangumi.libplayer.api.PlayerBridge
import org.easybangumi.libplayer.render.LPTextureView
import org.easybangumi.libplayer.render.TextureViewRenderer

/**
 * Created by heyanlin on 2025/5/27.
 */
@Composable
fun VideoSurface(
    modifier: Modifier = Modifier,
    playerBridge: PlayerBridge,
) {
    Box(
        modifier,
        contentAlignment = Alignment.Center
    ) {
        AndroidView(
            modifier = Modifier.fillMaxSize(),
            factory = { context ->
                LPTextureView(context).apply {
                    playerBridge.addRenderer(TextureViewRenderer(this))
                }
            },
            update = { view ->

            }
        )
    }
}