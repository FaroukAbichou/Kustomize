import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import org.jetbrains.compose.ui.tooling.preview.Preview


@Composable
@Preview
fun App(
    typography: androidx.compose.material.Typography
) {
    MaterialTheme(
        typography = typography,
    ) {

    }
}