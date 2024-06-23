import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.text.TextStyle
import kustomize.composeapp.generated.resources.Res
import kustomize.composeapp.generated.resources.comet
import org.jetbrains.compose.resources.imageResource
import org.jetbrains.compose.ui.tooling.preview.Preview


@Composable
@Preview
fun App(
//    typography: androidx.compose.material.Typography
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Black),
        contentAlignment = androidx.compose.ui.Alignment.Center
    ){
        imageResource(
            Res.drawable.comet,
        )
        Image(
            ImageBitmap = imageResource(Res.drawable.comet),
            contentDescription = "comet"
        )
    }
//    MaterialTheme(
////        typography = typography,
//    ) {
//
//    }
}