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

    // variable variable untuk menyimpan data yang di peroleh dari komonen UI

    var nama by remember { mutableSetOf("") }
    var alamat by remember { mutableSetOf("") }
    var jenis by remember { mutableSetOf("") }
}
