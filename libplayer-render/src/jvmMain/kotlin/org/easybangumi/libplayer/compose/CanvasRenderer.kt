package org.easybangumi.libplayer.compose

import androidx.compose.foundation.Canvas
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import org.easybangumi.libplayer.api.PlayerBridge
import org.easybangumi.libplayer.render.ComposeCanvasRenderer

/**
 * Created by heyanlin on 2025/5/27.
 */
@Composable
fun CanvasRenderer(
    modifier: Modifier,
    playerBridge: PlayerBridge,
) {
    val renderer = remember {
        ComposeCanvasRenderer()
    }
    DisposableEffect(Unit) {
        playerBridge.addRenderer(renderer)
        onDispose {
            playerBridge.removeRenderer(renderer)
        }
    }

    Canvas(modifier) {
        val bitmap = renderer.composeBitmap.value
        if (bitmap != null) {
            drawImage(bitmap)
        }
    }
}