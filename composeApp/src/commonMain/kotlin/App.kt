import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import kustomize.composeapp.generated.resources.Res
import kustomize.composeapp.generated.resources.comet
import kustomize.composeapp.generated.resources.compose_multiplatform
import org.jetbrains.compose.resources.imageResource
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview


@Composable
@Preview
fun App(
//    typography: androidx.compose.material.Typography
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xff292A30)),
        contentAlignment = androidx.compose.ui.Alignment.Center
    ){
        Image(painterResource(Res.drawable.comet), null)

    }
//    MaterialTheme(
////        typography = typography,
//    ) {
//
//    }
}