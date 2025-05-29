import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.compose.ui.test.ExperimentalTestApi
import androidx.compose.ui.test.runComposeUiTest
import org.easybangumi.libplayer.api.MediaItem
import org.easybangumi.libplayer.vlcj.VlcjPlayerFrame
import org.easybangumi.libplayer.vlcj.VlcjPlayerBridge
import uk.co.caprica.vlcj.factory.MediaPlayerFactory
import kotlin.test.Test

/**
 * Created by heyanlin on 2025/5/29.
 */
class VlcPlayerFrameTest {
//
//    @get:Rule
//    val composeTestRule = createComposeRule()

    @OptIn(ExperimentalTestApi::class)
    @Test
    fun testFrame(){
        runComposeUiTest {
            val url = "http://vjs.zencdn.net/v/oceans.mp4"

            val bridge = VlcjPlayerBridge(MediaPlayerFactory(), null)
            bridge.setPlayWhenReady(true)
            bridge.prepare(MediaItem(uri = url))

            setContent {
                VlcjPlayerFrame(
                    modifier = Modifier.fillMaxSize(),
                    bridge = bridge,
                )
            }
//            this.waitForIdle()
            waitUntil(
                "forever",
                Int.MAX_VALUE.toLong()
            ) {
                false
            }
        }


    }
}