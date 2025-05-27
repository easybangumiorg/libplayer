package org.easybangumi.libplayer.render

import android.content.Context
import android.util.AttributeSet
import android.view.TextureView

/**
 * 1. 支持配置填充模式
 * 2. 支持自定义回调（exoplayer 会直接覆盖原有回调）
 * Created by heyanlin on 2025/5/27.
 */
class LPTextureView : TextureView {
    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)
    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int, defStyleRes: Int) : super(
        context,
        attrs,
        defStyleAttr,
        defStyleRes
    )
}