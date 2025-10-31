import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import java.lang.reflect.Modifier

@Composable
fun FormDataDiri(modifier: Modifier
){
    // variable-variable untuk mengingat nilai masukan dari keyboard

    var textNama by remember { mutableSetOf("") }
    var textAlamat by remember { mutableSetOf("") }
    var textJK by remember { mutableSetOf("") }
}